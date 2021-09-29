package com.loblaw.test.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductDto {
	
	@NotNull(message = "Please include a ProductId")
	private Integer productId;
	@NotBlank(message = "Please include a name")
	private String name;
	@NotNull(message = "Please include a upc")
	private Integer upc;
	@NotNull(message = "Please include a stock")
	private Integer stock;
	@NotNull(message = "Please include a msrp")
	private Float msrp;
	
	
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
	
	public float getMsrp() {
		return msrp;
	}
	
	public void setMsrp(float msrp) {
		this.msrp = msrp;
	}
	
	public ProductDto() {
		super();
	}

	public ProductDto(int productId, String name, int upc, int stock, float msrp) {
		super();
		this.productId = productId;
		this.name = name;
		this.upc = upc;
		this.stock = stock;
		this.msrp = msrp;
	}

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", name=" + name + ", upc=" + upc + ", stock=" + stock + ", msrp="
				+ msrp + "]";
	}
	
}
