def call(String command) {
	if (command == "hello") 
	{
	    pipeline {
    agent any
    stages{
        stage ('hello'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn validate"
            }
        }
    }
}
}
}
