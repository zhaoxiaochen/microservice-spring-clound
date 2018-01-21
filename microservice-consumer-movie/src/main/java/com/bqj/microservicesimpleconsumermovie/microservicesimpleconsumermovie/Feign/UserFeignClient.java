package com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie.Feign;

import com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provider-user")
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findOne(@PathVariable("id") Long id);

}
