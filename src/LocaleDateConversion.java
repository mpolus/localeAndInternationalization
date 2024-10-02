import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {

    public static void main(String[] args) {
        Locale usLocale = Locale.US;
        Locale franceLocale = Locale.FRANCE;
        Locale japanLocale = Locale.JAPAN;

        LocalDate now = LocalDate.now();

        printFormattedDate(usLocale, now);
        printFormattedDate(franceLocale, now);
        printFormattedDate(japanLocale, now);
    }


    private static void printFormattedDate(Locale locale, LocalDate date) {
        // TODO: Print the language and country of the locale using locale.getLanguage() and locale.getCountry()
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", locale);
        System.out.println(formatter.format(date));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy", locale);
        System.out.println(formatter.format(date));

        System.out.println();
    }
}