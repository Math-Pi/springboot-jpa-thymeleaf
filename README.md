# springboot-jpa-thymeleaf
### Jpa和Thymeleaf的相关依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
### Jpa和Thymeleaf的相关配置
```properties
spring.jpa.properties.hibernate.hbm2ddl.auto=create
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql= true

spring.thymeleaf.cache=false
```
* 其中**propertiesspring.thymeleaf.cache=false**是关闭 Thymeleaf 的缓存，不然在开发过程中修改页面不会立刻生效需要重启，生产可配置为 true。
* **spring.jpa.properties.hibernate.hbm2ddl.auto=create**,create:启动hibernate时，自动删除原来的表，新建所有的表，所以每次启动后的以前数据都会丢失。
