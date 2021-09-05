package com.ticket.api_gateway.proxies;

import com.ticket.api_gateway.FeignConfig;
import com.ticket.api_gateway.dto.User;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="user-service", path = "users", configuration = FeignConfig.class)
@RibbonClient(name="user-service")
public interface UserProxy {

    @GetMapping("")
    List<User> home();
}
