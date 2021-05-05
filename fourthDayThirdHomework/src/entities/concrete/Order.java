package entities.concrete;

import java.time.LocalDate;

import entities.Entity;

public class Order implements Entity{

	private int id;
	private int customerId;
	private int campaignId;
	private int gameId;
	private LocalDate date;
	
	public Order(int id, int customerId, int campaignId, int gameId, LocalDate date) {
		
		this(id, customerId, gameId, date);
		this.campaignId = campaignId;
	}
	
	
public Order(int id, int customerId, int gameId, LocalDate date) {
		
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
