node {

    sh 'ls'
    sh 'docker node ls'
    def externalMethod = load("externalMethod.groovy")
    externalMethod.lookAtThis("Steve")

    def externalCall = load("externalCall.groovy")
    externalCall("Steve")
}