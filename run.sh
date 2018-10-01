#!/usr/bin/env bash
set -e

#Stop And delete Old container
docker-compose down

#Build the project
mvn clean package docker:build

#Start containers
docker-compose up -d
