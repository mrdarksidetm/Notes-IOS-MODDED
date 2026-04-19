package je;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {

    static final class a extends ae.s implements zd.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14227a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public final String invoke(String str) {
            ae.r.f(str, "line");
            return str;
        }
    }

    static final class b extends ae.s implements zd.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14228a = str;
        }

        @Override // zd.l
        public final String invoke(String str) {
            ae.r.f(str, "line");
            return this.f14228a + str;
        }
    }

    private static final zd.l<String, String> b(String str) {
        return str.length() == 0 ? a.f14227a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!je.b.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String strInvoke;
        ae.r.f(str, "<this>");
        ae.r.f(str2, "newIndent");
        List listG0 = w.g0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG0) {
            if (!v.v((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(nd.v.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) nd.c0.l0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listG0.size());
        zd.l<String, String> lVarB = b(str2);
        int iO = nd.u.o(listG0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listG0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nd.u.w();
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iO) && v.v(str3)) {
                str3 = null;
            } else {
                String strX0 = y.X0(str3, iIntValue);
                if (strX0 != null && (strInvoke = lVarB.invoke(strX0)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) nd.c0.e0(arrayList3, new StringBuilder(length), (R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static final String e(String str, String str2, String str3) {
        int i10;
        String strInvoke;
        ae.r.f(str, "<this>");
        ae.r.f(str2, "newIndent");
        ae.r.f(str3, "marginPrefix");
        if (!(!v.v(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listG0 = w.g0(str);
        int length = str.length() + (str2.length() * listG0.size());
        zd.l<String, String> lVarB = b(str2);
        int iO = nd.u.o(listG0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listG0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                nd.u.w();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iO) && v.v(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!je.b.c(str4.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (v.F(str4, str3, i10, false, 4, null)) {
                        int length3 = i14 + str3.length();
                        ae.r.d(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        ae.r.e(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarB.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) nd.c0.e0(arrayList, new StringBuilder(length), (R.styleable.AppCompatTheme_windowMinWidthMajor & 2) != 0 ? ", " : "\n", (R.styleable.AppCompatTheme_windowMinWidthMajor & 4) != 0 ? "" : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 8) == 0 ? null : "", (R.styleable.AppCompatTheme_windowMinWidthMajor & 16) != 0 ? -1 : 0, (R.styleable.AppCompatTheme_windowMinWidthMajor & 32) != 0 ? "..." : null, (R.styleable.AppCompatTheme_windowMinWidthMajor & 64) != 0 ? null : null)).toString();
        ae.r.e(string, "toString(...)");
        return string;
    }

    public static String f(String str) {
        ae.r.f(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        ae.r.f(str, "<this>");
        ae.r.f(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = com.amazon.a.a.o.b.f.f7480c;
        }
        return g(str, str2);
    }
}
