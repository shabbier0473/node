def call(String command) {
if (command == "build") 
 {
node{
    stage('build'){
        ws ('/home/maven/workspace/project'){
            def mavenHome = tool name : 'MAVEN_HOME' ,type: 'maven'
            sh "${mavenHome}/bin/mvn install"
        }
        
    }
}
}
}
