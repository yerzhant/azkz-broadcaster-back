#!/bin/zsh
export BACKEND_VERSION=0.1.0
./gradlew bootBuildImage --no-daemon
docker push reg.azan.kz/radio-back:$BACKEND_VERSION
