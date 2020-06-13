def call(String command) {
	if (command == "Sonar")
	{
	    node {
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
