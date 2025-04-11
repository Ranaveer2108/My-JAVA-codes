package com.collection;

import java.util.Objects;

public class Product implement ProductApp{
        private Integer productId;
        private String productName;
        private Integer price;
        private String category;
		public Product(Integer productId, String productName, Integer price, String category) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.category = category;
		}
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
          
		
		
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
					+ ", category=" + category + "]";
		}
		@Override
		public int compareTo(Product p) {
			if(this.productId>p.productId)
				return 1;
			else if(this.productId>p.productId)
				return -1;
			else
				return 0;
			
		}
		@Override
		public int hashCode() {
			return Objects.hash(productId);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(productId, other.productId);
		}

	
	}


