import hudson.model.*
def call(String command) {
if (command == "scm") 
 {
    pipeline {
    agent any
    stages {
        stage('SCM') {
            steps {
                git url: 'https://github.com/shabbier0473/time-tracker.git'
            }
        }
    }
}
}
}
