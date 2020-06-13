def call(String command) {
	if (command == "test") 
	{
        pipeline{
            agent any
            tools { maven "MAVEN_HOME" }
            stages{
                stage ("test"){
                    steps{
                        echo " test "
                    }
                }
            }
        }
}
}
