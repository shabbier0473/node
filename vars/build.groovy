def call(String command) {
               if(command=="hello")
               {
    stages{
        stage ('compile'){
            tools{
                maven 'MAVEN_HOME'
            }
            steps{
                sh 'mvn compile'
            }
        }
    }
}
}

