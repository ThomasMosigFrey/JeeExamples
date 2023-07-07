pipeline {
    agent any
    tools {
        maven 'maven393'
    }
    stages {
        stage('clean package') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('install') {
            steps {
                sh "mvn install"
            }
        }
        stage('style check') {
            steps {
                sh "echo mvn ..."
            }
        }
        stage('deploy to nexus') {
            steps {
                sh "echo mvn deploy"
            }
        }
     }
}