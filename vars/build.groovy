def call(String command) {
	if (command == "hello") 
	{
    agent any
    stages{
        stage ('hi'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn validate"
            }
        }
    }
}
}
