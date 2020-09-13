def PROJECT_NAME = 'roboshop'
def CIJOBS = 'CIJOBS'

folder(PROJECT_NAME) {
    displayName(PROJECT_NAME)
    description(PROJECT_NAME + 'Project Folder')
}

folder(PROJECT_NAME + '/' +CIJOBS) {
    displayName(CIJOBS)
    description(PROJECT_NAME + 'Project' + CIJOBS + 'Folder')
}

pipelineJob(PROJECT_NAME +'/'+ CIJOBS + "/sample") {
    description('sample')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("https://github.com/amit7chauhan/Jenkins.git")
                                           }
                    branch("*/master")
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}
