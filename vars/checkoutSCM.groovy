#!/usr/bin/env groovy

def call(){
    git branch: 'main', url: 'https://github.com/malakwagdy/Automata_Project.git', credentialsId: 'github-cred'
}