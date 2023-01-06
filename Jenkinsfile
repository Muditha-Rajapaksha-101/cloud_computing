pipeline {
    agent any
    
    environment {
        registryCredential = "docker"
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
                    app = docker.build("course-work.jar:/course-work")
                    //sh 'docker build -t course-work.jar .'
                }
            }
        }
        
        
    stage(‘Deploy’) {
        steps{
            script {
                docker.withRegistry( "https://registry.hub.docker.com", registryCredential ) {
                    // dockerImage.push()
                    app.push("latest")
                }
            }
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
