package com.loblaw.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Products {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="upc")
	private int upc;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="low_stock_amount")
	private int lowStockAmount;
	
	@Column(name="cost")
	private float cost;
	
	@Column(name="msrp")
	private float msrp;
	
	@Column(name="provider")
	private String provider;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getLowStockAmount() {
		return lowStockAmount;
	}

	public void setLowStockAmount(int lowStockAmount) {
		this.lowStockAmount = lowStockAmount;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = (float)Math.round(cost*100)/100;
	}

	public float getMsrp() {
		return msrp;
	}

	public void setMsrp(float msrp) {
		this.msrp = (float)Math.round(msrp*100)/100;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Products() {
		super();
	}
	
	public Products(int productId, String name, int upc, int stock, int lowStockAmount, float cost, float msrp,
			String provider) {
		super();
		this.productId = productId;
		this.name = name;
		this.upc = upc;
		this.stock = stock;
		this.lowStockAmount = lowStockAmount;
		this.cost = cost;
		this.msrp = msrp;
		this.provider = provider;
	}
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", upc=" + upc + ", stock=" + stock
				+ ", lowStockAmount=" + lowStockAmount + ", cost=" + cost + ", msrp=" + msrp + ", provider=" + provider
				+ "]";
	}
}