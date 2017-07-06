node {
        stage('Read') 
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'f3d1d799-0d7a-47da-885d-a8d4d32dd5c3', url: 'https://github.com/EstelaYarRaj/DCC-API-MavenJavaJenkins.git']]])
        def mavenHome = tool 'M3'
            
        stage ('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true package' 
            }
            post {
                always {
                  junit 'C:/Users/AB83732/Desktop/workspace/DCC-API-MavenJavaJenkins/target/surefire-reports/'
                }
            }                   
        }
  }
