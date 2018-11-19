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