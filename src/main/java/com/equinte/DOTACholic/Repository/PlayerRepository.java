package com.equinte.DOTACholic.Repository;

import com.equinte.DOTACholic.DAO.Player;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CassandraRepository<Player, Integer> {

}
