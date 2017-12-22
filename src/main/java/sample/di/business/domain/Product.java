package sample.di.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private String name;
	private int price;
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
