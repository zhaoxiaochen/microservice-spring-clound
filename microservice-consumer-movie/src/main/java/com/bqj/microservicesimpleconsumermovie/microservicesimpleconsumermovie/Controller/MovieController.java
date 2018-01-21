package com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie.Controller;


import com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie.Feign.UserFeignClient;
import com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie.domain.User;
import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    private static final Logger log = Logger.getLogger(MovieController.class);


    @Autowired
    private UserFeignClient userFeignClient;

    /**
     * 负载均衡后就可以使用虚拟域名访问了,就不用再指定Ip 以及端口了，ribbon会自动的从Eureka server中获取。
     * @param id
     * @return
     */
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClient.findOne(id);
    }


}
