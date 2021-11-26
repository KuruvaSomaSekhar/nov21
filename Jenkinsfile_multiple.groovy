//declarative pipeline
pipeline{
    agent any
    parameters { string(name: 'SERVERIPS', defaultValue: '', description: '') }
    stages{
        stage("Multiple servers")
        {
            steps {
                sh '''
                   IFS=',' read -ra ADDR <<< "${SERVERIPS}"
                    for ip in \"${ADDR[@]}\"; 
                    do
                    echo $ip
                    echo "Here we can use scp command"
                    ssh -o stricthostkeychecking=no -i /tmp/nov21nv.pem ec2-user@$ip "hostname"
                     # process "$i"
                    done
                   
                   
                   '''
            }
        }
    }
}