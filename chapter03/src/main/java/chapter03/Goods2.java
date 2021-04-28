package chapter03;

public class Goods2 {
	private int price;
	private String name;
	private int countSold;
	private int countStock;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public void showInfo() {
		System.out.println(
				"name: " + name + ", price: " + price + ", countStock: " + countStock + ", countSold: " + countSold);
	}

}
