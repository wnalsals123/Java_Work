package Soccer_G;

class Field {
	int x0, x1, y0, y1, w, h;
	Field(int wide, int high){
		w = wide;
		h = high;
		x1 = w / 2;
		y1 = h / 2;
		x0 = -x1;
		y0 = -y1;
	}
	int getLeft() { return x0;}
	int getRight() { return x1;}
	int getTop() { return y0;}
	int getBottom() { return y1;}
}