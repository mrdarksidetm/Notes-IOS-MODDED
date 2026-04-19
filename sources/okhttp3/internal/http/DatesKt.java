package okhttp3.internal.http;

import ae.r;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import md.i0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class DatesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DatesKt$STANDARD_DATE_FORMAT$1 f17262a = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.f17026f);
            return simpleDateFormat;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f17263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f17264c;

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f17263b = strArr;
        f17264c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        r.f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f17262a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f17263b;
        synchronized (strArr) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                DateFormat[] dateFormatArr = f17264c;
                DateFormat simpleDateFormat = dateFormatArr[i10];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f17263b[i10], Locale.US);
                    simpleDateFormat.setTimeZone(Util.f17026f);
                    dateFormatArr[i10] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
                i10 = i11;
            }
            i0 i0Var = i0.f15558a;
            return null;
        }
    }

    public static final String b(Date date) {
        r.f(date, "<this>");
        String str = f17262a.get().format(date);
        r.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
