def call(String command) {
               if(command=="hello")
               {
        node{
        label 'maven'
        ws '/home/maven/workspace/project'
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


