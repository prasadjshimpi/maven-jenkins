pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    post 
    {
        always 
        {
            mail to: 'testauto5010@gmail.com',
            subject: "Office Pipeline: ${currentBuild.fullDisplayName}",
            body: "Build : ${env.BUILD_URL}"
        }
    }
}
