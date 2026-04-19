package sf;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tf.a f20592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tf.a f20593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final tf.a f20594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final tf.a f20595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final tf.a f20596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final tf.a f20597f;

    static {
        tf.a aVarB = tf.a.b().d('A', 'Z').d('a', 'z').b();
        f20592a = aVarB;
        f20593b = aVarB;
        f20594c = aVarB.c().d('0', '9').c('-').b();
        tf.a aVarB2 = aVarB.c().c('_').c(':').b();
        f20595d = aVarB2;
        f20596e = aVarB2.c().d('0', '9').c(com.amazon.a.a.o.c.a.b.f7490a).c('-').b();
        f20597f = tf.a.b().c(' ').c('\t').c('\n').c((char) 11).c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').b();
    }

    private static j b(l lVar, m mVar) {
        String strC = mVar.d(lVar, mVar.o()).c();
        uf.l lVar2 = new uf.l();
        lVar2.n(strC);
        return j.b(lVar2, mVar.o());
    }

    private static boolean c(m mVar) {
        mVar.h();
        if (!mVar.j("CDATA[")) {
            return false;
        }
        while (mVar.b(']') >= 0) {
            if (mVar.j("]]>")) {
                return true;
            }
            mVar.h();
        }
        return false;
    }

    private static boolean d(m mVar) {
        mVar.h();
        if (mVar.f(f20593b) < 1) {
            return false;
        }
        mVar.f(f20594c);
        mVar.r();
        return mVar.i('>');
    }

    private static boolean e(m mVar) {
        mVar.h();
        if (mVar.i('-') && !mVar.i('>') && !mVar.j("->")) {
            while (mVar.b('-') >= 0) {
                if (mVar.j("--")) {
                    return mVar.i('>');
                }
                mVar.h();
            }
        }
        return false;
    }

    private static boolean f(m mVar) {
        mVar.f(f20592a);
        if (mVar.r() <= 0 || mVar.b('>') < 0) {
            return false;
        }
        mVar.h();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4.r() < 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r4.i('=') == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r4.r();
        r0 = r4.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0 != '\'') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r4.b('\'') >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r0 != '\"') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.b('\"') >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r4.c(sf.g.f20597f) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r4.r() < 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r4.i('/');
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        return r4.i('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r4.r() >= 1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.f(sf.g.f20595d) < 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r4.f(sf.g.f20596e);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0067 -> B:4:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean g(sf.m r4) {
        /*
            r4.h()
            tf.a r0 = sf.g.f20594c
            r4.f(r0)
            int r0 = r4.r()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L12
        L10:
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L6a
            tf.a r0 = sf.g.f20595d
            int r0 = r4.f(r0)
            if (r0 < r2) goto L6a
            tf.a r0 = sf.g.f20596e
            r4.f(r0)
            int r0 = r4.r()
            if (r0 < r2) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r3 = 61
            boolean r3 = r4.i(r3)
            if (r3 == 0) goto L13
            r4.r()
            char r0 = r4.l()
            r3 = 39
            if (r0 != r3) goto L4c
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L48
            return r1
        L48:
            r4.h()
            goto L63
        L4c:
            r3 = 34
            if (r0 != r3) goto L5a
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L48
            return r1
        L5a:
            tf.a r0 = sf.g.f20597f
            int r0 = r4.c(r0)
            if (r0 > 0) goto L63
            return r1
        L63:
            int r0 = r4.r()
            if (r0 < r2) goto L12
            goto L10
        L6a:
            r0 = 47
            r4.i(r0)
            r0 = 62
            boolean r4 = r4.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.g.g(sf.m):boolean");
    }

    private static boolean h(m mVar) {
        mVar.h();
        while (mVar.b('?') > 0) {
            mVar.h();
            if (mVar.i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // sf.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        mVarA.h();
        char cL = mVarA.l();
        if (f20593b.a(cL)) {
            if (g(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '/') {
            if (d(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '?') {
            if (h(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '!') {
            mVarA.h();
            char cL2 = mVarA.l();
            if (cL2 == '-') {
                if (e(mVarA)) {
                    return b(lVarO, mVarA);
                }
            } else if (cL2 == '[') {
                if (c(mVarA)) {
                    return b(lVarO, mVarA);
                }
            } else if (f20592a.a(cL2) && f(mVarA)) {
                return b(lVarO, mVarA);
            }
        }
        return j.a();
    }
}
