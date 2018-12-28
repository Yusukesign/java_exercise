package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String [] args) {
		Date now = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(now);
		int time = c1.get(Calendar.DAY_OF_YEAR);
		time = time + 100;
		c1.set(Calendar.DAY_OF_YEAR,time);
		Date date = c1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy/MM月/dd日");
		System.out.println(sdf.format(date));
//		Main main = new Main();
//		main.time();
	}
	public void time() {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy/MM月/dd日");
		System.out.println(f.format(time.plusDays(100)));
	}
}
