import java.util.Scanner;

public class Gretaerversion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(versioncompare(str1,str2)>0){
            System.out.println("Version upgraded");

        }
        else if(versioncompare(str1,str2)<0){
            System.out.println("version downgraded");
        }



    }
    public static int versioncompare(String str1,String str2)
    {

        int vnum1=0,vnum2=0;
        for(int i=0,j=0;(i<str1.length() || j<str2.length());)
        {
            while(i<str1.length() && str1.charAt(i)!='.'  && isnum(str1.charAt(i)))
            {
                vnum1=vnum1*10 + str1.charAt(i)-'0';
                i++;
            }
            while(j<str2.length() && str2.charAt(j)!='.' && isnum(str2.charAt(j)))
            {
                vnum2=vnum2*10 + str2.charAt(j)-'0';
                j++;
            }


            if(vnum1>vnum2)
            {
                return -1;
            }
            else if(vnum1<vnum2)
            {
                return 1;
            }

            vnum1=vnum2=0;
            i++;
            j++;
        }



        return 0;

    }


    public static boolean isnum(char c){
        if((c-'0' >=0) && (c-'0' <=9)){
            return true;


        }
        return false;
    }
}
