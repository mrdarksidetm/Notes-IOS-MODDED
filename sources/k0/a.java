package k0;

import a2.z;
import androidx.compose.ui.e;
import y1.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e.c implements z1.h, z, a2.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f14295n = k.b(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f14296o;

    private final c b2() {
        return (c) p(b.a());
    }

    @Override // a2.z
    public void B(r rVar) {
        this.f14296o = rVar;
    }

    protected final r a2() {
        r rVar = this.f14296o;
        if (rVar == null || !rVar.v()) {
            return null;
        }
        return rVar;
    }

    protected final c c2() {
        c cVarB2 = b2();
        return cVarB2 == null ? this.f14295n : cVarB2;
    }
}
