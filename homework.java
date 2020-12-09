package xueszy;

public class homework {
	public static StringBuffer HW(StringBuffer str1){
        StringBuffer str2 = new StringBuffer(str1);
        int j=0;int z;
        for(int i = 7;i < str2.length()-45;i= i+7){
            z = i +j;
            if(i%2 == 0){
                str2.insert(z,"¡£\n");
                j = j+2;
            }
            else{
                str2.insert(z,"£¬");
                j= j+1;
            }
        }
        System.out.println(str2);
        return str2;
    }

}
