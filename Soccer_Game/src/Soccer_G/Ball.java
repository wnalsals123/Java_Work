package Soccer_G;

class Ball {
	Field f;
	int x, y;
	double vx, vy;
	Ball(Field f){
		x = 0;
		vx = 0;
		y = 0;
		vy = 0;
		this.f = f;
	}
	void fly(double kx, double ky) {
		this.vx += kx;
		this.vy += ky;
	}
	void checkbounds() {
		if(y > f.getTop()) {vy = -vy; y = 2 * f.getTop() - y;}
		if(y < f.getBottom()) {vy = -vy; y = 2 * f.getBottom() - y;}
	}
	boolean move() {
		x = x + (int)vx;
		y = y + (int)vy;
		System.out.println("°ø(" + x + "," + y + ").");
		vx = vx * 0.8;
		vy = vy * 0.8;
		checkbounds();
		return (x > f.getRight()-1 || x < f.getLeft()+1);
	}
	void reset() {x= 0; y = 0; vx = 0; vy = 0;}
	int getX() {return x;}
	int getY() {return y;}
}