package com.pack1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GameUser {
	@Id
	int userId;
	String userName;
	int score;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public GameUser() {
		super();
	}

}
