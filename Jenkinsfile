pipeline {
    agent any

    stages {
        stage('cloud-com-stage-build') {
            steps {
                echo 'Building..'
                maven(){
                    sh 'mvn -Dmaven.test.failure.ignore=true install' 
                }
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
}
