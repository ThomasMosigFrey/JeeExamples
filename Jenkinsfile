pipeline {
    agent any
    stages {
        stage('clean package') {
            steps {
                withMaven(name="maven393", jdk="jdk1.8") {
                    sh "mvn clean package"
                }
            }
        }
        stage('install') {
            steps {
                withMaven(name="maven393", jdk="jdk1.8") {
                    sh "mvn install"
                }
            }
        }
        stage('style check') {
            steps {
                withMaven(name="maven393", jdk="jdk1.8") {
                    sh "echo mvn ..."
                }
            }
        }
        stage('deploy to nexus') {
            steps {
                withMaven(name="maven393", jdk="jdk1.8") {
                    sh "echo mvn deploy"
                }
            }
        }
     }
}