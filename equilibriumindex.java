import java.util.Scanner;

public class equilibriumindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter arr size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter arr elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int rightsum=0;
        for(int i=0;i<arr.length;i++){
            rightsum=rightsum+arr[i];
        }
        int leftsum=0;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
           rightsum=rightsum-arr[i];
           if(leftsum==rightsum){
               System.out.print("equilibrium index is "+ i);
               found=true;
               break;
           }
            leftsum=leftsum+arr[i];

        }
        if(!found){
            System.out.println("no equilibrium index is found");
        }
    }
}
