def call(String command) {
	if (command == "deploy") 
	{
	    pipeline {
    ageny any
    stage{
        stage ('deploy'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn deploy"
            }
        }
    }
}
}
}
