一、实验目的：
1.掌握字符串String及其方法的使用；

2.掌握文件的读取/写入方法；

3.掌握异常处理结构；

------------

二、实验内容：
  在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
  
  文件A包括两部分内容：
  （1）是学生的基本信息；
  
  （2）是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
  1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；
  
  2.允许提供输入参数，统计古诗中某个字或词出现的次数；
  
  3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A；
  
  4.考虑操作中可能出现的异常，在程序中设计异常处理程序；
#实验过程：一，创建一个学生类，包含学生姓名，学号，年龄，性别；
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

#二、创建一个Homework类，在内编写按实验要求将获得文本分句代码，每七字加一个逗号或句号：

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
        
#三、创建Handle类获取文本内容：File file = new File("C:\Users\86130\Desktop\Java.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fr);
#四、获取/输出学生信息: System.out.println("******************学生信息*********************");
        Student xm = new Student();
        xm.setName("李华");
        xm.setAge(19);
        xm.setNumber(2020356857);
        xm.setSex("男");
        System.out.println("学生姓名:" + xm.getName());
        System.out.println("学生年龄:" + xm.getAge());
        System.out.println("学生编号:" + xm.getNumber());
        System.out.println("学生性别:" + xm.getSex());
        
三、实验感想与反思：
在实验中，我更加熟练地能创建一个自己需要的学生类，通过该实验使我了解到String的使用方法，对文件的写入与读取有了更多了解，在实验中对于异常类的处理解决还是不够灵活。

