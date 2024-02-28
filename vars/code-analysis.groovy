def(Map sonarParams)
{
    withSonarQubeEnv("${sonarParams.SonarQube}") {
        echo "${sonarParams.SonarQube}.${sonarParams.scannerHome}"
        sh "${sonarParams.scannerHome}/bin/sonar-scanner"
    }

}