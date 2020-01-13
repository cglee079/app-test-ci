pipeline {
    agent any

    stages {

        stage('Git Checkout') {
            steps {
                git(
                        url: 'https://github.com/cglee079/ci-test-app.git',
                        credentialsId: '578f04b4aef8b3507d02a0e4109eeb1513cc7210',
                        branch: 'master'
                )
            }
        }

        stage('Build') {
            steps {
                println "Build Started"
                sh "chmod +x gradlew"
                sh "./gradlew clean build"
                println "Build End"
            }
        }
    }
}
