def call(String command) {
	if (command == "Sonar") 
	{
	    pipeline {
	        agent any
	        stages{
	            stage("sonar"){
	                tools{ maven "MAVEN_HOME" }
	                steps{
	                    sh "mvn sonar:sonar"
	                }
	            }
	        }
	    }
	}
}
}
