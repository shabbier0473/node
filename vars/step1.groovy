def call(String command) {
if (command == "compile") 
 {
node{
    stage('compile'){
        ws ('/home/maven/workspace/shabbir'){
            def mavenHome = tool name : 'MAVEN_HOME' ,type: 'maven'
            sh "${mavenHome}/bin/mvn compile"
        }
        
    }
}
}
}
