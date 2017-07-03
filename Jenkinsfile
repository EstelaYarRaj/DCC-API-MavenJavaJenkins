node {

    stages {
        stage('Read') {
            git url: 'https://github.com/EstelaYarRaj/DCC-API-MavenJavaJenkins.git'
            def mavenHome = tool 'MAVEN_HOME'
            steps { 
               echo 'Reading..'
            }
        stage('SonarQube analysis') {
            withSonarQubeEnv('My SonarQube Server') {
                 sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                 }
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
