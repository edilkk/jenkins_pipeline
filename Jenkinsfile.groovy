node {
    stage("Say Hello"){
        properties([pipelineTriggers([githubPush(), pollSCM('* * * * *')])])
        sh "echo Hello ${NAME}",
        sh "do something"
    }
}