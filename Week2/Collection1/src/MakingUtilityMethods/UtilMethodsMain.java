package MakingUtilityMethods;
import java.util.Map;


public class UtilMethodsMain {

    public static void main(String[] args) {
        Map<String, Integer> result = UtilClass.occurencesOfWords("Ninjas are all over the place! We are all going to die!");
        System.out.println(UtilClass.mapToHumanicString(result));
    }
}
