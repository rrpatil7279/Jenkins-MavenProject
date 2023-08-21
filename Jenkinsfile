pipeline {
    agent any
    stages {
        stage('Cleaning Stage') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Testing Stage'){
            steps {
                bat "mvn test"
            }
        }
        stage('Packaging Stage') {
            steps {
                bat "mvn package"
            }
        }
        stage('Consolidated Results'){
            steps{
                input("Do you want to capture results?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
        stage('Email Build Stage'){
            steps{
                mail body: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - ${currentBuild.currentResult}\n\nCheck console output at ${env.BUILD_URL} to view the results", subject: "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - ${currentBuild.currentResult}", to: 'rpatil@issq.com'
            }
        }
    }
}
