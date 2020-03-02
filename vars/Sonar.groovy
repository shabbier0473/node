def call(String command) {
	if (command == "Sonar") 
	{

    stages{
	 agent any
        stage ('sonarqube analysis'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn sonar:sonar"
            }
        }
    }
}
}
