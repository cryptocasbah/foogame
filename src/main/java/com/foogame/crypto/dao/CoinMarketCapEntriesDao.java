package com.foogame.crypto.dao;

import com.foogame.crypto.database.PostgresConnection;
import com.foogame.crypto.dto.CoinMarketCapEntry;
import com.foogame.crypto.mapper.CoinMarketCapEntryMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class CoinMarketCapEntriesDao {

    private NamedParameterJdbcTemplate template;

    public CoinMarketCapEntriesDao(PostgresConnection postgresConnection) {
        this.template = postgresConnection.createJdbcTemplate();
    }

    public List<CoinMarketCapEntry> getAllEntries() {
        String query = "SELECT id, name, symbol, rank, price_usd, price_btc, daily_volume_usd, market_cap_usd, " +
                "available_supply, total_supply, max_supply, hour_percent_change, day_percent_change,  " +
                "week_percent_change, last_updated " +
                "FROM coinmarketcap_entries " +
                "ORDER BY id DESC";

        MapSqlParameterSource parameter = new MapSqlParameterSource();

        List<CoinMarketCapEntry> coinMarketCapEntryList = template.query(query, parameter, new CoinMarketCapEntryMapper());
        if (coinMarketCapEntryList == null || coinMarketCapEntryList.isEmpty()) {
            return null;
        }

        return coinMarketCapEntryList;
    }

    public int addNewEntry(CoinMarketCapEntry coinMarketCapEntry) {
        String query = "INSERT INTO coinmarketcap_entries " +
                "(name, symbol, rank, price_usd, price_btc, daily_volume_usd, market_cap_usd, " +
                "available_supply, total_supply, max_supply, hour_percent_change, day_percent_change, " +
                "week_percent_change, last_updated) VALUES " +
                "(:customer_key, " +
                "to_timestamp(:mtime, 'YYYY-MM-DD HH24:MI:SS'), " +
                "to_timestamp(:btime, 'YYYY-MM-DD HH24:MI:SS'), " +
                ":customer_name, :total_records, :country)";

        return 0;
    }
}
