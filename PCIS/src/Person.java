class Person{
    private String name; // �̸�
    private int age; // ����
    private String address; // �ּ�

    // �پ��� ������
    Person(){
        name = "No name yet.";
        age = 0;
        address = "";
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        address = "";
    }
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
	
    // ������ ������ ���� �޽���
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    // ��ü ���� ǥ��
    public void info(){
        System.out.println("�̸� : " + name);
        System.out.println("���� : " + age);
        System.out.println("�ּ� : " + address);
    }
}