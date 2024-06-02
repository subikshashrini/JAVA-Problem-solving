import java.util.*;
public class reversevowels
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int i=0;
        int j=str.length()-1;
        char[] arr=str.toCharArray();
        while(i<j)
        {
            if(isspecialchar(arr[i]) && isspecialchar(arr[j])){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!isspecialchar(arr[i])){
                i++;
            }
            else if(!isspecialchar(arr[j])){
                j--;
            }
        }
        System.out.println(String.valueOf(arr));

    }

    public static boolean isspecialchar(char c){
        if((c>=32 && c<=46)||(c>=58 && c<=64)||(c>=91 && c<=96)||(c==123 ||  c== 124 || c==125
        || c==126)){
            return true;
        }
        return false;
    }
}
