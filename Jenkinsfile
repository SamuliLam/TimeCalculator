pipeline {
    agent any

        tools {
        maven 'Maven'
        git 'Default'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/SamuliLam/TimeCalculator.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                jacoco execPattern: '**/target/jacoco.exec'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/jacoco.exec'
        }
    }
}

