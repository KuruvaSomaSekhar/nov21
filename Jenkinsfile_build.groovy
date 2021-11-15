//Declarative pipeline
pipeline {
    agent any
    stages {
        stage("Checkout code") {
            steps {
                println "Clone our code to our repo"
                sh "ls -l"
                checkout([$class: 'GitSCM',branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[ url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git']]])
                sh "ls -lart ./*"
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
                sh "echo $BUILD_NUMBER"
                sh "aws s3 cp target/hello-$BUILD_NUMBER.war s3://somuart/"
            }
        }
    }
}