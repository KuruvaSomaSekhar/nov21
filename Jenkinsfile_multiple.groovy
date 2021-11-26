//declarative pipeline
pipeline{
    agent any
    parameters { string(name: 'SERVERIPS', defaultValue: '', description: '') }
    stages{
        stage("Multiple servers")
        {
            steps {
                sh """
                   IFS=',' read -ra ADDR <<< "${SERVERIPS}"
                    for ip in \"${ADDR[@]}\"; 
                    do
                    echo $ip
                     # process "$i"
                    done
                   
                   
                   """
            }
        }
    }
}