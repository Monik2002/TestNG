node {
    
    stage('Hello') {
        echo 'hello guys'
    }
    stage('git ckeckout') {
        git branch: 'main', url: 'https://github.com/devopswithdayanand/spring-petclinic-k8.git'
    }
    stage('build') {
        bat 'mvn clean package'
    }
}
