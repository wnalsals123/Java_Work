package car_race;

public class CarRace {
	Car one, two, three;
	CarRace(){
		one = new Car("프라이드", 1500, 4, 0, 0);
		two = new Car("페라리", 2000, 2, 0, 10);
		three = new Car("푸조", 2500, 4, 0, 20);
	}
	void rollcall() {one.info(); two.info(); three.info();}
	void start() {one.start(); two.start(); three.info();}
	void run() {
		Car winner = null;
		do {
			if(one.move() == true) winner = one;
			if(two.move() == true) winner = two;
			if(three.move() == true) winner = three;
		}while(winner == null);
		System.out.println("축! 오늘의 승자는 " );
		winner.info();
	}
	public static void main(String[] args) {
		CarRace match1 = new CarRace();
		match1.rollcall();
		match1.start();
		match1.run();
	}
}
