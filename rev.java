import java.util.*;
class rev{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int t=n.nextInt();
        for( int i=0;i<t;i++){
            int r,rev=0;
            int a=n.nextInt();
            while(a>0){
                r=a%10;
                rev=rev*10+r;
                a=a/10;
            }
             System.out.println(rev);
    

        }
    }
}
         
          
 