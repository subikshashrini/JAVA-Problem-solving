import java.util.*;
public class Chocowrapper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money;
        money=sc.nextInt();
        int price=1;
        int wrap=3;
        System.out.print(countchoco(money,price,wrap));

    }

    public static int countchoco(int money,int price,int wrap){
        int choco= money/price;
        return choco+ wrapchoco(choco,wrap);

    }

    public static int wrapchoco(int choc,int wrap){
        if(choc<wrap){
            return 0;
        }
        int newchoc=choc/wrap;
        return newchoc+wrapchoco(newchoc+choc%wrap,wrap);
    }
}
