def call(String repoUrl, String branch){
    branches: [[name: '*/${branch}']], 
    extensions: [], 
    userRemoteConfigs: [[url: '${repoUrl}']]
}
