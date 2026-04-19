package vf;

import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f22365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f22366b;

    private g(CharSequence charSequence, x xVar) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.f22365a = charSequence;
        this.f22366b = xVar;
    }

    public static g c(CharSequence charSequence, x xVar) {
        return new g(charSequence, xVar);
    }

    public CharSequence a() {
        return this.f22365a;
    }

    public x b() {
        return this.f22366b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vf.g d(int r3, int r4) {
        /*
            r2 = this;
            java.lang.CharSequence r0 = r2.f22365a
            java.lang.CharSequence r0 = r0.subSequence(r3, r4)
            uf.x r1 = r2.f22366b
            if (r1 == 0) goto L1d
            int r1 = r1.a()
            int r1 = r1 + r3
            int r4 = r4 - r3
            if (r4 == 0) goto L1d
            uf.x r3 = r2.f22366b
            int r3 = r3.c()
            uf.x r3 = uf.x.d(r3, r1, r4)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            vf.g r3 = c(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.g.d(int, int):vf.g");
    }
}
