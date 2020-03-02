def call(String command) {
	if (command == "sonar") 
	{
	    pipeline {
    agent any
    stages{
        stage ('sonarqube analysis'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn sonar:sonar"
            }
        }
    }
}
}
}
