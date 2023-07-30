package com.equinte.DOTACholic.Controller;

import com.equinte.DOTACholic.DAO.Player;
import com.equinte.DOTACholic.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping(value = "save")
    public void savePlayer(Player player){
        playerService.savePlayer(player);
    }

    @GetMapping(value = "getAll")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }
}
