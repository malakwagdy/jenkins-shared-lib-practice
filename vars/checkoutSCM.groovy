#!/usr/bin/env groovy

def call(){
    git branch: 'main', url: 'https://github.com/malakwagdy/jenkins_practice.git', credentialsId: 'github-cred'
}