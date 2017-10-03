package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Article implements Serializable {

	@Id
	@GeneratedValue
	private Long idArticle;
	private String codeArticle;

	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTva;
	private BigDecimal prixUnitaireTTC;

	private String photo;
	
	public Article() {
		
	}
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;

	public String getCodeArticle() {
		return codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

}
