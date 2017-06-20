import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins


public String addLinuxNode(String agentName, int numOfExecutors) {

    DumbSlave dumb = new DumbSlave(agentName, "/home/jenkins", new JNLPLauncher())
    dumb.setNumExecutors(numOfExecutors)
    Jenkins.instance.addNode(dumb)

    return dumb.getComputer().getJnlpMac()
}

return this;