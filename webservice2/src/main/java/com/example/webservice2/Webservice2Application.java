package com.example.webservice2;
<<<<<<< Updated upstream
=======

import org.springframework.cloud.client.discovery.DiscoveryClient;
>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
<<<<<<< Updated upstream
import org.springframework.cloud.client.discovery.DiscoveryClient;
=======
>>>>>>> Stashed changes
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class Webservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(Webservice2Application.class, args);
    }

    @RestController
    public class FrontwebserviceApplication {
        @Autowired
        DiscoveryClient discoveryClient;
        @GetMapping("/")
        public String hello() {
<<<<<<< Updated upstream
            List<ServiceInstance> instances = discoveryClient.getInstances("name-of-the-microservice1");
=======
            List<ServiceInstance> instances = discoveryClient.getInstances("name-of-the- microservice1");
>>>>>>> Stashed changes
            ServiceInstance test = instances.get(0);
            String hostname = test.getHost();
            int port = test.getPort();
            RestTemplate restTemplate = new RestTemplate();
            String microservice1Address = "http://" + hostname + ":" + port;
            ResponseEntity<String> response =
                    restTemplate.getForEntity(microservice1Address, String.class);
            String s = response.getBody();
            return s;
        }
    }

}
