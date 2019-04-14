package Soccer_G;

public class Soccer {
	Field field;
	Ball ball;
	Player p, q, r;
	boolean timeout, goal;
	int clock;
	
	public static void main(String[] args) {
		new Soccer();
	}
	Soccer(){
		field = new Field(128, 96);
		ball = new Ball(field);
		p = new Player("손", "P", field, -50, 10);
		q = new Player("기", "P", field, 50, -10);
		start();
	}
	
	void start() {
		System.out.println("* START *");
		timeout = false;
		run();
	}
	
	void stop() {
		timeout = true;
	}
	
	void show() {			/* member variables: {field, b, p, q} */
		int dH = 10, dW = 3;	/* 운동장 cell dimension: dHxdW */
		int bx = ball.getX() / dW;
		int by = ball.getY() / dH;
		int px = p.getX() / dW;
		int py = p.getY() / dH;
		int qy = q.getY() / dH;
		int qx = q.getX() / dW;

		hline(field.getRight()/dW - field.getLeft()/dW + 1);
		for(int r = field.getTop()/dH; r <= field.getBottom()/dH; r ++) {
		    tpr("|");
		    for(int i = field.getLeft()/dW; i<= field.getRight()/dW; i ++) {
			if (r == by && i == bx) {
				tpr("*");
				if (r == py && i == px) {
					tpr("p"); i++;
					if (r == qy && i == qx) { tpr("q"); i++; }
				} else if (r == qy && i == qx) { tpr("q"); i++; }
			} else if (r == py && i == px) {
				tpr("p");
				if (r == qy && i == qx) { tpr("q"); i++; }
			} else if (r == qy && i == qx) { tpr("q");
			} else { /* if (r == 0 && i == 0) tpr("+"); else  */
				tpr(" ");
			}
		    }
		    tprl("|"+r);
		}
		hline(field.getRight()/dW - field.getLeft()/dW + 1);
	}
	
	void hline(int n) {
		tpr("+");
		for(int i = 1; i<=n; i++)  tpr("-");
		tprl("+");
	}
	
	void tpr(String s) { System.out.print(s); }
	
	void tprl(String s) { System.out.println(s); }
	
	void run() {
		int clock = 0;
		while(!timeout) {
			clock++; 
			System.out.print("[" + clock + "]");
			int dist = p.move(ball);
			int distq = q.move(ball);
			r = p;
			if(distq < dist) {r = q; dist = distq;}
			if(dist < 5) {
				r.kick(ball);
				System.out.print("->" + r.name + "kicks->");
			}
			goal = ball.move();
			if(goal) {
				System.out.println("* Goal In *");
				ball.reset();
			}
			show();
			try {Thread.sleep(200);} catch(Exception e) {}
			if(clock > 45) stop();
		}
		System.out.println("* TIME OUT *");
	}
}