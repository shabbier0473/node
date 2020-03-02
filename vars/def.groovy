def call (String command = "sonar:sonar" ) {
sh "mvn ${command}"
}
