import java.util.*;
public class latinmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=n;int temp1=1;
            for(int k=0;k<i;k++){
                System.out.print(temp+" ");
                temp--;
            }
            for(int j=i+1;j<=n;j++){
                System.out.print(temp1+" ");
                temp1++;
            }
            System.out.println();
        }

    }
}

















 /*int k = n+1;
        for(int i=0;i<n;i++){
            int temp=k;
            /*while(temp<=n){
                System.out.print(temp+" ");
                //temp++;
            }*/
            /*for(int j=1;j<k;j++){
                System.out.print(j+" ");
            }
            k--;
            System.out.println();
        }*/
/*for(int i=1;i<=5;i++){
            int temp=5;
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            for(int k=i+1;k<=5;k++){
                System.out.print(temp+" ");
                temp--;
            }
            System.out.println();
        }
*/