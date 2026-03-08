pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "ankitanallamilli/flipkart:latest"
        DOCKER_CREDENTIALS = "dockerhub-credentials"
    }

    stages {

        stage('Build WAR') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${DOCKER_IMAGE} ."
            }
        }

        stage('Push Docker Image') {
            steps {
                withDockerRegistry([credentialsId: 'dockerhub-credentials', url: 'https://index.docker.io/v1/']) {
                    sh "docker push ${DOCKER_IMAGE}"
                }
            }
        }

        stage('Deploy Container') {
            steps {
                sh '''
                docker rm -f flipkart-app || true
                docker run -d --name flipkart-app -p 8999:8080 ankitanallamilli/flipkart:latest
                '''
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
