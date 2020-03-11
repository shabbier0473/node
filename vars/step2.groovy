def call(String command) {
if (command == "compile") 
 {
node{
    stage('build'){
        {
            def mavenHome = tool name : 'MAVEN_HOME' ,type: 'maven'
            sh "${mavenHome}/bin/mvn compile"
        }
        
    }
}
}
}
