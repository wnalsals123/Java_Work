import java.util.*;

class Course {
	String title, time, room;
	Faculty lecturer;
	Student regist[];
	Vector<Student> vregist;
	Course(){
		regist = new Student[10];
		vregist = new Vector<Student>();
	}
	Course(String nam, Faculty prof, String tim, String rum){
		this();
		title = nam; time = tim; room = rum;
		lecturer = prof;
		prof.openCourse(this);;
	}
	String getTitle() {return title;}
	Faculty getLecturer() {return lecturer;}
	String getTP() {return time + "#" + room;}
	int numRegist() {return vregist.size();}
	void register(Student st) {vregist.add(st);}
	void dropme(Student st) {vregist.removeElement(st);}
	void listRegistrants() {
		for(int i = 0; i < vregist.size(); i++) {
			Student st = (Student)vregist.elementAt(i);
			System.out.print(st.getName());
			System.out.print(" ");
			for(int j = 0; j < 16; j++)
				System.out.print("  .");
			if((i + 1) % 5 == 0) {
				System.out.print("\n ");
				for(int j = 0; j < 16; j++)
					System.out.print(" --");
			}
			System.out.println("");
		}
	}
	void info() {
		System.out.println(title + "담당교수: " + lecturer.getName() + ", 시간: " + time + " 강의실: " + room);
	}
}