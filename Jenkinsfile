pipeline {
    agent any

    environment {
        CI = 'true'
    }

    tools {
        maven "3.9.9"
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -version'
            }
        }
    }
}