package cn.itsource.yougou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Admin
 * @version V1.0
 * @className ZuulGatewayApplication
 * @description TODO
 * @date 2019/5/11
 **/
@SpringBootApplication
@EnableZuulProxy //网关标志
@EnableEurekaClient //Eureka的标识客户端强烈
public class ZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
