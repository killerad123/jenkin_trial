pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                bat 'javac HELLO.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat 'java HELLO'
            }
        }
    }
}
