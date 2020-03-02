def call(String command) {
	if (command == "test") 
	{
	    pipeline {
    agent any
    stages{
        stage ('unit test'){
            tools{ maven "MAVEN_HOME"}
            steps{
                sh "mvn test"
            }
        }
        stage("sonar"){
           tools{ maven "MAVEN_HOME"}
           steps{
               sh "mvn sonar:sonar"
           }
    }
}
}
}
