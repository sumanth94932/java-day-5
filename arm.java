import java.util.*;
class arm{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int t=n.nextInt();
        for( int i=0;i<t;i++){
            int r,rev=0;
            int a=n.nextInt();
            int temp=a;
            while(a>0){
                r=a%10;
                rev=rev+r*r*r;
                a=a/10;
            }
            if(temp==rev)
                System.out.println("it is a amstrom number"+rev);
            else
                System.out.println("it  is not a amstrom number"+rev);
    

        }
    }
}