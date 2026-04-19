package tf;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21405a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f21406b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f21407c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f21408d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f21409e = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final InterfaceC0435c f21410f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final InterfaceC0435c f21411g = new b();

    static class a implements InterfaceC0435c {
        a() {
        }

        @Override // tf.c.InterfaceC0435c
        public void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(d.a(str));
            }
        }
    }

    static class b implements InterfaceC0435c {
        b() {
        }

        @Override // tf.c.InterfaceC0435c
        public void a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                } else {
                    sb2.append("%25");
                    sb2.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b10 : str.getBytes(Charset.forName("UTF-8"))) {
                sb2.append('%');
                sb2.append(c.f21408d[(b10 >> 4) & 15]);
                sb2.append(c.f21408d[b10 & 15]);
            }
        }
    }

    /* JADX INFO: renamed from: tf.c$c, reason: collision with other inner class name */
    private interface InterfaceC0435c {
        void a(String str, StringBuilder sb2);
    }

    public static String b(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f21409e.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    private static String c(Pattern pattern, String str, InterfaceC0435c interfaceC0435c) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            interfaceC0435c.a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    public static String d(String str) {
        return f21405a.matcher(str).find() ? c(f21406b, str, f21410f) : str;
    }
}
