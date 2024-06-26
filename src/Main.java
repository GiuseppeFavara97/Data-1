import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dataStringFull: " + dataStringFull);

        String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("dataStringMedium: " + dataStringMedium);

        String dataStringShort= data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("dataStringShort: " + dataStringShort);


    }
}