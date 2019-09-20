package lwy94.hystrixfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HystrixFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignClientApplication.class, args);
    }

}
