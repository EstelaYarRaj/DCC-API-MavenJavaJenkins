node {

    stages {
        stage('Read') {
            git url: 'https://github.com/EstelaYarRaj/DCC-API-MavenJavaJenkins.git'
            def mavenHome = tool 'MAVEN_HOME'
            steps { 
               echo 'Reading..'
            }
        }
        stage('Build') {
            sh "C:\maven\bin\mvn clean build"
            steps {
                echo 'Building..'  
            }
        }
        stage('Test') {
          sh "C:\maven\bin\mvn clean test"
            steps {
                echo 'Testing..'
            }
             post {
                always {
                  junit "C:\Users\AB83732\Desktop\workspace\DCC-API-MavenJavaJenkins\target\surefire-reports\"
                }
            }            
        }
    }
}
