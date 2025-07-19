{
    pipeline{
        agent any
        stages{
            stage('Build'){
                steps{
                    echo 'Building...'
                    sh 'javac HELLO.java'
                }
           }
        stage('Test'){
            steps{
                echo 'Testing...'
                sh 'java HELLO'
            }
        }
        }
    }
}