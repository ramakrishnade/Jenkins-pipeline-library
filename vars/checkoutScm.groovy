/**
 * Helper function to checkout a branch
 * @param  branch     the branch name
 * @param  repoUrl the targted repository name
 */
def call(Map gitParams)
{
    checkout([ 
        $class: 'GitSCM',
        branches: [[name: gitParams.branch]],
        doGenerateSubmoduleConfigurations: false,
        userRemoteConfigs: [[url: gitParams.repoUrl]]
    
    ])
}
