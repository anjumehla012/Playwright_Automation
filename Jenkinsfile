pipeline {
    agent any

    stages {

        stage('Check Project') {
            steps {
                bat '''
                    echo Checking project folder...
                    dir
                    echo Checking pom.xml...
                    dir pom.xml
                '''
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            echo 'Test execution completed'
        }
    }
}