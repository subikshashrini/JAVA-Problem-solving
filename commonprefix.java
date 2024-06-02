public class commonprefix {
    public static void main(String[] args) {
        String[] str = {"flow","flower","flight"};
        String result =prefix(str);
        System.out.println(result);
    }
    public static String prefix(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }
        String b =s[0];
        int i = 1;
        while(i<s.length-1){
            int count =0;
            String a = "";
            int index=0;
            while(count<s[i].length() || count<s[i+1].length())
            {
                if (s[i].charAt(count) == s[i + 1].charAt(count))
                {
                    a += s[i].charAt(count);
                    count++;
                }
                else
                {
                        b=a.substring(0,count);
                        break;


                }

            }
            i++;
        }
        return b;
    }
}