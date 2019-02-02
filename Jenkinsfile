node('agent-docker'){

    stage('checkout'){
        checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '6ff6b0c4-d9ed-4bca-b9eb-adafcae78253', url: 'http://172.20.0.4/root/devops-api.git']]]) }

    def gradle = './gradlew'

    ws("workspace/${env.JOB_NAME}/api"){


        stage('build'){
            sh 'chmod +x gradlew'
            sh "$gradle build -x test"
        }

    }
}
