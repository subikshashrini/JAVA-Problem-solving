import java.util.Scanner;
public class longestcommonprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int n=sc.nextInt();
        sc.nextLine();

        String[] arr=new String[n];
        System.out.println("ENTER WORDS");
        for(int i=0;i<n;i++){//flight
            arr[i]=sc.nextLine();
        }
        String prefix=arr[0]; //flight
        boolean flag=true;

        for(int i=1;i<arr.length;i++){
            while((arr[i].indexOf(prefix))!=0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.length()==0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(prefix);
        }
        else{
            System.out.println("NO COMMON PREFIX");
        }

    }
}
