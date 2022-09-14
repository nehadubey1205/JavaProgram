import java.util.*;
class IfElse{
     // driver code start
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// test case run
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution ob = new Solution();
            String ans = ob.compareNM(n,m);
            System.out.println(ans);

        }
    }
}// driver code end
class Solution{

   
    static String compareNM(int n,int m){
        // code here
        
        if(n<m){
            return ("lesser");
            
        }
          
        
          
        else if(m<n){
             return ("greter");
        }
        else {
            return ("equal");
        }
         
         
    }
}   
