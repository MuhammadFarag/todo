#!/usr/bin/env bash
./gradlew sonarqube \
  -Dsonar.projectKey=$SONAR_QUBE_PROJECT_KEY \
  -Dsonar.organization=muhammadfarag-github \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=$SONAR_QUBE_TOKEN \
  -Dsonar.pullrequest.base=master \
  -Dsonar.pullrequest.branch=$CI_COMMIT_REF_NAME \
  -Dsonar.pullrequest.key=29 \
  -Dsonar.pullrequest.provider=GitHub \
  -Dsonar.pullrequest.github.repository=muhammadfarag/todo

./gradlew build check sonarqube \
  -Dsonar.host.url=$SONAR_HOST_URL \
  -Dsonar.login=$SONAR_TOKEN \
  -Dsonar.analysis.buildNumber=$TRAVIS_BUILD_NUMBER \
  -Dsonar.analysis.pipeline=$TRAVIS_BUILD_NUMBER \
  -Dsonar.analysis.sha1=$TRAVIS_PULL_REQUEST_SHA  \
  -Dsonar.analysis.repository=$TRAVIS_REPO_SLUG \
  -Dsonar.analysis.prNumber=$TRAVIS_PULL_REQUEST \
  -Dsonar.branch.name=$TRAVIS_PULL_REQUEST_BRANCH \
  -Dsonar.branch.target=$TRAVIS_BRANCH