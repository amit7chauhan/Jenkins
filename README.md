# Template for Pipeline JOb

INIT SCRIPTS: https://github.com/linuxautomations/jenkins-docker-groovy

```
pipelineJob("Terraform/RabbitMQ") {
  description('Terraform RabbitMQ Job')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://gitlab.com/batch47/terraform/roboshop/rabbitmq.git")
            credentials("GitUserPass")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}
```

#

## Lint URLS

```text
https://www.pylint.org/#install
https://www.npmjs.com/package/jslint
https://maven.apache.org/plugins/maven-checkstyle-plugin/
https://github.com/golang/lint
https://github.com/overtrue/phplint

```