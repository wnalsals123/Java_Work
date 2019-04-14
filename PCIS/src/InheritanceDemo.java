public class InheritanceDemo {
        int npp = 0;
        Person[] ppv;
        Student[] stv;
        Faculty[] profv;
        Staff jigwon;
        Course crsv[];

//    public static void main(String[] args){
//	Person[] p = new Person[3];
//	Student st = new Student("ȫ�浿", 24, 3, 200811723, "IT���������");
//	Faculty pf = new Faculty("�豳��", 48, "�λ�� ����", 4000000, "��������");
//	pf.setCourse("Java ���α׷���");
//	Staff tf = new Staff("�ڰ���", 42, 3000000, "���к���");
//	tf.setDepartment("������");
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
    	profv[0] = new Faculty("�豳��", 48, "�λ�� ����", 5000000, "��������");
    	profv[1] = new Faculty("�ڱ���", 38, "�λ�� �ؿ�뱸", 4000000, "��������");
    	profv[2] = new Faculty("�ֱ���", 24, "�λ�� ���屺", 6200000, "��������");
    	jigwon = new Staff("�ڰ���", 42, 4000000, "���к���");
    	jigwon.setDepartment("������");
    	ppv[npp++] = profv[0];
    	ppv[npp++] = profv[1];
    	ppv[npp++] = profv[2];
    	ppv[npp++] = jigwon;
    }

    void report() {	// ������ �Ұ�, �������, �����⼮��, ���� �ð�ǥ
    	print_people();
    	print_�������();
    	for(int i = 0; i < crsv.length; i++)
    		print_�⼮��(crsv[i]);
    	for(int i = 0; i < stv.length; i++)
    		print_�л��ð�ǥ(stv[i]);
    }

    void run_school() {	
    	recruit_�л�();
    	open_����();
    	register_��������();
    }

    void recruit_�л�() {
        String namev[] = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "Ȳ", "��"};
        int agev[] = {21, 24, 22, 19, 21, 21, 21, 21, 23, 21, 24};
        stv = new Student[namev.length];
        for(int i = 0; i < namev.length; i++) {
        	stv[i] = new Student(namev[i], agev[i], 3, 201612345+i, "IT�����������");
        	ppv[npp++] = stv[i];
        }
    }

    void open_����() {
    	crsv = new Course[3];
    	crsv[0] = new Course("Java", profv[0], "Mon 7-8, Wed 1-2", "2226");
    	profv[0].setCourse("Java");
    	crsv[1] = new Course("Graphics", profv[1], "Wed 7-8, Thu 7-8", "1325");
    	profv[1].setCourse("Graphics");
    	crsv[2] = new Course("Bodybuilding", profv[2], "Fri 1-4", "Gym");
    	profv[2].setCourse("Bodybuilding");
    }

    void register_��������() {
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
    	System.out.println("������û: " + (oo_list.length + cg_list.length + bd_list.length) + "�� -����.");
    }

    void print_people() {
        for(int i = 0; i < npp; i++){
            System.out.println("<" + (i + 1) + ">---------------------------");
            ppv[i].info();
        }
    }

    void print_�������() {
    	System.out.println("\n- ���� ��� -");
    	for(int i =0; i <crsv.length; i++)
    		crsv[i].info();
    	System.out.println("");
    }

    void print_�⼮��(Course cs) {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("����: " + cs.getTitle() + "(" + cs.getTP() + ")" + cs.lecturer.getName());
    	System.out.print(" ");
    	for(int n = 1; n <= 16; n++)
    		System.out.printf("%3d", n);
    	System.out.println("");
    	cs.listRegistrants();
    }

    void print_�л��ð�ǥ(Student st) {
    	System.out.println("\n<< ��������/�ð�ǥ >>");
    	System.out.println("�̸�: " + st.getName());
    	for(int i = 0; i < st.nCourses; i++) {
    		Course c = st.getCourse(i);
    		System.out.println(c.getTitle() + " (" + c.getTP() + ") by. " + c.lecturer.getName());
    	}
    }
}