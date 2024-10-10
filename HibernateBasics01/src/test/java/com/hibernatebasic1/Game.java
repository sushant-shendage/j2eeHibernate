
package com.hibernatebasic1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game{
	@Id
	private int    gId;
	private String gameName;
	private String gameType;
	private String player;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	
	
	
	
}
