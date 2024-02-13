def call(String repository, String branch)
{
    git branch: "${branch}", url: "${repository}"
}
