pipeline {
  agent any

  environment {
    URL1 = "google.com"
  }

  stages {

    stage('My First Stage') {
      environment {
        URL2 = "yahoo.com"
      }
      steps {
        sh '''
          echo Hello from First Stage
          echo Bye from First Stage
        '''
        print "Hello from Groovy"
        print "URL = " + URL1 + URL2
      }
    }

    stage('My Second Stage') {
      steps {
        print "URL = " + URL2
      }
    }

  }
}