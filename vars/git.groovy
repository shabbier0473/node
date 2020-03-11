def call(String command) {
if (command == "scm") 
 {
node{
        stage ('scm'){
                git branch: 'devlop', credentialsId: 'git', url: 'https://github.com/shabbier0473/time-tracker.git'
        }
}
}
}
