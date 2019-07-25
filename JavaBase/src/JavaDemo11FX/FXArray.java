package JavaDemo11FX;

public class FXArray<T> {
	private T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	public static void main(String args[]){
		FXArray<String> fxa = new FXArray<String>();
		String[] array = {"测试1","测试2","测试3","测试4"};
		fxa.setArray(array);
		for (int i = 0 ;i < fxa.getArray().length;i++){
			System.out.println(fxa.getArray()[i]);
		}
	}
}
