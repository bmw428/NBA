package com.nba.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nba.app.domain.Player;
import com.nba.app.service.PlayerServiceImpl;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerServiceImpl playerService;
	
	@RequestMapping(value="/player/add", method=RequestMethod.POST)
	public void createPlayer(@RequestBody Player player) {
		playerService.createPlayer(player);
	}

	@RequestMapping(value="/player/{id}", method=RequestMethod.GET)
	public @ResponseBody Player getPlayer(@PathVariable("id") int id) {
		return playerService.getPlayer(id);
	}

	@RequestMapping(value="/player/update", method=RequestMethod.POST)
	public void updatePlayer(@RequestBody Player player) {
		playerService.updatePlayer(player);
	}

	@RequestMapping(value="/player/delete", method=RequestMethod.POST)
	public void deletePlayer(@RequestBody Player player) {
		playerService.deletePlayer(player);
	}

//	@RequestMapping(value="/players", method=RequestMethod.GET)
//	public @ResponseBody List<Player> getPlayers() {
//		return playerService.getPlayers();
//	}
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public ModelAndView getPlayers() {
		return new ModelAndView("players", "players", playerService.getPlayers());
	}

}
