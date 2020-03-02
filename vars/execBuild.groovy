def call(String command) {
	if (command == "build") 
	{
		pipeline {
			agent any
			stages 
			{
				stage("Build") 
				{
					tools { maven "MAVEN_HOME"}
					steps 
					{
						sh 'mvn install'
					}
				}	
			}
		}
	}
	else if(command == "deploy")
	{
		pipeline {
			agent any
			stages 
			{
				stage("Deploy") 
				{
					tools { maven "MAVEN_HOME"}
					steps 
					{
						sh "mvn deploy"
					}
				}	
			}
		}	
	}
	else
	{
		pipeline {
			agent any
			stages 
			{
				stage("Do Nothing") 
				{
					steps 
					{
						echo "Doing nothing"
					}
				}	
			}
		}		
	}
}
