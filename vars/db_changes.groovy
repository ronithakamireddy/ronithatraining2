def call(body) {
def pipelineParams = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = pipelineParams
body()
node {
env.email_recepients = pipelineParams.email
stage('window'){
  echo "something ${email_recepients}"
}
}
}
