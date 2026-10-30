#!/usr/bin/env groovy

def call(){
    git branch: 'main', url: 'https://github.com/malakwagdy/University-Management-System.git', credentialsId: 'github-cred'
}