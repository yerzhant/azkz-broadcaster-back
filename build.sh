#!/bin/zsh
export BACKEND_VERSION=0.0.3
./gradlew bootBuildImage --no-daemon
docker push reg.azan.kz/radio-back:$BACKEND_VERSION
