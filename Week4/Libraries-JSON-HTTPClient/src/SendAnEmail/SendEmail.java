package SendAnEmail;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.mail.*;

public class SendEmail {

    public static void main(String[] args) throws EmailException, MalformedURLException {
    
        EmailAttachment attachment = new EmailAttachment();
        attachment.setURL(new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/azbW3zq_460sa_v1.gif"));
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setName("Booo");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setFrom("bekir.ridvan@gmail.com", "Me");
        email.setAuthenticator(new DefaultAuthenticator("bekir.ridvan@gmail.com", "********"));
        email.addTo("ridvan1994@abv.bg");
        email.setSSL(true);
        email.setDebug(true);
        email.setSubject("The logo");
        email.setMsg("Look at that gif :D LOL");
        
        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
    
    }
}
