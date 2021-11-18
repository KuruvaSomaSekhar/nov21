//declarative pipeline
pipeline{
    agent any
    stages{
        stage("download artifact"){
            steps {
                println "Here I'm downloading artifacts from S3"
                
            }
        }
        stage("copy artifacts") {
            steps {
                println "Here I'm coping artifact from Jenkins to Tomcat servers"
            }
        }
    }
}