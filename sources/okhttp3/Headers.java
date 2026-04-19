package okhttp3;

import ae.j;
import ae.r;
import be.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import je.v;
import je.w;
import md.s;
import md.x;
import nd.u;
import nd.z;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import ud.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Headers implements Iterable<s<? extends String, ? extends String>>, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f16830b = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f16831a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f16832a = new ArrayList(20);

        public final Builder a(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            Companion companion = Headers.f16830b;
            companion.d(str);
            companion.e(str2, str);
            c(str, str2);
            return this;
        }

        public final Builder b(String str) {
            r.f(str, "line");
            int iX = w.X(str, ':', 1, false, 4, null);
            if (iX != -1) {
                String strSubstring = str.substring(0, iX);
                r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iX + 1);
                r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    r.e(str, "this as java.lang.String).substring(startIndex)");
                }
                c("", str);
            }
            return this;
        }

        public final Builder c(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            g().add(str);
            g().add(w.W0(str2).toString());
            return this;
        }

        public final Builder d(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            Headers.f16830b.d(str);
            c(str, str2);
            return this;
        }

        public final Headers e() {
            Object[] array = this.f16832a.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String f(String str) {
            r.f(str, "name");
            int size = this.f16832a.size() - 2;
            int iC = c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                if (v.t(str, this.f16832a.get(size), true)) {
                    return this.f16832a.get(size + 1);
                }
                if (size == iC) {
                    return null;
                }
                size = i10;
            }
        }

        public final List<String> g() {
            return this.f16832a;
        }

        public final Builder h(String str) {
            r.f(str, "name");
            int i10 = 0;
            while (i10 < g().size()) {
                if (v.t(str, g().get(i10), true)) {
                    g().remove(i10);
                    g().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder i(String str, String str2) {
            r.f(str, "name");
            r.f(str2, "value");
            Companion companion = Headers.f16830b;
            companion.d(str);
            companion.e(str2, str);
            h(str);
            c(str, str2);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(Util.s("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = okhttp3.internal.Util.s(r1, r0)
                boolean r9 = okhttp3.internal.Util.G(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = ae.r.m(r9, r8)
            L4d:
                java.lang.String r8 = ae.r.m(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.e(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                if (v.t(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iC) {
                    return null;
                }
                length = i10;
            }
        }

        public final Headers g(String... strArr) {
            r.f(strArr, "namesAndValues");
            int i10 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr2[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i11] = w.W0(str).toString();
                i11 = i12;
            }
            int iC = c.c(0, strArr2.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new Headers(strArr2, null);
        }
    }

    private Headers(String[] strArr) {
        this.f16831a = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, j jVar) {
        this(strArr);
    }

    public final String a(String str) {
        r.f(str, "name");
        return f16830b.f(this.f16831a, str);
    }

    public final Date d(String str) {
        r.f(str, "name");
        String strA = a(str);
        if (strA == null) {
            return null;
        }
        return DatesKt.a(strA);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f16831a, ((Headers) obj).f16831a);
    }

    public final String f(int i10) {
        return this.f16831a[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16831a);
    }

    @Override // java.lang.Iterable
    public Iterator<s<? extends String, ? extends String>> iterator() {
        int size = size();
        s[] sVarArr = new s[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVarArr[i10] = x.a(f(i10), n(i10));
        }
        return ae.c.a(sVarArr);
    }

    public final Builder l() {
        Builder builder = new Builder();
        z.D(builder.g(), this.f16831a);
        return builder;
    }

    public final String n(int i10) {
        return this.f16831a[(i10 * 2) + 1];
    }

    public final List<String> o(String str) {
        r.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (v.t(str, f(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(n(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            return u.m();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        r.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f16831a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strF = f(i10);
            String strN = n(i10);
            sb2.append(strF);
            sb2.append(": ");
            if (Util.G(strF)) {
                strN = "██";
            }
            sb2.append(strN);
            sb2.append("\n");
            i10 = i11;
        }
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
