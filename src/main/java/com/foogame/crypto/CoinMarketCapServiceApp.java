package com.foogame.crypto;

import com.foogame.crypto.service.CoinMarketCapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinMarketCapServiceApp {

    private static Logger logger = LoggerFactory.getLogger(CoinMarketCapServiceApp.class);
    private CoinMarketCapService coinMarketCapService;

    public CoinMarketCapServiceApp(CoinMarketCapService coinMarketCapService) {
        this.coinMarketCapService = coinMarketCapService;
        run();
    }

    public void run() {
        this.coinMarketCapService.retrieveCoinPrice();
    }
}
