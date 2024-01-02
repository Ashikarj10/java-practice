package edu.training.eCart.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class Products {
	
	@Id
	private String id;
	private String Name;
	private String Des;
	private String Price;
	private String Quantity;
	private String Category;
	
	
	
	public Products() {
		super();
	}
	
	
	public Products(String id, String name, String des, String price, String quantity, String category) {
		super();
		this.id = id;
		this.Name = name;
		this.Des = des;
		this.Price = price;
		this.Quantity = quantity;
		this.Category = category;
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDes() {
		return Des;
	}
	public void setDescp(String des) {
		this.Des = des;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		this.Price = price;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		this.Quantity = quantity;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", Name=" + Name + ", Des=" + Des + ", Price=" + Price + ", Quantity=" + Quantity
				+ ", Category=" + Category + "]";
	}
	
	
	
	
	
	
}
