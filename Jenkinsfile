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
                // sh 'mvn clean install'
                 script {
                    sh 'mvn clean install'
                }
            }
        }
        
      stage('cloud-com-stage-createImage') {
            steps{
                script {
                    //app = docker.build("docker build -t course-work.jar .")
                    sh 'docker build -t course-work.jar .'
                }
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
