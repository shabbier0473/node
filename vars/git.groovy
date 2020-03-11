def call(String command) {
if (command == "scm") 
 {
node{
    parameters{
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'origin/master', name: 'BRANCH', type: 'PT_BRANCH'
        gitParameter name: 'TAG',type: 'PT_TAG', selectedValue: 'NONE'
    }
    stages{
        stage ('scm'){
            steps{
                git branch: 'devlop', credentialsId: 'git', url: 'https://github.com/shabbier0473/time-tracker.git'
            }
        }
    }
}
}
}
