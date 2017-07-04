node {
        stage('Read') 
        git url: 'https://github.com/EstelaYarRaj/DCC-API-MavenJavaJenkins.git'
        def mavenHome = tool 'M3'
            
        stage('Build') 
        bat "${mavenHome}\\bin\\mvn clean build"
        steps {
                echo 'Building..'  
            }
            
        stage('SonarQube analysis') 
       	steps {
                echo 'Analyzing..'  
            }
        withSonarQubeEnv('My SonarQube Server') {
            bat "${mavenHome}\\bin\\mvn sonar:sonar"
                 }
            
        
       
        stage('Test') 
        bat "${mavenHome}\\bin\\mvn clean test"            
             post {
                always {
                  junit "C:/Users/AB83732/Desktop/workspace/DCC-API-MavenJavaJenkins/target/surefire-reports/"
                }
            }            
       
  }
