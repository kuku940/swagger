## Swagger Codegen生成对象
详见[swagger-codegen](https://github.com/swagger-api/swagger-codegen)

    首先下载swagger-codegen-cli.jar
    
    java -jar swagger-codegen-cli-3.0.25.jar generate 
    --api-package cn.xiaoyu.client.api 
    --model-package cn.xiaoyu.client.model 
    --invoker-package cn.xiaoyu.client.invoker 
    --group-id cn.xiaoyu 
    --artifact-id springboot-generate-restclient 
    --artifact-version 0.0.1-SNAPSHOT 
    -i http://localhost:8888/v2/api-docs 
    -l java 
    -o ./tmp

## 参考
[Swagger 入门教程](https://www.5axxw.com/wiki/topic/galhwk)