def PROJECT_NAME = 'roboshop'
def CIJOBS = 'CIJOBS'
def GIT_PREFIX = 'https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps48/_git'

folder(PROJECT_NAME) {
  displayName(PROJECT_NAME)
  description(PROJECT_NAME + 'Project Folder')
}

folder(PROJECT_NAME+'/'+CIJOBS) {
  displayName(CIJOBS)
  description(PROJECT_NAME + 'Project '+ CIJOBS +'Folder')
}


pipelineJob(PROJECT_NAME+'/'+CIJOBS+"/sample") {
  description('sample')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url(GIT_PREFIX+"/jenkins-seed-jobs")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}

