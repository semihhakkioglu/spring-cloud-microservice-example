package com.mirket.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RefreshScope
@Configuration
@ConfigurationProperties
public class MerchantConfiguration {

    @Value("${message:}")
    private String message;

    @Value("${merchants:}")
    private List<String> merchants;

    @Value("${server.port}")
    private String port;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<String> merchants) {
        this.merchants = merchants;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}

