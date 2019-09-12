package com.eduit.spring.ws.service.config;


import com.eduit.spring.ws.repository.ItemRepository;
import com.eduit.spring.ws.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    //@Bean
    public ItemService itemService(ItemRepository itemRepository){
        return new ItemService(itemRepository);
    }

}
