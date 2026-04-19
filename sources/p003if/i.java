package p003if;

import ae.r;
import hf.c;
import hf.f;
import hf.z;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f12748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f12749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f12750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f12751e;

    static {
        f.a aVar = f.f11960d;
        f12747a = aVar.d("/");
        f12748b = aVar.d("\\");
        f12749c = aVar.d("/\\");
        f12750d = aVar.d(".");
        f12751e = aVar.d("..");
    }

    public static final z j(z zVar, z zVar2, boolean z10) {
        r.f(zVar, "<this>");
        r.f(zVar2, "child");
        if (zVar2.isAbsolute() || zVar2.r() != null) {
            return zVar2;
        }
        f fVarM = m(zVar);
        if (fVarM == null && (fVarM = m(zVar2)) == null) {
            fVarM = s(z.f12028c);
        }
        c cVar = new c();
        cVar.g(zVar.b());
        if (cVar.size() > 0) {
            cVar.g(fVarM);
        }
        cVar.g(zVar2.b());
        return q(cVar, z10);
    }

    public static final z k(String str, boolean z10) {
        r.f(str, "<this>");
        return q(new c().z(str), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(z zVar) {
        int iX = f.x(zVar.b(), f12747a, 0, 2, null);
        return iX != -1 ? iX : f.x(zVar.b(), f12748b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f m(z zVar) {
        f fVarB = zVar.b();
        f fVar = f12747a;
        if (f.s(fVarB, fVar, 0, 2, null) != -1) {
            return fVar;
        }
        f fVarB2 = zVar.b();
        f fVar2 = f12748b;
        if (f.s(fVarB2, fVar2, 0, 2, null) != -1) {
            return fVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(z zVar) {
        return zVar.b().i(f12751e) && (zVar.b().F() == 2 || zVar.b().z(zVar.b().F() + (-3), f12747a, 0, 1) || zVar.b().z(zVar.b().F() + (-3), f12748b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(z zVar) {
        if (zVar.b().F() == 0) {
            return -1;
        }
        boolean z10 = false;
        if (zVar.b().j(0) == 47) {
            return 1;
        }
        if (zVar.b().j(0) == 92) {
            if (zVar.b().F() <= 2 || zVar.b().j(1) != 92) {
                return 1;
            }
            int iQ = zVar.b().q(f12748b, 2);
            return iQ == -1 ? zVar.b().F() : iQ;
        }
        if (zVar.b().F() <= 2 || zVar.b().j(1) != 58 || zVar.b().j(2) != 92) {
            return -1;
        }
        char cJ = (char) zVar.b().j(0);
        if ('a' <= cJ && cJ < '{') {
            return 3;
        }
        if ('A' <= cJ && cJ < '[') {
            z10 = true;
        }
        return !z10 ? -1 : 3;
    }

    private static final boolean p(c cVar, f fVar) {
        if (!r.b(fVar, f12748b) || cVar.size() < 2 || cVar.L(1L) != 58) {
            return false;
        }
        char cL = (char) cVar.L(0L);
        if (!('a' <= cL && cL < '{')) {
            if (!('A' <= cL && cL < '[')) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final hf.z q(hf.c r16, boolean r17) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003if.i.q(hf.c, boolean):hf.z");
    }

    private static final f r(byte b10) {
        if (b10 == 47) {
            return f12747a;
        }
        if (b10 == 92) {
            return f12748b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f s(String str) {
        if (r.b(str, "/")) {
            return f12747a;
        }
        if (r.b(str, "\\")) {
            return f12748b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
