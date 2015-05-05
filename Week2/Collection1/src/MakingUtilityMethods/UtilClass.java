package MakingUtilityMethods;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public final class UtilClass {

    private UtilClass(){}
    
    public static String mapToHumanicString(Map<? extends Object, ? extends Object> map){
        
        String result = "";
        Iterator<?> iterate = map.entrySet().iterator();
        while (iterate.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<? extends Object, ? extends Object> pair = (Map.Entry<? extends Object, ? extends Object>)iterate.next();
            result += pair.getKey() + ":" + pair.getValue() + " ";
        }
        return result;
    }
    
    public static Map<String,Integer> occurencesOfWords(String str){
        
        String[] array = str.split(" ");    
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String i : array) {
            Integer val = map.get(i);
            if (val == null) {
                map.put(i, 1);
            } else
                map.put(i, val + 1);
        }
        return map;
    }
}
