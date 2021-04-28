package prob02;

public class Goods {
	private String good;
	private int price;
	private int count;
	
	public Goods() {
		
	}
	
	public Goods(String good, int price, int count) {
		this.good = good;
		this.price = price;
		this.count = count;
	}
	
	public String getGood() {
		return good;
	}
	public void setGood(String good) {
		this.good = good;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
