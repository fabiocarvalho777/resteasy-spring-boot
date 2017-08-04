package com.sample.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.aop.PublisherAnnotationBeanPostProcessor;

/**
 * Created by facarvalho on 8/4/17.
 */
@Configuration
public class PublisherProcessorConfig {

    @Bean(name="publisherAnnotationBeanPostProcessor")
    public PublisherAnnotationBeanPostProcessor publisherAnnotationBeanPostProcessor() {
        return new PublisherAnnotationBeanPostProcessor();
    }

}
