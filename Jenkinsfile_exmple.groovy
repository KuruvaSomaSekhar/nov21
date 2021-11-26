pipeline {
    agent any
     parameters{
        //string(name: ENVIRONMENT_NAME , defaultValue:QA,description:"")
        string(name: 'ENVIRONMENT_NAME', defaultValue: '', description: '')
    }

    // ----------------

    stages {
        stage('Build Container') {
            steps {
                echo 'Building Container..'

                script {
                    if (${ENVIRONMENT_NAME} == 'QA') {
                        SERVERS = ["1.1.1.1",""]
                    } else if (${ENVIRONMENT_NAME} == 'DEV') {
                        SERVERS = ["1.1.2.1","1.1.2.2"]
                    }
                    println SERVERS.size()
                   // echo SERVERS
                }
                // echo 'Building Branch: ' + env.BRANCH_NAME
                // echo 'Build Number: ' + env.BUILD_NUMBER
                // echo 'Building Environment: ' + ENV_NAME

                // echo "Running your service with environemnt ${ENV_NAME} now"
            }
        }
    }
}