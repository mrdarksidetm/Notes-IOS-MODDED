package p1;

import md.i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zd.l<? super l, i0> f18019a;

    private l() {
    }

    public /* synthetic */ l(ae.j jVar) {
        this();
    }

    public abstract void a(n1.f fVar);

    public zd.l<l, i0> b() {
        return this.f18019a;
    }

    public final void c() {
        zd.l<l, i0> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(zd.l<? super l, i0> lVar) {
        this.f18019a = lVar;
    }
}
