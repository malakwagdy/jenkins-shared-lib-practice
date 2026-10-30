#!/usr/bin/env groovy

def call() {
    echo "Building the JAR file..."
    dir('./UMS') {
        sh "mvn clean package"
    }
}