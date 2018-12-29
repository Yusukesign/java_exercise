package practice;

import java.util.HashMap;
import java.util.Map;

public class Superman {
	public static void main(String []args) {
		Map<Integer,Hero> map = new HashMap<>();
		Hero hero1 = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");

		map.put(3, hero1);
		map.put(7, hero2);

		for(Integer key:map.keySet()) {
			Hero value = map.get(key);
			System.out.println(value.getName() + "が倒した敵=" + key);
		}
	}
}
