def gitUrl = "git://github.com/thomas-vogel444/jenkins-sci"


job('testJob') {
    scm {
        git(gitUrl)
    }
    steps{
        shell('echo "I am the walrus"')
    }
}