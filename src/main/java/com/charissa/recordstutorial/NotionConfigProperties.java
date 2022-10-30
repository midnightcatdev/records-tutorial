package com.charissa.recordstutorial;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "notion")
public record NotionConfigProperties(String apiUrl, String authToken) {

}
