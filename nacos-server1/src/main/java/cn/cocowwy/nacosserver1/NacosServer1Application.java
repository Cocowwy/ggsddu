package cn.cocowwy.nacosserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.jws.WebService;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosServer1Application.class, args);
    }

}
