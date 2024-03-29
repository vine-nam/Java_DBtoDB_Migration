package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Com {
	static SimpleDateFormat dateFormat = new SimpleDateFormat("[HH:mm:ss] ");

	static void printLog(String text) {
		printDate();
		System.out.println(text);
	}

	static void printErrorLog(String text) {
		printDate();
		System.out.print("[ERROR] ");
		System.out.println(text);
	}

	static void printWarnLog(String text) {
		printDate();
		System.out.print("[WARN] ");
		System.out.println(text);
	}
	
	static void printDate() {
		System.out.print(dateFormat.format(new Date()));
	}
}
