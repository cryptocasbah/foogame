package com.foogame.crypto.service;

import com.lucadev.coinmarketcap.CoinMarketCap;
import com.lucadev.coinmarketcap.model.CoinMarket;
import com.lucadev.coinmarketcap.model.CoinMarketList;

public class CoinMarketCapService {

    public CoinMarketCapService() {

    }

    public void retrieveCoinPrice() {
        //All the markets
        CoinMarketList coinMarkets  = CoinMarketCap.ticker().get();
        coinMarkets.getMarkets().forEach(System.out::println);

        //find a market
        CoinMarket bitcoinMarket = coinMarkets.findMarket("bitcoin");
        System.out.println(bitcoinMarket.getPriceUSD());

        System.out.println("Specific Currency:");

        CoinMarket market = CoinMarketCap.ticker("litecoin").get();
        System.out.println(market);
    }
}
