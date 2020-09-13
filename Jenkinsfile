pipeline {
    agent any
    environment {
                URL = "google.com"
            }
    stages {

         stage('My First Stage'){
             steps {
                sh '''
                 echo Hello from First Stage
                 ls
                    echo Bye from First Stage
                     '''
                print "Hello from groovy"
                print "URL = " + URL
        }
    }
    }
}