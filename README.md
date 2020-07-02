# Template for Pipeline JOb

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