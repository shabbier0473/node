def call(String command) {
	if (command == "as") 
	{
	    node {
        stage ('as'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn test"
            }
     }
     }
}
}
