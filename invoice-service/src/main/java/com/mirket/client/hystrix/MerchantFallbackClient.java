package com.mirket.client.hystrix;

import com.mirket.client.MerchantClient;
import com.mirket.client.model.Merchant;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MerchantFallbackClient implements MerchantClient {

    @Override
    public ResponseEntity<List<Merchant>> getMerchants() {
        return ResponseEntity.ok(Collections.singletonList(new Merchant(0, "Fake Merchant")));
    }

    @Override
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("no message");
    }
}
