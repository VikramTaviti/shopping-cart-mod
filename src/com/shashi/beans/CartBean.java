package com.shashi.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartBean implements Serializable {

	public CartBean() {
	}

	public String userId;

	public String prodId;

	public int quantity;

	public int prodName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProdName() {
		return prodName;
	}

	public void setProdName(int prodName) {
		this.prodName = prodName;
	}

	public CartBean(String userId, String prodId, int quantity, int prodName) {
		this.userId = userId;
		this.prodId = prodId;
		this.quantity = quantity;
		this.prodName = prodName;
	}

}
