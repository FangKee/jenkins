#!groovy

def call(String type,Map map) {

    if (type == "test") {
        pipeline {

            agent {
                node {
                    label "${map.node}"
                }
            }


            //步骤设置
            stages {

                stage('测试') {
                    steps {
                        println "test"
                        }
                    }
                }

            }
        }
    }
}
