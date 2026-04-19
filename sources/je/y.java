package je;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class y extends x {
    public static String X0(String str, int i10) {
        ae.r.f(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(ge.o.h(i10, str.length()));
            ae.r.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String Y0(String str, int i10) {
        ae.r.f(str, "<this>");
        if (i10 >= 0) {
            return c1(str, ge.o.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char Z0(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static char a1(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(w.S(charSequence));
    }

    public static char b1(CharSequence charSequence) {
        ae.r.f(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String c1(String str, int i10) {
        ae.r.f(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, ge.o.h(i10, str.length()));
            ae.r.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
