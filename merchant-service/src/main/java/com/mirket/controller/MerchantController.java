package com.mirket.controller;

import com.mirket.configuration.MerchantConfiguration;
import com.mirket.model.Merchant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MerchantController {

    private static final Logger logger = LoggerFactory.getLogger(MerchantController.class);

    @Autowired
    MerchantConfiguration merchantConfiguration;

    @GetMapping
    public ResponseEntity getMerchants() {
        logger.info("Merchant Service Server port : {}", merchantConfiguration.getPort());
        List<Merchant> merchantList = merchantConfiguration
                .getMerchants().stream()
                .map(name -> new Merchant(merchantConfiguration.getMerchants().indexOf(name), name))
                .collect(Collectors.toList());
        return ResponseEntity.ok(merchantList);
    }

    @GetMapping("message")
    public ResponseEntity getMessage() {
        return ResponseEntity.ok(merchantConfiguration.getMessage());
    }
}
