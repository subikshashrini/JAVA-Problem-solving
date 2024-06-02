import java.util.*;
public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int s=1;s<=i;s++){

                    System.out.print("* ");

            }
            for(int k=1;k<i;k++){
                    System.out.print("* ");

            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++){
                System.out.print("* ");
            }
            for(int z=i;z<n;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
