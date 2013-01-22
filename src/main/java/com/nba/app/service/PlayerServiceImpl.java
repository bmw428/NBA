package com.nba.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.app.dao.PlayerDao;
import com.nba.app.domain.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	PlayerDao playerDao;

	@Override
	public void createPlayer(Player player) {
		playerDao.createPlayer(player);
	}

	@Override
	public Player getPlayer(int id) {
		return playerDao.getPlayer(id);
	}

	@Override
	public void updatePlayer(Player player) {
		playerDao.updatePlayer(player);
	}

	@Override
	public void deletePlayer(Player player) {
		playerDao.deletePlayer(player);
	}

	@Override
	public List<Player> getPlayers() {
		return playerDao.getPlayers();
	}

}
