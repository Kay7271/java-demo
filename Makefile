PROJECT_NAME=java-demo:v1.0
IMG ?= kay7271/${PROJECT_NAME}

all: docker-build docker-push

# Build the docker image
docker-build:
	docker build . -t ${IMG}

# Push the docker image
docker-push:
	docker push ${IMG}

mvn-clean:
	mvn clean

mvn-package:
	mvn package -D

