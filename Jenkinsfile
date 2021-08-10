pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                echo 'Creating Repo'
                git branch: 'main', url: 'https://github.com/andres-uzeda/java-ui-test-framework02.git'
            }
        }
        stage('Install Dependencies'){
            steps{
                echo 'Running Framework'
                bat 'mvn test'
            }
        }
    }
}
