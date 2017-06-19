import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins


public String addLinuxNode(String agentName) {

    DumbSlave slave = new DumbSlave(agentName, "/home/jenkins", new JNLPLauncher())
    Jenkins.instance.addNode(dumb)

    return slave.getComputer().getJnlpMac()
}

return this;