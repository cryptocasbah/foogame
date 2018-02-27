package com.foogame.crypto.config;

import com.foogame.crypto.CoinMarketCapServiceApp;
import com.foogame.crypto.properties.DatabaseProperties;
import com.foogame.crypto.service.CoinMarketCapService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoinMarketCapServiceAppConfig {

    @Bean
    public DatabaseProperties databaseProperties() {
        return new DatabaseProperties();
    }

    @Bean
    public CoinMarketCapService coinMarketCapService() {
        return new CoinMarketCapService();
    }

    @Bean
    public CoinMarketCapServiceApp coinMarketCapServiceApp() {
        return new CoinMarketCapServiceApp(coinMarketCapService());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(new Object[]{CoinMarketCapServiceAppConfig.class});
        springApplication.run(args);
    }
}
