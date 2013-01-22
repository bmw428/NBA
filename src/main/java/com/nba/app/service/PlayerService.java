package com.nba.app.service;

import java.util.List;

import com.nba.app.domain.Player;

public interface PlayerService {
	
	public void createPlayer(Player player);
	public Player getPlayer(int id);
	public void updatePlayer(Player player);
	public void deletePlayer(Player player);
	public List<Player> getPlayers();

}
