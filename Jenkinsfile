pipeline {
    agent any

    stages {
        stage('cloud-com-stage-build') {
            steps {
                echo 'Building..'
                maven(){
                    sh 'mvn clean install'
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
