package car_race;

public class CarRace {
	Car one, two, three;
	CarRace(){
		one = new Car("�����̵�", 1500, 4, 0, 0);
		two = new Car("���", 2000, 2, 0, 10);
		three = new Car("Ǫ��", 2500, 4, 0, 20);
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
		System.out.println("��! ������ ���ڴ� " );
		winner.info();
	}
	public static void main(String[] args) {
		CarRace match1 = new CarRace();
		match1.rollcall();
		match1.start();
		match1.run();
	}
}
