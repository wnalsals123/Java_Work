package Soccer_G;

class Player {
	Field f;
	int x, y;
	double dx, dy, speed;
	String name, team;
	Player(String 이름, String tm, Field f, int x0, int y0){
		name = 이름;
		x = x0;
		y = y0;
		team = tm;
		this.f = f;
	}
	int move(Ball b) {
		dash(b);
		x = x + (int)dx;
		y = y + (int)dy;
		int dist = (int)distence(b);
		System.out.print(name + " " + dist);
		return dist;
	}
	void dash(Ball b) {
		double dist = distence(b) + 1;
		speed = speed * 0.8 + randM(4);
		dx = (b.getX() - x) / dist * speed;
		dy = (b.getY() - y) / dist * speed;
	}
	double distence(Ball b) {
		double x2x = x - b.getX();
		double y2y = y - b.getY();
		return Math.sqrt(x2x * x2x + y2y * y2y);
	}
	void kick(Ball b) {
		double kx = dx * 2 + randM(10) - 5;
		double ky = dy * 2 + randM(8) - 5;
		b.fly(kx, ky);
		speed = speed / 2;
	}
	double randM(int M) {
		return Math.random() * M;
	}
	int getX() {return x;}
	int getY() {return y;}
}
