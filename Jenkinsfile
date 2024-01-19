pipeline {
    agent any
    tools {
        maven 'maven393'
    }
    stages {
        stage('deploy to nexus') {
            steps {
                 sh "mvn deploy -DskipTests"
            }
        }
    }
}