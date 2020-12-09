package xueszy;

import java.io.*;
import java.util.Scanner;

public class moli {
    private static int w;

	public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
			StringBuffer str2 = null;
			StringBuffer str1 = Handle.Read();
			str2 = Homework.HW(str1);
			Handle.Write(str2);

			System.out.println("请输入要查询的字符：");
			String z = input.next();
			w = Handle.getCharMaps(z,str1);

			System.out.println("******************学生信息*********************");
			Student xm = new Student();
			xm.setName("李华");
			xm.setAge(19);
			xm.setNumber(2019456857);
			xm.setSex("男");
			System.out.println("学生姓名:" + xm.getName());
			System.out.println("学生年龄:" + xm.getAge());
			System.out.println("学生编号:" + xm.getNumber());
			System.out.println("学生性别:" + xm.getSex());

			System.out.println("作业处理完成");
			System.out.println(z + "出现的次数为："+ z + "次");
		}
    }

	public static int getW() {
		return w;
	}

	public static void setW(int w) {
		moli.w = w;
	}
}
class Student{
    public Student(){

    }
    public Student(String name,int age,int number,String sex){
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

class Homework{
    public static StringBuffer HW(StringBuffer str1){
        StringBuffer str2 = new StringBuffer(str1);
        int j=0;int z;
        for(int i = 7;i < str2.length()-45;i= i+7){
            z = i +j;
            if(i%2 == 0){
                str2.insert(z,"。\n");
                j = j+2;
            }
            else{
                str2.insert(z,"，");
                j= j+1;
            }
        }
        System.out.println(str2);
        return str2;
    }

}

class Handle{
    public static StringBuffer Read(){
        String str1 = "";
        StringBuffer str2 = new StringBuffer(str1);
        try {
            File file = new File("C:\\Java\\File\\B.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fr);
            while ((str1 =bReader.readLine()) != null) {
                str2.append(str1);
            }
            fr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return  str2;
    }

    public static void Write(StringBuffer s){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Java\\File\\A.txt"));
            bw.write(s.toString());
            bw.close();
        }catch (IOException e){
        }
    }

    public static int getCharMaps(String z,StringBuffer s) {
        boolean p;
        int w = 0;
        String a = s.toString();
        char[] b = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            String x = String.valueOf(b[i]);
            p = z.equals(x);
            if(p == true){
                w = w + 1;
            }

        }
        return w;
    }
}