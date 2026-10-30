#!/usr/bin/env groovy

def call(){
    git branch: 'frontend', url: 'https://github.com/malakwagdy/DevFlow.git', credentialsId: 'github-cred'
}