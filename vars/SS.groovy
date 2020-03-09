def call(String command) {
               if(command=="compile")
               {
               pipeline{
    agent{
        node{
        label 'maven'
        customWorkspace '/home/maven/workspace/stime=tracker'
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
}
}
