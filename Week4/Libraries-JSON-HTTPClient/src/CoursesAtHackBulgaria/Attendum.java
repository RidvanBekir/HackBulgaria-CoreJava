package CoursesAtHackBulgaria;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONObject;

@SuppressWarnings("deprecation")
public class Attendum {

    public static String getContent() throws Exception {

        HttpGet request = new HttpGet("https://hackbulgaria.com/api/checkins/");
        @SuppressWarnings({ "resource" })
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        String entityContents = EntityUtils.toString(entity);
        return entityContents;
    }

    public static void printResults() throws Exception {
        String[] jObjects = getContent().split("\"}, ");
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String students = null;
        for (String string : jObjects) {
            if (string.startsWith("[")) {
                string = string.substring(1);
            }
            students = string + "\"},";
            JSONObject j = new JSONObject(students);
            if (!map.containsKey(j.getString("student_name"))) {
                map.put(j.getString("student_name"), 1);
            } else {
                map.put(j.getString("student_name"), map.get(j.getString("student_name")) + 1);
            }
        }
        sortMap(map);
    }

    public static void sortMap(Map<String, Integer> map) {
        ValueComparator vc = new ValueComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(vc);
        sorted_map.putAll(map);
        System.out.println(sorted_map.toString());
    }

    public static void main(String[] args) {

        try {
            printResults();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
