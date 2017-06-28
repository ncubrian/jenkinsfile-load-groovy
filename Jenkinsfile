def nodeName = "slave-${env.JOB_NAME}-${env.BUILD_NUMBER}"
def numberOfExecutors = 1

node ('master') {
    
    stage 'checkout'
    git url: 'https://github.com/radu-matei/jenkinsfile-load-groovy'
    
    
    stage 'add jenkins node'
    def addNode = load("addNode.groovy")
    def secret = addNode.addLinuxNode(nodeName, numberOfExecutors)
    
    stage 'start jenkins node as docker container'
    def dockerCommand = 'docker run -itd --name ' + nodeName + ' jenkinsci/jnlp-slave -url http://172.17.0.4:8080 ' + secret + ' ' + nodeName
    sh dockerCommand
}

node (nodeName) {
    stage 'actual build'
    sh 'hostname'
}

node('master'){
    stage 'destory node'
    def dockerStopCommand = 'docker stop ' + nodeName
    sh dockerStopCommand
}
