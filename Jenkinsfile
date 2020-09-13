pipeline {
    agent any
    environment {
                URL1 = "google.com"
            }
    stages {

         stage('My First Stage'){
            environment {
                            URL2 = "yahoo.com"
                         }
             steps {
                sh '''
                 echo Hello from First Stage
                 ls
                    echo Bye from First Stage
                     '''
                print "Hello from groovy"
                print "URL = " + URL1 +URL2
        }
    }
    }
}