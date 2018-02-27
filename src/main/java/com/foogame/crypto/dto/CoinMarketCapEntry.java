package com.foogame.crypto.dto;

public class CoinMarketCapEntry {

    private int id;
    private String name;
    private String symbol;
    private int rank;
    private double priceUsd;
    private double priceBtc;
    private double dailyVolumeUsd;
    private double marketCapUsd;
    private double availableSupply;
    private double totalSupply;
    private double maxSupply;
    private double hourPercentChange;
    private double dayPercentChange;
    private double weekPercentChange;
    private long lastUpdated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public double getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(double priceBtc) {
        this.priceBtc = priceBtc;
    }

    public double getDailyVolumeUsd() {
        return dailyVolumeUsd;
    }

    public void setDailyVolumeUsd(double dailyVolumeUsd) {
        this.dailyVolumeUsd = dailyVolumeUsd;
    }

    public double getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(double marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public double getHourPercentChange() {
        return hourPercentChange;
    }

    public void setHourPercentChange(double hourPercentChange) {
        this.hourPercentChange = hourPercentChange;
    }

    public double getDayPercentChange() {
        return dayPercentChange;
    }

    public void setDayPercentChange(double dayPercentChange) {
        this.dayPercentChange = dayPercentChange;
    }

    public double getWeekPercentChange() {
        return weekPercentChange;
    }

    public void setWeekPercentChange(double weekPercentChange) {
        this.weekPercentChange = weekPercentChange;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
