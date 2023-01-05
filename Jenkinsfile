pipeline {
    agent any
    
    tools{
        maven 'maven-3.8.7' 
    }
    
    parameters{
      
    }
    
    stages {
        stage('cloud-com-stage-init') {
            steps {
                echo 'inilitziling variables..'
    
            }
        }
        
        stage('cloud-com-stage-build') {
            steps {
                echo 'Building..'
                //sh 'mvn -Dmaven.test.failure.ignore=true install'    
                 sh 'mvn clean package'
            }
        }
        
        stage('cloud-com-stage-test') {
            steps {
                echo 'Testing..'
            }
        }
        
        stage('cloud-com-stage-deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post{
        always{
            echo '.......'
        }
        
        success{
            echo '.......'
        }
        
        failure{
            echo '.......'
        
        }
    
    }
}
