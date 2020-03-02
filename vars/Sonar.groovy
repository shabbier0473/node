def call(String command) {
	if (command == "sonar")
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
