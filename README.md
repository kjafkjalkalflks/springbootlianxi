# springbootlianxi
自学spring boot前后端分离
1.springboot引入SpringDatajpa
（1）第一步：导入maven依赖
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
（2）yml配置文件中配置jpa信息
（3）建立表，数据库，这里抽取了公共类其中用到了@auditspringdatajpa的审计功能
 