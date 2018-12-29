package practice;

import java.util.ArrayList;

public class Human {
	public static void main(String []args) {
		ArrayList<Hero> heroList = new ArrayList<>();
		Hero hero1 = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");
		heroList.add(hero1);
		heroList.add(hero2);

		for(Hero hero:heroList) {
			System.out.println(hero.getName());
		}
	}
}
