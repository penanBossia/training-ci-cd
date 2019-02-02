node('ubuntu-slave'){

    stage('checkout'){
        checkout([$class: 'GitSCM', branches: [[name: "*/$branch"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/mchekini/dial.git']]])
    }

    def gradle = './gradlew'

    ws("workspace/${env.JOB_NAME}/api"){


        stage('build'){
            sh 'chmod +x gradlew'
            sh "$gradle build -x test"
        }

    }
}
