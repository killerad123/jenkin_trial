pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                bat 'javac HELLO.java'
            }
            post {
                success {
                    echo 'Build completed successfully.'
                }
                failure {
                    echo 'Build failed.'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                bat 'java HELLO'
            }
        }
    }

    post {
        always {
            echo "Build finished"
        }
    } 
}
