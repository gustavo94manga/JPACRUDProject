package com.skilldistillery.onepiececards.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="one_piece_card")
public class OnePieceCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String name;
	
	private String description;
	
	@Column(name="image_Url")
	private String imageUrl;
	
	@Column(name="card_type")
	private String cardType;
	
	private String attribute;
	
	@Column(name="don_cost")
	private Integer don;
	
	@Column(name="power_level")
	private Integer powerLevel;
	
	private double price;
	
	@Column(name="card_box")
	private String cardBox;
	
	public String getCardBox() {
		return cardBox;
	}

	public void setCardBox(String cardBox) {
		this.cardBox = cardBox;
	}

	@Column(name="last_name")
	private String lastName;
	
	private String color;
	
	private String rarity;
	

	
	public OnePieceCard() {}

	public OnePieceCard(int id, String name, String description, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public Integer getDon() {
		return don;
	}

	public void setDon(Integer don) {
		this.don = don;
	}

	public Integer getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(Integer powerLevel) {
		this.powerLevel = powerLevel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	@Override
	public String toString() {
		return "OnePieceCard [id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ ", cardType=" + cardType + ", attribute=" + attribute + ", don=" + don + ", powerLevel=" + powerLevel
				+ ", price=" + price + ", cardBox=" + cardBox + ", lastName=" + lastName + ", color=" + color
				+ ", rarity=" + rarity + "]";
	}

	
}
