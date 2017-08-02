<h1>Spring boot web starter example</h1>

<h3>pom.xml</h3>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>1.5.6.RELEASE</version>
</dependency>
```

<h3>Add a controller</h3>

```java
@RestController
public class TestController {

    @RequestMapping("/test/{name}")
    @ResponseBody
    public String getHello(@PathVariable("name") String name){
        return "Hello "+name;
    }
}
```

<h3>Main.java</h3>

```java
@SpringBootApplication
public class Main {

    public static void main(String [] args){
        SpringApplication.run(Main.class, args);
    }
}
```