node {
    stage("Say Hello"){
        properties([parameters([string(defaultValue: 'Ed', description: 'Please paste ur name', name: 'NAME', trim: false)]), pipelineTriggers([cron('* * * * *')])])
        sh "echo Hello ${NAME}"
    }
}