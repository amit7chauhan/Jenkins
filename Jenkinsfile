pipeline {
  agent any
  stages {

    environment {
      URL = "google.com"
    }

    stage('My First Stage') {
      steps {
        sh '''
          echo Hello from First Stage
          echo Bye from First Stage
        '''
        print "Hello from Groovy"
        print "URL = " + URL
      }
    }

  }
}