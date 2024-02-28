def(Map sonarParams)
{
    withSonarQubeEnv('$(sonarParams.SonarQube)') {
        sh "${sonarParams.scannerHome}/bin/sonar-scanner"
    }

}