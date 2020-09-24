package examples;


public class Pond {

	public static void main(String[] args) {
		String me = "June";
		
		Duck d1 = new Duck("Mobi",90/3, "Celery");
		Duck d2 = new Duck("Wolfgang", 60/3, "chesseBurgers");
		
		d1.waddle();
		d1.quack();
		System.out.println(d1.equals(d2));
		System.out.println(d1);
	}

}
