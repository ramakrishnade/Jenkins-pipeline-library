def()
{
    def scannerHome = tool 'SonarQube-5.0.1.3006';
    withSonarQubeEnv('SonarQube') {
        sh "${scannerHome}/bin/sonar-scanner"
    }

}