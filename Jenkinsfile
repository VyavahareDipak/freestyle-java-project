pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                git branch:"main" , url:"https://github.com/VyavahareDipak/freestyle-java-project.git"
            }
        }
        stage("compile java code"){
            steps{
                bat "javac Main.java"
             
            }
        }
        stage("Run java code"){
            steps{
                   bat "java Main"
            }
        }
    }

    post{
        success{
            echo "Pipeline successful"

        }
        failure{

            echo "Pipeline Failed"

        }
    }
}