import java.util.Scanner;
public class SwapNumber{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        /*a = a+b;
        b = a-b;
        a = a-b;*/
        /*a = a^b;
        b = a^b;
        a = a^b;*/
        a = a*b;
        b = a/b;
        a = a/b;
        /*int temp = a;

        a = b;
        b = temp;
       // int tem = scn.nextInt();*/
       System.out.println("after swap:" + a + " " + b);
       

       
    }
}