import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArabicToRomanNumbersConverterShould {

    @Test
    void convert_arabic_number_to_roman() {

        assertThat(NumberConversionUtil.convertArabicToRoman(1)).isEqualTo("I");
        assertThat(NumberConversionUtil.convertArabicToRoman(2)).isEqualTo("II");
        assertThat(NumberConversionUtil.convertArabicToRoman(5)).isEqualTo("V");
        assertThat(NumberConversionUtil.convertArabicToRoman(6)).isEqualTo("VI");
        assertThat(NumberConversionUtil.convertArabicToRoman(7)).isEqualTo("VII");
        assertThat(NumberConversionUtil.convertArabicToRoman(20)).isEqualTo("XX");
        assertThat(NumberConversionUtil.convertArabicToRoman(990)).isEqualTo("CMXC");
        assertThat(NumberConversionUtil.convertArabicToRoman(2022)).isEqualTo("MMXXII");
        assertThat(NumberConversionUtil.convertArabicToRoman(5289)).isEqualTo("MMMMMCCLXXXIX");
        assertThat(NumberConversionUtil.convertArabicToRoman(452)).isEqualTo("CDLII");
        assertThat(NumberConversionUtil.convertArabicToRoman(452)).isEqualTo("CDLII");
        assertThat(NumberConversionUtil.convertArabicToRoman(15452)).isEqualTo("MMMMMMMMMMMMMMMCDLII");

    }

    @Test
    void throw_IlegalArgumentException_when_null_is_given() {
        //Given
        //When
        //Then
        assertThatThrownBy(() -> NumberConversionUtil.convertArabicToRoman(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("A number is required");
    }
}
