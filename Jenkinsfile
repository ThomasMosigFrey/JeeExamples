pipeline {
    agent any
    tools {
        maven 'maven393'
    }
    stages {
        stage('clean package') {
            steps {
                sh "mvn clean package -DskipTests"
            }
        }
        stage('install') {
            steps {
                sh "mvn install -DskipTests"
            }
        }
        stage('style check') {
            steps {
                sh "echo mvn ... -DskipTests"
            }
        }
        stage('deploy to nexus') {
            steps {
                sh "echo mvn deploy -DskipTests"
            }
        }
     }
}