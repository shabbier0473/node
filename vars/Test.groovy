def call(String command) {
	if (command == "test") 
	{
	    pipeline {
    agent any
    stage("unit test" {
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
