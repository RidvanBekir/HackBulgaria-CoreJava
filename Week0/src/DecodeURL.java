import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class DecodeURL {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String input = new String("kitten%20pic.jpg");
        System.out.println("The decoded string is: " + decodeUrl(input));

    }

    public static String decodeUrl(String input) throws UnsupportedEncodingException {

        String decodedStr = URLDecoder.decode(input, "UTF-8");
        return decodedStr;
    }
}
