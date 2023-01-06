pipeline {
    agent any
    
    tools{
        maven 'maven' 
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
