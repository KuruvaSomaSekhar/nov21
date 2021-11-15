//Declarative pipeline
pipeline {
    agent any
    stages {
        stage("Checkout code") {
            steps {
                println "Clone our code to our repo"
                sh "ls -l"
            }
        }
        stage("Build code"){
            steps {
                println "mvn clean package"
                sh "mvn clean package"
                sh "ls -l target/"
            }
        }
        stage("Upload artifacts to S3"){
            steps {
                println "Uploading artifacts to s3 bucket"
            }
        }
    }
}