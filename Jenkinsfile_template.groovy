//Declarative pipeline
pipeline {
    agent any
    stages {
        stage("clone code") {
            steps {
                println "Here I'm cloning the code"
            }
        }
        stage("Build code") {
            steps {
                println "Here I'm buidling the code using -- mvn clean package"
            }
        }
        stage("Upload artifacts to s3") {
            steps {
                println "Here I'm uploading artifacts to - S3 bucket"
            }
        }

        stage("Deployment") {
            steps{
                println "Here I'm deploying the code to tomcat servers"
            }
        }
    }
}