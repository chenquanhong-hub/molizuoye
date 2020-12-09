package xueszy;

public class student{
	
	public void Student(){

    }
    public void Student(String name,int age,int number,String sex){
        this.name = name;
        this.age = age;
        this.number = number;
        this.sex = sex;
    }

private String name;
private int age;
private int number;
private String sex;

public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public String getSex() {
    return sex;
}
public int getNumber() {
    return number;
}
public void setName(String name) {
    this.name = name;
}
public void setAge(int age) {
    this.age = age;
}
public void setNumber(int number) {
    this.number = number;
}
public void setSex(String sex) {
    this.sex = sex;
}

}
