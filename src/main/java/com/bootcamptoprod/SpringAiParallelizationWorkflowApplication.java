package com.bootcamptoprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.spring.LogbookClientHttpRequestInterceptor;

@SpringBootApplication
public class SpringAiParallelizationWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiParallelizationWorkflowApplication.class, args);
    }

    // Enables logging of all outgoing HTTP requests made to the LLM API through Logbook
    @Bean
    public RestClientCustomizer restClientCustomizer(Logbook logbook) {
        return restClientBuilder -> restClientBuilder.requestInterceptor(new LogbookClientHttpRequestInterceptor(logbook));
    }

}
