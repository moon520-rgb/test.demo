import java.util.Scanner;
public class monKey {
    public static void main(String[] args){
        Monkey1 myMonkey1=new Monkey1();
        System.out.print("请输入桃子一共吃了几天");
        Scanner myScanner=new Scanner(System.in);
        int m=myScanner.nextInt();
        int sum=myMonkey1.eat(1,m);
        System.out.println("结果为:"+sum);
    }
}
class Monkey1{
     int eat(int day,int m){
        if(day==10)
            return 1;
        else
            return (eat(day+1,m)+1)*2;
    }
}