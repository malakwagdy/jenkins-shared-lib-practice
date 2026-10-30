#!/usr/bin/env groovy

def call(){
    git branch: 'main', url: 'https://github.com/malakwagdy/DevFlow.git', credentialsId: 'github-cred'
}