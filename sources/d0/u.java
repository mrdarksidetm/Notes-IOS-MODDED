package d0;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e.c implements z1.h, a2.s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private y1.r f9297o;

    private final zd.l<y1.r, md.i0> a2() {
        if (H1()) {
            return (zd.l) p(t.a());
        }
        return null;
    }

    private final void b2() {
        zd.l<y1.r, md.i0> lVarA2;
        y1.r rVar = this.f9297o;
        if (rVar != null) {
            ae.r.c(rVar);
            if (!rVar.v() || (lVarA2 = a2()) == null) {
                return;
            }
            lVarA2.invoke(this.f9297o);
        }
    }

    public final void c2(boolean z10) {
        if (z10 == this.f9296n) {
            return;
        }
        if (z10) {
            b2();
        } else {
            zd.l<y1.r, md.i0> lVarA2 = a2();
            if (lVarA2 != null) {
                lVarA2.invoke(null);
            }
        }
        this.f9296n = z10;
    }

    @Override // a2.s
    public void l(y1.r rVar) {
        this.f9297o = rVar;
        if (this.f9296n) {
            if (rVar.v()) {
                b2();
                return;
            }
            zd.l<y1.r, md.i0> lVarA2 = a2();
            if (lVarA2 != null) {
                lVarA2.invoke(null);
            }
        }
    }
}
