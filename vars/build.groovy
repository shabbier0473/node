def call(String command) {
	if (command == "hello") 
	{
	    pipeline {
    ageny any
    stage{
        stage ('hello'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn deploy"
            }
        }
    }
}
}
}
