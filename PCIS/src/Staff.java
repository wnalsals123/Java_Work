// ����Ʈ 5.5 : Staff.java
// Staff Ŭ������ Employee Ŭ������ ��ӹ޴µ� Employee Ŭ������ ��� ������ ��� �޽�� 
// �� ������ ������ Employee Ŭ������ ���� Ŭ������ ��� ������ ��� �޽�带 ������ �ִ�. 
// ���� ���ο� ����(department)�� �����ϰ� �� ������ ���� ������ �޽�尡 �ִ�.

class Staff extends Employee{

    private String department; // �μ�
	
    // �پ��� ������
    Staff(){
        super();
        department = "Not yet";
    }
    Staff(String name, int age, int salary, String position){
        super(name, age, salary, position);
        department = "Not yet";
    }
    Staff(String name, int age, String address, int salary, String position){
        super(name, age, address, salary, position);
        department = "Not yet";
    }
    Staff(String name, int age, int salary, String position, Employee supervisor){
        super(name, age, salary, position, supervisor);
        department = "Not yet";
    }
    Staff(String name, int age, String address, int salary, String position, Employee supervisor){
        super(name, age, address, salary, position, supervisor);
        department = "Not yet";
    }
	
    // ������ ������ ���� �޽��
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    // ��ü ���� ǥ��
    public void info(){
        super.info();
        System.out.println("�μ� : " + department);
    }
}