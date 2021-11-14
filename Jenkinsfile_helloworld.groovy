//Scripted pipeline
//Declarative pipeline

pipeline {
    agent any

    stages {

        stage("Name") {
            steps {
                println "My Name is Soma Sekhar"
                println "I don't want to show my surname here"
            }

        }

        stage("age") {

            steps {
                println "I don't want to reveal"
            }

        }
    }

}