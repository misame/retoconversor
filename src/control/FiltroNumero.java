package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Miguel
 */
public class FiltroNumero extends DocumentFilter {

    private Pattern patron;

    public FiltroNumero() {
        patron = Pattern.compile("[\\d,.]*");
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        Matcher comparar = patron.matcher(text);
        if (!comparar.matches()) {
            return;
        }
        super.insertString(fb, offset, text, attrs);
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        Matcher comparar = patron.matcher(string);
        if (!comparar.matches()) {
            return;
        }
        super.insertString(fb, offset, string, attr);
    }

}
