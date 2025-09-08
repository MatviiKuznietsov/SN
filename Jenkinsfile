pipeline {
    agent any

    tools {
        maven 'Maven'   // Имя Maven из Manage Jenkins → Global Tool Configuration
        jdk 'Java21'     // Имя JDK из Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/MatviiKuznietsov/SN.git'
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
    }
}