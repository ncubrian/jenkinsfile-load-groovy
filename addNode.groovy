import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins


def addLinuxNode(String agentName) {

    DumbSlave dumb = new DumbSlave(agentName, "/home/jenkins", new JNLPLauncher())
    Jenkins.instance.addNode(dumb)
}

return this;