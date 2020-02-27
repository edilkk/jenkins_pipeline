node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: '54.187.181.98', description: '''Dev: 54.187.181.98 QA: 54.202.46.240 Prod: 52.41.241.15''', name: 'Remote_instance', trim: false)]), pipelineTriggers([cron('* * * * *')])])
        git 'https://github.com/edilkk/jenkins-test.git'

    }
}