package io.github.massilva.rentabilidade.application.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.github.massilva.rentabilidade.application")
public class FeignConfiguration {

}
