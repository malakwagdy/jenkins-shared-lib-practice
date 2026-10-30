#!/usr/bin/env groovy

def call() {
    echo "Building the JAR file..."
    sh "go build -o my-app main.go"
}