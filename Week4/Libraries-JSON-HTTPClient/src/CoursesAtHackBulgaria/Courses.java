package CoursesAtHackBulgaria;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

@SuppressWarnings("deprecation")
public class Courses {

    public static String getContent() throws Exception {

        HttpGet request = new HttpGet("https://hackbulgaria.com/api/students/");
        @SuppressWarnings({ "resource" })
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        String entityContents = EntityUtils.toString(entity);
        return entityContents;
    }

    public static void printResults() throws Exception {
        String[] jObjects = getContent().split("\"}, ");
        String students = null;
        for (String string : jObjects) {
            if (string.startsWith("[")) {
                string = string.substring(1);
            }
            students = string + "\"},";
            JSONObject j = new JSONObject(students);
            JSONArray jar = j.getJSONArray("courses");

            if (jar.length() > 1) {
                System.out.println(j.getString("name") + " ==> " + j.getString("courses").toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {

        try {
            printResults();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
