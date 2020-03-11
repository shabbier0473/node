def call(String command) {
if (command == "compile") 
 {
node{
    stage('build'){
        ws ('/home/maven/workspace/project'){
            def mavenHome = tool name : 'MAVEN_HOME' ,type: 'maven'
            sh "${mavenHome}/bin/mvn compile"
        }
        
    }
}
}
}
