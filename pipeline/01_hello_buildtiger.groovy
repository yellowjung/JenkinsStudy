pipeline{
    agent any
    stages {
       stage('hello buildtiger'){
            steps{
                echo 'hello buildtiger'
            }
        } 
    }
}
