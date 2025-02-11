pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                git branch:"main" , url:"https://github.com/VyavahareDipak/freestyle-java-project.git"
            }
        }
        stage("build"){
            steps{
                sh "javac Main.java"
                sh "java Main"
            }
        }
        stage("deploy"){
            steps{
                echo "deploy successfully"
            }
        }
    }
}