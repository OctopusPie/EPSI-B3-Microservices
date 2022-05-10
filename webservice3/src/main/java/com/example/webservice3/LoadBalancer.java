package com.example.webservice3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancer {
    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/")
    public void method() {

        ServiceInstance serviceInstance = loadBalancer.choose("webservice1");

        System.out.println(serviceInstance.getUri());
    }
}
