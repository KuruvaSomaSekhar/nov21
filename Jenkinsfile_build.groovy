//Declarative pipeline
pipeline {
    agent any
    stages {
        stage("Checkout code") {
            steps {
                println "Clone our code to our repo"
            }
        }
        stage("Build code"){
            steps {
                println "mvn clean package"
            }
        }
        stage("Upload artifacts to s3"){
            steps {
                println "Uploading artifacts to s3 bucket"
            }
        }
    }
}