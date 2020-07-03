pipeline {
  agent any

  environment {
    URL1 = "google.com"
  }

  triggers { pollSCM('H/2 * * * *') }

  parameters {
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
  }

  tools {
    terraform 'terraform-0.11.14'
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
        // print "URL = " + URL2 // This will fail as the variable is local in another stage.
        print 'Second Stage'
        print 'Person Name - ' + PERSON
      }
    }

    stage('Terraform Version') {
      steps {
        sh 'terraform version'
      }
    }

  }
}