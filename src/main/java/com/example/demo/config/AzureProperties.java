package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@ConfigurationProperties(prefix = "azure")
@Validated
public class AzureProperties {

    @Valid
    public final Cosmos cosmos = new Cosmos();

    public Cosmos getCosmos()
    {
        return this.cosmos;
    }

    public static class Cosmos {
        public String key;

    public void setKey(String key) {
        this.key = key;
    }
    
    }
}