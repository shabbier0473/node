def call(String command) {
	if (command == "hello") 
	{
   node{
    sh 'mvn compile'
   }
}
}
