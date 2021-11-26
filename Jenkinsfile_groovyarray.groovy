//declarative pipeline
pipeline {
    agent any
    if(${ENV} == QA) {   
        SERVERS = ["1.1.1.1","1.1.1.2"]
    } else if(${ENV} == STAGE) {   
	    SERVERS = [1.1.2.1,1.1.2.2,1.1.2.3]  
    } else if(${ENV} == STAGE) { 	
	    SERVERS = [1.1.3.1,1.1.3.2]  
    } else {  
	    println "You didn't provide any environment"
    }
     parameters { 
        string(name: 'ENV', defaultValue: '', description: '') 
    }
    stages{
        stage("Parse array"){
            steps {
                println "This is empty line"
            }
                    }
    }
    
}