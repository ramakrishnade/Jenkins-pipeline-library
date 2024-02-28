def(){

    waitForQualityGate abortPipeline: false, credentialsId: 'SonarQube-Token'
}