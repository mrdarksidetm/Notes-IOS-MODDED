package v1;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21958b = v0.d.f21872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<m> f21959a = new v0.d<>(new m[16], 0);

    public boolean a(z.m<b0> mVar, y1.r rVar, h hVar, boolean z10) {
        v0.d<m> dVar = this.f21959a;
        int iO = dVar.o();
        if (iO <= 0) {
            return false;
        }
        m[] mVarArrN = dVar.n();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = mVarArrN[i10].a(mVar, rVar, hVar, z10) || z11;
            i10++;
        } while (i10 < iO);
        return z11;
    }

    public void b(h hVar) {
        int iO = this.f21959a.o();
        while (true) {
            iO--;
            if (-1 >= iO) {
                return;
            }
            if (this.f21959a.n()[iO].k().g()) {
                this.f21959a.x(iO);
            }
        }
    }

    public final void c() {
        this.f21959a.i();
    }

    public void d() {
        v0.d<m> dVar = this.f21959a;
        int iO = dVar.o();
        if (iO > 0) {
            int i10 = 0;
            m[] mVarArrN = dVar.n();
            do {
                mVarArrN[i10].d();
                i10++;
            } while (i10 < iO);
        }
    }

    public boolean e(h hVar) {
        v0.d<m> dVar = this.f21959a;
        int iO = dVar.o();
        boolean z10 = false;
        if (iO > 0) {
            m[] mVarArrN = dVar.n();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = mVarArrN[i10].e(hVar) || z11;
                i10++;
            } while (i10 < iO);
            z10 = z11;
        }
        b(hVar);
        return z10;
    }

    public boolean f(z.m<b0> mVar, y1.r rVar, h hVar, boolean z10) {
        v0.d<m> dVar = this.f21959a;
        int iO = dVar.o();
        if (iO <= 0) {
            return false;
        }
        m[] mVarArrN = dVar.n();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = mVarArrN[i10].f(mVar, rVar, hVar, z10) || z11;
            i10++;
        } while (i10 < iO);
        return z11;
    }

    public final v0.d<m> g() {
        return this.f21959a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f21959a.o()) {
            m mVar = this.f21959a.n()[i10];
            if (mVar.j().H1()) {
                i10++;
                mVar.h();
            } else {
                this.f21959a.x(i10);
                mVar.d();
            }
        }
    }
}
