package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private float prixa;
	private float prixv;
	private int numex;
	@ManyToOne
	@JoinColumn(name = "m_id")
	private  Magasin m;

	
	public Produit(Integer id, String description, float prixa, float prixv, int numex, Magasin m) {
		super();
		this.id = id;
		this.description = description;
		this.prixa = prixa;
		this.prixv = prixv;
		this.numex = numex;
		this.m = m;
	}
	public Produit() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrixa() {
		return prixa;
	}
	public void setPrixa(float prixa) {
		this.prixa = prixa;
	}
	public float getPrixv() {
		return prixv;
	}
	public void setPrixv(float prixv) {
		this.prixv = prixv;
	}
	public int getNumex() {
		return numex;
	}
	public void setNumex(int numex) {
		this.numex = numex;
	}
	public Magasin getM() {
		return m;
	}
	public void setM(Magasin m) {
		this.m = m;
	}
	
	

}
