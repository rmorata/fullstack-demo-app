package com.example.fullstackdemo;

import jakarta.persistence.*;

@Entity
public class Boek {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getAantalExemplaren() {
		return aantalExemplaren;
	}

	public void setAantalExemplaren(int aantalExemplaren) {
		this.aantalExemplaren = aantalExemplaren;
	}

	public String getAfbeeldingURL() {
		return afbeeldingURL;
	}

	public void setAfbeeldingURL(String afbeeldingURL) {
		this.afbeeldingURL = afbeeldingURL;
	}

	@Column
	private String titel;

	@Column
	private String auteur;

	@Column
	private int aantalExemplaren;

	@Column
	private String afbeeldingURL;


}
