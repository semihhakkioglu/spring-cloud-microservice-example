package com.mirket.client;

import com.mirket.client.hystrix.MerchantFallbackClient;
import com.mirket.client.model.Merchant;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "merchant-service", fallback = MerchantFallbackClient.class)
public interface MerchantClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ResponseEntity<List<Merchant>> getMerchants();

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    ResponseEntity<String> getMessage();
}

