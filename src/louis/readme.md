排除一些暂时不需要的模块
只留下核心模块`core`,`beans`,`aop`,`context`,`expression`和以上相关的模块，
暂时不加载一下模块`spring-aspects`,`spring-jdbc`,`spring-jms`,`spring-messaging`,`spring-orm`,`
spring-oxm`,`spring-text`,`spring-tx`,`spring-web`,`spring-webflux`,`spring-webmvc`,`spring-websocket`

依赖关系
    `spring-jcl`-->`spring-core`-->`spring-bean`-->
    
    
比较重要的几个接口
 1. FactoryBean
 2. BeanPostProcessor   
    BeanPostProcessor接口作用是：如果我们需要在Spring容器完成Bean的实例化、配置和其他的初始化前后添加一些自己的逻辑处理，我们就可以定义一个或者多个BeanPostProcessor接口的实现，然后注册到容器中。     