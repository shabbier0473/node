def call(String command) {
	if (command == "Sonar")
	{
	    pipeline{
	        agents any
	        stages{
	            stage ("sonar"){
	                steps{
	                    sh "mvn install"
	                }
	            }
	        }
	    }
	}
}
