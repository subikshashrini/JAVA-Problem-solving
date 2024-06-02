import java.util.*;
public class repeatedwords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String words[] = str.split(" ");
        int count=1;
        int max=0;
        String repeatstring="";
        for(int i=0;i<words.length-1;i++){
            count =1;
            if(words[i]!="0"){
                for(int j=i+1;j<words.length;j++)
                {
                    if(words[i].equals(words[j])){
                        count++;
                        words[j]="0";
                        if(count>max){
                            max=count;
                            repeatstring = words[i];
                        }
                    }
                }
            }

        }

        if(max>1){
            System.out.println("Most repeated words--->"+repeatstring+" "+max+" "+"times");
        }
        else{
            System.out.println("no");
        }


    }
}
