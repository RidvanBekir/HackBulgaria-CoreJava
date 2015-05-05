package Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    Date current;
    String current_hours;
    String current_date;

    public Time() {

        this.current = now();
        current_hours = toString(current, "hh:mm:ss");
        current_date = toString(current, "dd.MM.YY");

    }

    protected static Date now() {
        return new Date();
    }

    public String toString(Date date, String format) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date).toString();

    }

    public String getCurrentHours() {

        return current_hours;

    }

    public String getCurrentDate() {

        return current_date;

    }
}
