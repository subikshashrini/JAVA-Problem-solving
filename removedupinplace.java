import java.util.*;//struggled
public class removedupinplace
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int nd=0,d=1;
        while(d<arr.length)
        {
            if(arr[nd]!=arr[d])
            {
                nd++;
                arr[nd]=arr[d];
                d++;

            }
            else{
                d++;
            }

        }
        for(int i=0;i<=nd;i++){
            System.out.println(arr[i]);
        }
    }
}
