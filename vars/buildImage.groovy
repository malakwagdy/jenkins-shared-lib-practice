#!/usr/bin/env groovy
def call() {
    echo "Building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh 'echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
        sh "docker build -t malakwagdy/devflow:latest ."
        sh "docker push malakwagdy/devflow:latest"
    }
}