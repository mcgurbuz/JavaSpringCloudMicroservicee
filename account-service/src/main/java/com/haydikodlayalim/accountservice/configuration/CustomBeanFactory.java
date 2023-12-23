package com.haydikodlayalim.accountservice.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring ayağa kalkarken bunu initilizea etsin
public class CustomBeanFactory {

    @Bean
    public ModelMapper getModelMapper(){
        //Projeme singlton modelMapper oluşuracağım.
        return new ModelMapper();
    }
}
