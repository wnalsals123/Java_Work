package car_race;

public class Car {
	int door = 4, seat = 5, cc;
	double x, y, q, w;
	String model, made;
	boolean gin = false;
	Car(String name, int bagi, int doors, double a, double b){
		model = name;
		cc = bagi;
		door = doors;
		x = a;
		y = b;
	}
	void info() {System.out.println(model + "ÀÔ´Ï´Ù.");}
	void start() {gin = true; System.out.println("~ºÎ¸ª~");}
	boolean move() {
		q = spurt();
		x = x + q;
		System.out.println(model + "at" + (int)x);
		return ingoal();
	}
	double spurt() {return (Math.random() - 0.3) * 30;}
	boolean ingoal() {return x > 200;}	
}