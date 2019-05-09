pipeline{
    agent any
    
    stages{
        stage('Parallel Stages') {
            parallel {
                stage('stage1') {
                    steps {
                        echo 'Hello World1'
                    }
                } 
                stage('stage2') {
                    steps {
                        echo 'Hello World2'
                        withMaven(globalMavenSettingsConfig: 'maven-o', jdk: 'jdk 8u212', maven: 'maven-3.6.1') {
                            sh 'mvn -version'
                        }
                     }
                } 
            }
        }
    }
}
