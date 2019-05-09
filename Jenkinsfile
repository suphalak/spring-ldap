pipeline{
    agent any
    
    stages{
                stage('stage1') {
                    steps {
                        echo 'Hello World1'
                         withMaven(globalMavenSettingsConfig: 'maven-o', jdk: 'jdk 8u212', maven: 'maven-3.6.1') {
                            sh 'mvn clean install' 
                        }
                    }
                } 
               
        }
    }

