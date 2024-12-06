import java.util.*;
class palin{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int t=n.nextInt();
        for( int i=0;i<t;i++){
            int r,rev=0;
            int a=n.nextInt();
            int temp=a;
            while(a>0){
                r=a%10;
                rev=rev*10+r;
                a=a/10;
            }
            if(temp==rev)
                System.out.println("it is a palindrom"+rev);
            else
                System.out.println("it  is not a palindrom"+rev);
    

        }
    }
}
         