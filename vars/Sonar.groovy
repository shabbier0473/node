def call(String command) {
	if (command == "Sonar") 
	{
    stages{
        stage ('sonarqube analysis'){
            agent any
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn sonar:sonar"
            }
        }
    }
}
}
