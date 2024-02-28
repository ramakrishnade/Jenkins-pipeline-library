def(SonarQube,scannerHome)
{
    withSonarQubeEnv('$(SonarQube)') {
        sh "${scannerHome}/bin/sonar-scanner"
    }

}