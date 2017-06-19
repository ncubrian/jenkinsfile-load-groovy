import hudson.model.Node.Mode
import hudson.slaves.*
import jenkins.model.Jenkins


def addLinuxNode(String agentName) {

    DumbSlave dumb = new DumbSlave(agentName,  // Agent name, usually matches the host computer's machine name
            "",           // Agent description
            "/home/jenkins",                  // Workspace on the agent's computer
            2,             // Number of executors
            Mode.EXCLUSIVE,             // "Usage" field, EXCLUSIVE is "only tied to node", NORMAL is "any"
            "linux-docker",             // Labels
            new JNLPLauncher(),         // Launch strategy, JNLP is the Java Web Start setting services use
            RetentionStrategy.INSTANCE) // Is the "Availability" field and INSTANCE means "Always"

    Jenkins.instance.addNode(dumb)
}

return this;