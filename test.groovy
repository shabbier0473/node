def call(String command) {
	if (command == "test") 
	{
    node{
        stage ('hello'){
            echo "hello test"
        }
    }
}
}
