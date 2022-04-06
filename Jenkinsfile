
//String workspace = "/opt/jenkins/workspace"

//pipeline
pipeline {
    agent any
//    agent { pode { label "master"   //指定运行节点的标签或名称
//                    customWorkspace "${workspace}"  //指定运行工作目录（可选）

//            }
//    }

//    options {
//        timestamps()    //日志时间
//        skipDefaultCheckout()   //删除隐式checkout scm语句
//        disableComcurrentBuilds()   //禁止并行
//        timeout(time: 1, unit: 'HOURS') //流水线超时时间设置1h
//    }

    stages {
        //下载代码
        stage("GetCode"){ //阶段名称
            steps { //步骤
                timeout(time: 3, unit: 'MINUTES') {   //步骤超时时间
                    script{ //填写运行代码
                        println('获取代码')
                        }
                
                }
            
            }


        }

        //构建
        stage("Build"){
            steps{
                timeout(time: 3, unit: 'MINUTES') {
                    script{
                        println('应用打包')
                    }
                }
            }
        }
        //代码扫描
        stage("CodeScan"){
            steps{
                timeout(time: 3, unit: 'MINUTES') {
                    script{
                        println("代码扫描")
                    }
                }
            }
        }

        //构建后操作
    }
	post {
        always {
            script{
                println("always")
            }
        }
        success{
            script{
                currentBuild.description += "\n 构建失败！"
            }
        }

        aborted {
            script{
                currentBuild.description += "\n 构建取消！"
            }

        }
    }
}
