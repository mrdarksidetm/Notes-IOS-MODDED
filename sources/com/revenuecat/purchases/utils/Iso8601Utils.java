package com.revenuecat.purchases.utils;

import com.amazon.a.a.o.c.a.b;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        sb2.append(b.f7490a);
        padInt(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, IndexOutOfBoundsException -> 0x01a0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0084, B:36:0x008c, B:41:0x00ca, B:43:0x00d0, B:45:0x00d6, B:65:0x0164, B:50:0x00e1, B:51:0x00fc, B:52:0x00fd, B:54:0x0109, B:57:0x0112, B:59:0x0131, B:62:0x0140, B:63:0x0162, B:67:0x0196, B:68:0x019d), top: B:74:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, IndexOutOfBoundsException -> 0x01a0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0084, B:36:0x008c, B:41:0x00ca, B:43:0x00d0, B:45:0x00d6, B:65:0x0164, B:50:0x00e1, B:51:0x00fc, B:52:0x00fd, B:54:0x0109, B:57:0x0112, B:59:0x0131, B:62:0x0140, B:63:0x0162, B:67:0x0196, B:68:0x019d), top: B:74:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, IndexOutOfBoundsException -> 0x01a0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x019e, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0084, B:36:0x008c, B:41:0x00ca, B:43:0x00d0, B:45:0x00d6, B:65:0x0164, B:50:0x00e1, B:51:0x00fc, B:52:0x00fd, B:54:0x0109, B:57:0x0112, B:59:0x0131, B:62:0x0140, B:63:0x0162, B:67:0x0196, B:68:0x019d), top: B:74:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.Iso8601Utils.parse(java.lang.String):java.util.Date");
    }

    private static int parseInt(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
