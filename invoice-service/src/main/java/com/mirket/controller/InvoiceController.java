package com.mirket.controller;

import com.mirket.client.MerchantClient;
import com.mirket.client.model.Merchant;
import com.mirket.config.InvoiceConfiguration;
import com.mirket.model.Invoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    MerchantClient merchantClient;

    @Autowired
    InvoiceConfiguration invoiceConfiguration;

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Integer id) {
        ResponseEntity<List<Merchant>> merchantEntities = merchantClient.getMerchants();
        Merchant merchant = merchantEntities.getBody().stream().filter(m -> m.getId().equals(id)).findFirst().orElseGet(() -> merchantEntities.getBody().stream().findFirst().get());
        return ResponseEntity.ok(new Invoice(merchant, BigDecimal.TEN.multiply(BigDecimal.valueOf(id)), invoiceConfiguration.getCurrency()));
    }

    @GetMapping
    public ResponseEntity getMessage() {
        return ResponseEntity.ok(merchantClient.getMessage());
    }
}
