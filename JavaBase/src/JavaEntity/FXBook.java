package JavaEntity;
/**
 *泛型实体类 
 **/
public class FXBook<T> {
	private T Name;
	private T Desc;
	private T price;
	public T getPrice() {
		return price;
	}
	public void setPrice(T price) {
		this.price = price;
	}
	public T getName() {
		return Name;
	}
	public void setName(T name) {
		Name = name;
	}
	public T getDesc() {
		return Desc;
	}
	public void setDesc(T desc) {
		Desc = desc;
	}
}
