def call(body) {
def pipelineParams = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = pipelineParams
body()
node {

stage('window'){
echo "something"
}
}
}