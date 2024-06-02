import java.util.*;
public class removerepeatwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String[]  str = strs.split(" ");
        StringBuilder sb = new StringBuilder();
        List<String> added = new ArrayList<>();

        for(int i =0;i<str.length;i++){
            if(!added.contains(str[i]))
            {
                sb.append(str[i]).append(" ");
                added.add(str[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
