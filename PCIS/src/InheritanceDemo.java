public class InheritanceDemo {
        int npp = 0;
        Person[] ppv;
        Student[] stv;
        Faculty[] profv;
        Staff jigwon;
        Course crsv[];

//    public static void main(String[] args){
//	Person[] p = new Person[3];
//	Student st = new Student("홍길동", 24, 3, 200811723, "IT융합응용공");
//	Faculty pf = new Faculty("김교수", 48, "부산시 남구", 4000000, "공과대학");
//	pf.setCourse("Java 프로그래밍");
//	Staff tf = new Staff("박과장", 42, 3000000, "대학본부");
//	tf.setDepartment("서무과");
//
//	p[0] = st;
//	p[1] = pf;
//	p[2] = tf;
//
//	for(int i = 0; i < p.length; i++) {
//	      System.out.println("<"+ (i+1) +">------------------------------");
//	      p[i].info();
//	}
//    }

    public static void main(String[] args){
	InheritanceDemo pcis = new InheritanceDemo();
	pcis.recruit_employees();
	pcis.run_school();
	pcis.report();
    }

    InheritanceDemo() {
        ppv = new Person[100]; npp = 0;
    }

    void recruit_employees() {
    	profv = new Faculty[3];
    	profv[0] = new Faculty("김교수", 48, "부산시 남구", 5000000, "공과대학");
    	profv[1] = new Faculty("박교수", 38, "부산시 해운대구", 4000000, "공과대학");
    	profv[2] = new Faculty("주교수", 24, "부산시 기장군", 6200000, "공과대학");
    	jigwon = new Staff("박과장", 42, 4000000, "대학본부");
    	jigwon.setDepartment("서무과");
    	ppv[npp++] = profv[0];
    	ppv[npp++] = profv[1];
    	ppv[npp++] = profv[2];
    	ppv[npp++] = jigwon;
    }

    void report() {	// 구성원 소개, 수강편람, 과목출석부, 개인 시간표
    	print_people();
    	print_수강편람();
    	for(int i = 0; i < crsv.length; i++)
    		print_출석부(crsv[i]);
    	for(int i = 0; i < stv.length; i++)
    		print_학생시간표(stv[i]);
    }

    void run_school() {	
    	recruit_학생();
    	open_강좌();
    	register_수강과목();
    }

    void recruit_학생() {
        String namev[] = {"강", "김", "고", "박", "신", "심", "이", "조", "최", "황", "주"};
        int agev[] = {21, 24, 22, 19, 21, 21, 21, 21, 23, 21, 24};
        stv = new Student[namev.length];
        for(int i = 0; i < namev.length; i++) {
        	stv[i] = new Student(namev[i], agev[i], 3, 201612345+i, "IT융합응용공학");
        	ppv[npp++] = stv[i];
        }
    }

    void open_강좌() {
    	crsv = new Course[3];
    	crsv[0] = new Course("Java", profv[0], "Mon 7-8, Wed 1-2", "2226");
    	profv[0].setCourse("Java");
    	crsv[1] = new Course("Graphics", profv[1], "Wed 7-8, Thu 7-8", "1325");
    	profv[1].setCourse("Graphics");
    	crsv[2] = new Course("Bodybuilding", profv[2], "Fri 1-4", "Gym");
    	profv[2].setCourse("Bodybuilding");
    }

    void register_수강과목() {
    	Course oo = crsv[0];
    	Course cg = crsv[1];
    	Course bd = crsv[2];
    	int oo_list[] = {0, 1, 2, 3, 4, 5, 7, 8, 9};
    	int cg_list[] = {2, 3, 5, 6, 8, 9, 10};
    	int bd_list[] = {0, 1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10};
    	for(int i = 0; i < oo_list.length; i++)
    		stv[oo_list[i]].registerCourse(oo);
    	for(int i = 0; i < cg_list.length; i++)
    		stv[cg_list[i]].registerCourse(cg);
    	for(int i = 0; i < bd_list.length; i++)
    		stv[bd_list[i]].registerCourse(bd);
    	System.out.println("수강신청: " + (oo_list.length + cg_list.length + bd_list.length) + "명 -성공.");
    }

    void print_people() {
        for(int i = 0; i < npp; i++){
            System.out.println("<" + (i + 1) + ">---------------------------");
            ppv[i].info();
        }
    }

    void print_수강편람() {
    	System.out.println("\n- 수강 편람 -");
    	for(int i =0; i <crsv.length; i++)
    		crsv[i].info();
    	System.out.println("");
    }

    void print_출석부(Course cs) {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("과목: " + cs.getTitle() + "(" + cs.getTP() + ")" + cs.lecturer.getName());
    	System.out.print(" ");
    	for(int n = 1; n <= 16; n++)
    		System.out.printf("%3d", n);
    	System.out.println("");
    	cs.listRegistrants();
    }

    void print_학생시간표(Student st) {
    	System.out.println("\n<< 수강과목/시간표 >>");
    	System.out.println("이름: " + st.getName());
    	for(int i = 0; i < st.nCourses; i++) {
    		Course c = st.getCourse(i);
    		System.out.println(c.getTitle() + " (" + c.getTP() + ") by. " + c.lecturer.getName());
    	}
    }
}