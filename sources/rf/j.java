package rf;

/* JADX INFO: loaded from: classes2.dex */
public class j extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.j f19521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vf.h f19522b;

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            j jVarL;
            if (hVar.c() >= tf.f.f21413a) {
                return wf.f.c();
            }
            vf.g gVarD = hVar.d();
            int iE = hVar.e();
            if (gVarD.a().charAt(iE) == '#' && (jVarL = j.l(gVarD.d(iE, gVarD.a().length()))) != null) {
                return wf.f.d(jVarL).b(gVarD.a().length());
            }
            int iM = j.m(gVarD.a(), iE);
            if (iM > 0) {
                vf.h hVarB = gVar.b();
                if (!hVarB.f()) {
                    return wf.f.d(new j(iM, hVarB)).b(gVarD.a().length()).e();
                }
            }
            return wf.f.c();
        }
    }

    public j(int i10, vf.h hVar) {
        uf.j jVar = new uf.j();
        this.f19521a = jVar;
        jVar.p(i10);
        this.f19522b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j l(vf.g gVar) {
        sf.m mVarK = sf.m.k(vf.h.h(gVar));
        int iG = mVarK.g('#');
        if (iG == 0 || iG > 6) {
            return null;
        }
        if (!mVarK.e()) {
            return new j(iG, vf.h.b());
        }
        char cL = mVarK.l();
        if (cL != ' ' && cL != '\t') {
            return null;
        }
        mVarK.r();
        sf.l lVarO = mVarK.o();
        sf.l lVarO2 = lVarO;
        loop0: while (true) {
            boolean z10 = true;
            while (mVarK.e()) {
                char cL2 = mVarK.l();
                if (cL2 == '\t' || cL2 == ' ') {
                    mVarK.h();
                } else {
                    if (cL2 != '#') {
                        mVarK.h();
                        lVarO2 = mVarK.o();
                    } else if (z10) {
                        mVarK.g('#');
                        int iR = mVarK.r();
                        if (mVarK.e()) {
                            lVarO2 = mVarK.o();
                        }
                        if (iR > 0) {
                            break;
                        }
                    } else {
                        mVarK.h();
                        lVarO2 = mVarK.o();
                    }
                    z10 = false;
                }
            }
            break loop0;
        }
        vf.h hVarD = mVarK.d(lVarO, lVarO2);
        return hVarD.c().isEmpty() ? new j(iG, vf.h.b()) : new j(iG, hVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (n(charSequence, i10 + 1, '=')) {
                return 1;
            }
        }
        return n(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    private static boolean n(CharSequence charSequence, int i10, char c10) {
        return tf.f.o(charSequence, tf.f.m(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // wf.a, wf.d
    public void c(vf.b bVar) {
        bVar.b(this.f19522b, this.f19521a);
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        return wf.c.d();
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19521a;
    }
}
