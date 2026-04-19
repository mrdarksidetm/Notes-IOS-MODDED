package s6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20045b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.e f20046a;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0058 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final s6.d2 a(t6.e r4) {
            /*
                r3 = this;
                java.lang.String r0 = "4325037BAC206C4E8A125453"
                java.lang.String r0 = s6.f1.a(r0)
                ae.r.f(r4, r0)
                java.lang.String[] r0 = r4.c()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L1c
                int r0 = r0.length
                if (r0 != 0) goto L16
                r0 = r2
                goto L17
            L16:
                r0 = r1
            L17:
                if (r0 == 0) goto L1a
                goto L1c
            L1a:
                r0 = r1
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 == 0) goto L5a
                java.lang.String[] r0 = r4.b()
                if (r0 == 0) goto L30
                int r0 = r0.length
                if (r0 != 0) goto L2a
                r0 = r2
                goto L2b
            L2a:
                r0 = r1
            L2b:
                if (r0 == 0) goto L2e
                goto L30
            L2e:
                r0 = r1
                goto L31
            L30:
                r0 = r2
            L31:
                if (r0 == 0) goto L5a
                java.lang.String[][] r0 = r4.g()
                if (r0 == 0) goto L44
                int r0 = r0.length
                if (r0 != 0) goto L3e
                r0 = r2
                goto L3f
            L3e:
                r0 = r1
            L3f:
                if (r0 == 0) goto L42
                goto L44
            L42:
                r0 = r1
                goto L45
            L44:
                r0 = r2
            L45:
                if (r0 == 0) goto L5a
                java.lang.String[] r0 = r4.i()
                if (r0 == 0) goto L55
                int r0 = r0.length
                if (r0 != 0) goto L52
                r0 = r2
                goto L53
            L52:
                r0 = r1
            L53:
                if (r0 == 0) goto L56
            L55:
                r1 = r2
            L56:
                if (r1 == 0) goto L5a
                r4 = 0
                return r4
            L5a:
                s6.d2 r0 = new s6.d2
                r0.<init>(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s6.d2.a.a(t6.e):s6.d2");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d2(t6.e r23) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.d2.<init>(t6.e):void");
    }

    public static final d2 b(t6.e eVar) {
        return f20045b.a(eVar);
    }

    @Override // s6.g2
    public List<String> a() {
        String[] strArrI = this.f20046a.i();
        if (strArrI != null) {
            return nd.o.c(strArrI);
        }
        return null;
    }

    @Override // s6.g2
    public List<String> b() {
        String[] strArrC = this.f20046a.c();
        if (strArrC != null) {
            return nd.o.c(strArrC);
        }
        return null;
    }

    @Override // s6.g2
    public List<String> c() {
        String[] strArrB = this.f20046a.b();
        if (strArrB != null) {
            return nd.o.c(strArrB);
        }
        return null;
    }

    @Override // s6.g2
    public List<List<String>> d() {
        String[][] strArrG = this.f20046a.g();
        if (strArrG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrG.length);
        for (String[] strArr : strArrG) {
            ae.r.e(strArr, f1.a("5E30"));
            arrayList.add(nd.o.c(strArr));
        }
        return arrayList;
    }
}
