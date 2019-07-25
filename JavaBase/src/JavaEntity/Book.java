package JavaEntity;

public class Book {
	private String Name;
	private int price;
	public Book() {
		System.out.println("无参构造");
	}
	public Book(String Name, int price){
		this.Name = Name;
		this.price = price;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return Name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "书名 " + this.Name + "，价格：" + this.price;
	}
	
}
