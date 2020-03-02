def call(String options= 'sonar:sonar' ) {
     sh "mvn ${options}"
	 }
