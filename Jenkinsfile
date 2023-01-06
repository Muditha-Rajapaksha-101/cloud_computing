pipeline {
    agent any
    
    
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
                // sh 'mvn clean package'
                 sh 'mvn clean install'
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
