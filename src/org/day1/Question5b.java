package org.day1;

public class Question5b {
	private void south() {
		System.out.println("South");
	}
	private void north() {
		System.out.println("North");
	}
	public static void main(String[] args) {
		Question5b data = new Question5b();
		data.south();
		data.north();
		Question5a info = new Question5a();
		info.english();
		info.tamil();
		info.hindi();
	}
}
