package com.fengyue.vesta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource( locations = { "classpath:spring/vesta-service.xml" } )
public class IdServiceConfig {
}
