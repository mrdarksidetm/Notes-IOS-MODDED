package rf;

import java.util.ArrayList;
import java.util.List;
import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private StringBuilder f19548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f19550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f19551h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f19544a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<vf.g> f19545b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<uf.p> f19546c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<x> f19547d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19552i = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19553a;

        static {
            int[] iArr = new int[b.values().length];
            f19553a = iArr;
            try {
                iArr[b.START_DEFINITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19553a[b.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19553a[b.DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19553a[b.START_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19553a[b.TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private boolean b(sf.m mVar) {
        mVar.r();
        sf.l lVarO = mVar.o();
        if (!tf.e.a(mVar)) {
            return false;
        }
        String strC = mVar.d(lVarO, mVar.o()).c();
        if (strC.startsWith("<")) {
            strC = strC.substring(1, strC.length() - 1);
        }
        this.f19549f = strC;
        int iR = mVar.r();
        if (!mVar.e()) {
            this.f19552i = true;
            this.f19545b.clear();
        } else if (iR == 0) {
            return false;
        }
        this.f19544a = b.START_TITLE;
        return true;
    }

    private void c() {
        if (this.f19552i) {
            String strD = tf.c.d(this.f19549f);
            StringBuilder sb2 = this.f19551h;
            uf.p pVar = new uf.p(this.f19548e.toString(), strD, sb2 != null ? tf.c.d(sb2.toString()) : null);
            pVar.k(this.f19547d);
            this.f19547d.clear();
            this.f19546c.add(pVar);
            this.f19548e = null;
            this.f19552i = false;
            this.f19549f = null;
            this.f19551h = null;
        }
    }

    private boolean g(sf.m mVar) {
        sf.l lVarO = mVar.o();
        if (!tf.e.c(mVar)) {
            return false;
        }
        this.f19548e.append(mVar.d(lVarO, mVar.o()).c());
        if (!mVar.e()) {
            this.f19548e.append('\n');
            return true;
        }
        if (!mVar.i(']') || !mVar.i(':') || this.f19548e.length() > 999 || tf.c.b(this.f19548e.toString()).isEmpty()) {
            return false;
        }
        this.f19544a = b.DESTINATION;
        mVar.r();
        return true;
    }

    private boolean i(sf.m mVar) {
        mVar.r();
        if (!mVar.i('[')) {
            return false;
        }
        this.f19544a = b.LABEL;
        this.f19548e = new StringBuilder();
        if (mVar.e()) {
            return true;
        }
        this.f19548e.append('\n');
        return true;
    }

    private boolean j(sf.m mVar) {
        mVar.r();
        if (!mVar.e()) {
            this.f19544a = b.START_DEFINITION;
            return true;
        }
        this.f19550g = (char) 0;
        char cL = mVar.l();
        if (cL == '\"' || cL == '\'') {
            this.f19550g = cL;
        } else if (cL == '(') {
            cL = ')';
            this.f19550g = cL;
        }
        if (this.f19550g != 0) {
            this.f19544a = b.TITLE;
            this.f19551h = new StringBuilder();
            mVar.h();
            if (!mVar.e()) {
                this.f19551h.append('\n');
            }
        } else {
            c();
            this.f19544a = b.START_DEFINITION;
        }
        return true;
    }

    private boolean k(sf.m mVar) {
        sf.l lVarO = mVar.o();
        if (!tf.e.e(mVar, this.f19550g)) {
            return false;
        }
        this.f19551h.append(mVar.d(lVarO, mVar.o()).c());
        if (!mVar.e()) {
            this.f19551h.append('\n');
            return true;
        }
        mVar.h();
        mVar.r();
        if (mVar.e()) {
            return false;
        }
        this.f19552i = true;
        c();
        this.f19545b.clear();
        this.f19544a = b.START_DEFINITION;
        return true;
    }

    public void a(x xVar) {
        this.f19547d.add(xVar);
    }

    List<uf.p> d() {
        c();
        return this.f19546c;
    }

    vf.h e() {
        return vf.h.g(this.f19545b);
    }

    List<x> f() {
        return this.f19547d;
    }

    public void h(vf.g gVar) {
        boolean zI;
        this.f19545b.add(gVar);
        if (this.f19544a == b.PARAGRAPH) {
            return;
        }
        sf.m mVarK = sf.m.k(vf.h.h(gVar));
        while (mVarK.e()) {
            int i10 = a.f19553a[this.f19544a.ordinal()];
            if (i10 == 1) {
                zI = i(mVarK);
            } else if (i10 == 2) {
                zI = g(mVarK);
            } else if (i10 == 3) {
                zI = b(mVarK);
            } else if (i10 == 4) {
                zI = j(mVarK);
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("Unknown parsing state: " + this.f19544a);
                }
                zI = k(mVarK);
            }
            if (!zI) {
                this.f19544a = b.PARAGRAPH;
                return;
            }
        }
    }
}
