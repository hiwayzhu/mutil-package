README
===========================
1.在一个project下面有3个模块，服务api-a，服务api-b，以及基础模块base。<br>
2.服务a和服务b会调用基础模块base<br>

***

# 注意事项
1.base模块的pom文件不能有<build>属性。<br>
2.服务a，服务b要引入基础模块<br>
```Java
<dependency>
  <groupId>com.example</groupId>
  <artifactId>base</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
