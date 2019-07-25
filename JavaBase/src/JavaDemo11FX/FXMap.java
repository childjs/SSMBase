package JavaDemo11FX;

import java.util.HashMap;
import java.util.Map;

public class FXMap<K,V> {
	Map<K, V> map = new HashMap<K, V>();
	public void put(K k,V v){
		map.put(k, v);
	}
	public V get(K k){
		return map.get(k);
	}
	public static void main(String args[]){
		FXMap<Integer, String> fxm = new FXMap<Integer, String>();
		for (int i = 0; i < 5;i++){
			fxm.put(i, "put进入的值"+i);
		}
		for(int i = 0;i<fxm.map.size();i++){
			System.out.println(fxm.get(i));
		}
	}
}
