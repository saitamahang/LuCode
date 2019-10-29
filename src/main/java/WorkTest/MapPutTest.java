package WorkTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther liyuhang
 * @date 2019/10/29 9:28
 */
public class MapPutTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("test","liyuhang");
        System.out.println(map.get("test"));
        map.put("test", "mababa");
        System.out.println(map.get("test"));
    }
}
