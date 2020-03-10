def call(String command) {
               if(command=="hello")
               {
        node{
        label 'maven'
        }
    }
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


