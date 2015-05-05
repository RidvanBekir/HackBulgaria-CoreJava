package WebsiteCrawler;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

public class WebsiteCrawler {

    public static void main(String[] args) {

        String needle = new String("Револвираща");
        System.out.println(needle);
        printMeResults(findMeThis(args[0], needle));
    }

    public static void printMeResults(List<String> result) {
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static List<String> findMeThis(String path, String needle) {

        List<String> results = new ArrayList<String>();
        try {
            for (String s : getAllLinks(getContent(path))) {
                String url = path + s;
                if (getContent(url).contains(needle)) {
                    results.add(url);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

    public static String getContent(String path) throws IOException {

        URL url = new URL(path);
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        String body = IOUtils.toString(in, encoding);
        in.close();
        return body;

    }

    private static List<String> getAllLinks(String content) {

        List<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            if (!matcher.group(1).contains("..")) {
                resultList.add(matcher.group(1));
            }
        }
        return resultList;

    }
}
