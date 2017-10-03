package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStk implements Serializable{
	
	public static final int ENTREE = 1;
	
	public static final int SORTIE = 2;
	
	@Id
	@GeneratedValue
	private Long idMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	
	private int typeMvt;
	
	
	public Date getDateMvt() {
		return dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public Article getRticle() {
		return rticle;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public void setRticle(Article rticle) {
		this.rticle = rticle;
	}

	@ManyToOne
	@JoinColumn(name="idArticle")	
	private Article rticle;

	public Long getIdMvtStk() {
		return idMvtStk;
	}

	public void setIdMvtStk(Long id) {
		this.idMvtStk = id;
	}
	

}
