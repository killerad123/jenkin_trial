pipeline {
    agent any
    parameters {
        string(name: 'arg', defaultValue: 'default value', description: 'Name to greet')
    }
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
        stage('Approval'){
            steps {
                input message: 'Do you approve the build?', ok: 'Yes, proceed'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat "java HELLO ${params.arg}"
            }
        }
    }

    post {
        always {
            echo "Build finished"
        }
    } 
}
