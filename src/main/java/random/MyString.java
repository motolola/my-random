package random;

import java.util.HashMap;
import java.util.Map;

public class MyString {

    public static void main(String[] args)
    {
        String str = "Boy";

        System.out.println(str);
        System.out.println(str.concat(" is good"));

        System.out.println(str);

        str = "Girl";

        System.out.println(str);
        System.out.println(str.concat(" is good"));

        String logStr = "cat bot car dog car";
        String[] mySpli = logStr.split(" ");
        Map map = new HashMap<String, Integer>();

        for (int i = 0; i < mySpli.length; i++){
            System.out.println(mySpli[i]);

            if (map.containsKey(mySpli[i])){
                int val = (int)(map.get(mySpli[i]));

                map.put(mySpli[i], val+1);
            } else {
                map.put(mySpli[i], 1);
            }
        }
        System.out.println("++++++++++");
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
