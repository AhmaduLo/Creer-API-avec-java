package com.example.demo.entity;



import java.util.Date;

public class Inscrit {
	
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	
	//***************************************
	public Inscrit(int id, String nom, String prenom, Date dateNaissance, String email) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
	}

	
	public Inscrit() {
		super();
		// TODO Auto-generated constructor stub
	}
	//****************************************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//***************************************************************


	@Override
	public String toString() {
		return "Inscrit [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", email=" + email + "]";
	}
	
	//******************************************************************************
	
	
	
	
	
	
	
	
	

}

