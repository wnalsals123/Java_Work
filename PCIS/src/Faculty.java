// ����Ʈ 5.4 : Faculty.java
// Faculty Ŭ������ Employee Ŭ������ ��ӹ޴µ� Employee Ŭ������ ��� ������ ��� �޽�
// �带 ������ ������ Employee Ŭ������ ���� Ŭ�������� ��� ������ ��� �޽�带 ������ 
// �ִ�. ���� ���ο� ����(course)�� �����ϰ� �� ������ ���� ������ �޽�带 ������ �ִ�.

class Faculty extends Employee{
    private String course; // ����
    Course coursev[] = new Course[2];
    int nCourses = 0;
	
    // �پ��� ������
    Faculty(){
        super();
        course = "Not yet";
    }
    Faculty(String name, int age, int salary, String position){
        super(name, age, salary, position);
        course = "Not yet";
    }
    Faculty(String name, int age, String address, int salary, String position){
        super(name, age, address, salary, position);
        course = "Not yet";
    }
    Faculty(String name, int age, int salary, String position, Employee supervisor){
        super(name, age, salary, position, supervisor);
        course = "Not yet";
    }
    Faculty(String name, int age, String address, int salary, String position, 
           Employee supervisor){
        super(name, age, address, salary, position, supervisor);
        course = "Not yet";
    }

    void openCourse(Course c) {
    	coursev[nCourses++] = c;
    }
	
    // ������ ������ ���� �޽��
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    // ��ü�� ���� ǥ��
    public void info(){
        super.info();
        System.out.println("���� : " + course);
    }
}