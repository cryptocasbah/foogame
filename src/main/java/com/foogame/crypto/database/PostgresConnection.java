package com.foogame.crypto.database;

import com.foogame.crypto.properties.DatabaseProperties;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@EnableConfigurationProperties(DatabaseProperties.class)
public class PostgresConnection {

    private DatabaseProperties databaseProperties;

    public PostgresConnection(DatabaseProperties databaseProperties) {
        this.databaseProperties = databaseProperties;
    }

    public NamedParameterJdbcTemplate createJdbcTemplate() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();

        dataSource.setServerName(databaseProperties.getHost());
        dataSource.setPortNumber(databaseProperties.getPort());
        dataSource.setDatabaseName(databaseProperties.getDatabase());
        dataSource.setUser(databaseProperties.getUsername());
        dataSource.setPassword(databaseProperties.getPassword());

        return new NamedParameterJdbcTemplate(dataSource);
    }
}
