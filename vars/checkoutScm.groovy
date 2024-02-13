def call(String repository, String branch)
{
    echo "${repository}"
    git url: "${repository}"
}
