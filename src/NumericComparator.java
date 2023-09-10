import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumericComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        Integer i1 = extractNumber(s1);
        Integer i2 = extractNumber(s2);

        if (i1 == null && i2 == null) {
            return s1.compareTo(s2);
        } else if (i1 == null) {
            return 1;
        } else if (i2 == null) {
            return -1;
        } else {
            return i1.compareTo(i2);
        }
    }

    private Integer extractNumber(String s) {
        Matcher matcher = Pattern.compile("\\d+").matcher(s);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }

        return null;
    }
}
