import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins


public String addLinuxNode(String agentName) {

    DumbSlave dumb = new DumbSlave(agentName, "/home/jenkins", new JNLPLauncher())
    Jenkins.instance.addNode(dumb)

    return dumb.getComputer().getJnlpMac()
}

return this;