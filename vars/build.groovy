def call(String command) {
	if (command == "hello") 
	{
	    pipeline {
    ageny any
    stage{
        stage ('hi'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn deploy"
            }
        }
    }
}
}
}
