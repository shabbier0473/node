def call(String command) {
               if(command=="hello")
               {
        node{
        label 'maven'
        customWorkspace '/home/maven/workspace/project'
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


