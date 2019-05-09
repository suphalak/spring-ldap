pipeline{
    agent any
    parameters {
  booleanParam defaultValue: true, description: '', name: 'mavenClean'
        booleanParam defaultValue: true, description: '', name: 'mavenInstall'
    }
            
    stages{
                stage('clean') {
                    when { 
                expression { 
                    return params.mavenClean
                } 
                    }
                    steps {
                        
                        
                         withMaven(globalMavenSettingsConfig: 'maven-o', jdk: 'jdk 8u212', maven: 'maven-3.6.1') {
                            sh 'mvn clean' 
                        }
                    }
                } 
        
         stage('install') {
                    when { 
                expression { 
                    return params.mavenInstall
                } 
                    }
                    steps {
                        
                        
                         withMaven(globalMavenSettingsConfig: 'maven-o', jdk: 'jdk 8u212', maven: 'maven-3.6.1') {
                            sh 'mvn install' 
                        }
                    }
                } 
               
        }
    }

