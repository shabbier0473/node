def call(String command) {
	if (command == "test") 
	{
	    pipeline {
    ageny any
    stage{
        stage ('test'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn test"
            }
        }
    }
}
}
}
