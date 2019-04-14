// ����Ʈ 5.2 : Student.java
// Person�� ��ӹ��� Student Ŭ������ Person Ŭ������ ��� ��� ������ ��� �޽�带 ������
// ������ ���ο� ������(grade, studentNo, major)�� �����ϰ� ������ �� �ִ� �޽�� ����

class Student extends Person{
    private int grade; // �г�
    private int studentNo; // �й�
    private String major; // ����
    Course myCoursev[] = new Course[3];
    int nCourses = 0;

    // �پ��� ������
    Student(){
        super();
        grade = 0;
        studentNo = 0;
        major = "Not yet";
    }
    Student(String name, int age, int grade, int studentNo, String major){
        super(name, age);
        this.grade = grade;
        this.studentNo = studentNo;
        this.major = major;
    }
    Student(String name, int age, String address, int grade, int studentNo, String major){
        super(name, age, address);
        this.grade = grade;
        this.studentNo = studentNo;
        this.major = major;
    }

    void registerCourse(Course c) {
    	if(check() == true) return;
    	myCoursev[nCourses++] = c;
    	c.register(this);
    } 
    boolean check() {
    	if(nCourses >= 3) System.out.println("no more courses");
    	return nCourses >= 3;
    }
    Course getCourse(int i) {return myCoursev[i];}

    // ������ ������ ���� �޽���
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    public void setStudentNo(int studentNo){
        this.studentNo = studentNo;
    }
    public int getStudentNo(){
        return studentNo;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
	
    // ��ü ���� ǥ��
    public void info(){
        super.info();
        System.out.println("�г� : " + grade);
        System.out.println("�й� : " + studentNo);
        System.out.println("���� : " + major);
    }
}