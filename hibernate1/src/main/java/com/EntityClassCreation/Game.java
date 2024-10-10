package com.EntityClassCreation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {
	@Id
	private int gameId;
	private String gameName;
	private String playerType;
	private String gameMode;
	
	//------------------------------------------------------------------\\
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	//------------------------------------------------------------------//
	
	
	
	//------------------------------------------------------------------\\
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getGameMode() {
		return gameMode;
	}
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}
	//------------------------------------------------------------------//


}
