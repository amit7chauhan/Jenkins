folder('roboshop') {
    displayName('roboshop')
    description('Roboshop Project Folder')
}

folder('roboshop/CIJOBS') {
    displayName('ffCIJOBS')
    description('Roboshop Project CI JOBS Folder')
}

pipelineJob("roboshop/CIJOBS/sample") {
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
