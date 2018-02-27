package com.foogame.crypto.mapper;

import com.foogame.crypto.dto.CoinMarketCapEntry;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CoinMarketCapEntryMapper implements RowMapper<CoinMarketCapEntry> {

    public CoinMarketCapEntry mapRow(ResultSet rs, int numRow) throws SQLException {
        CoinMarketCapEntry coinMarketCapEntry = new CoinMarketCapEntry();

        ResultSetMetaData rsMetaData = rs.getMetaData();
        int numberOfColumns = rsMetaData.getColumnCount();

        for (int i = 1; i < numberOfColumns + 1; i++) {
            String columnName = rsMetaData.getColumnName(i);

            if ("id".equals(columnName)) {
                coinMarketCapEntry.setId(rs.getInt("id"));
            }

            if ("id".equals(columnName)) {
                coinMarketCapEntry.setId(rs.getInt("id"));
            }
        }

        return coinMarketCapEntry;
    }
}
