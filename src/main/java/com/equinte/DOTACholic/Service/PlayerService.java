package com.equinte.DOTACholic.Service;

import com.equinte.DOTACholic.DAO.Player;
import com.equinte.DOTACholic.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
