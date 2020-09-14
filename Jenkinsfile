pipeline {
    agent any
    environment {
                URL1 = "google.com"
            }
    parameters {
            string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

            text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

            booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

            choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

            password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
        }
        stages {
            stage('Example') {
                steps {
                    echo "Hello ${params.PERSON}"

                    echo "Biography: ${params.BIOGRAPHY}"

                    echo "Toggle: ${params.TOGGLE}"

                    echo "Choice: ${params.CHOICE}"

                    echo "Password: ${params.PASSWORD}"
                }
            }
        }
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
    }