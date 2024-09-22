import java.util.Scanner;

public class feibonaqie {
    public static void main(String[] args) {
        recursion myRecursion = new recursion();
        System.out.print("请输入你要你要打印第几个数的斐波那切数列:");
        Scanner myScanner = new Scanner(System.in);
        int m = myScanner.nextInt();
        int sum = myRecursion.feiBo(m);
        System.out.print("结果为:" + sum);
    }
}
class recursion{
        public static int feiBo(int n){
            if(n==1||n==2)
                return 1;
            else
                return feiBo(n-1)+feiBo(n-2);
        }
    }
