import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NumberConversionUtil {

    public static String convertArabicToRoman(Integer arabicNumber) {

        if(Objects.isNull(arabicNumber)){
            throw new IllegalArgumentException("A number is required");
        }

        String romanNumber = "";

        for (int i = 1; i <= arabicNumber; i++) {
            for (RomanLetters romanLetter : RomanLetters.getValuesDescOrdered()) {
                while (arabicNumber >= romanLetter.arabicNumber) {
                    romanNumber += romanLetter;
                    arabicNumber -= romanLetter.arabicNumber;
                }
            }
        }

        return romanNumber;
    }

    private enum RomanLetters {

        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),
        XC(90),
        C(100),
        CD(400),
        D(500),
        CM(900),
        M(1000);

        private final int arabicNumber;

        RomanLetters(int arabicNumber) {
            this.arabicNumber = arabicNumber;
        }

        public static List<RomanLetters> getValuesDescOrdered() {
            return Arrays.asList(values()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }

    }

}
