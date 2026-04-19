package ra;

import com.amazon.a.a.o.c.a.b;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f19239a = TimeZone.getTimeZone("UTC");

    public static String a(Date date) {
        return b(date, false, f19239a);
    }

    public static String b(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        c(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        c(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append(b.f7490a);
            c(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            c(sb2, iAbs, 2);
            sb2.append(':');
            c(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static void c(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }
}
