package com.equinte.DOTACholic.DAO;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("players")
public class Player {
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private int Id;
    private String name;
    private String[] nicknames;
}
