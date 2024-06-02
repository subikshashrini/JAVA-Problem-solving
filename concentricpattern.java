import java.util.*;
public class concentricpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int size = 2*n-1;
        int first=0;
        int last=size-1;
       int[][] a = new int[size][size];
        while(n!=0){
            for(int i=first;i<=last;i++){
                for(int j=first;j<=last;j++){
                    if(i==first || i==last || j==first || j==last){
                       a[i][j]=n;
                    }
                }
            }

            first=first+1;
            last=last-1;
            n=n-1;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }



    }
}
