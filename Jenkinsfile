pipeline {
  agent any

  environment {
    URL1 = "google.com"
  }

  stages {

    stage('My First Stage') {
      steps {
        sh '''
          echo Hello from First Stage
          echo Bye from First Stage
        '''
        print "Hello from Groovy"
        print "URL = " + URL1
      }
    }

  }
}