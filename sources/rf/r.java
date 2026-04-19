package rf;

import uf.v;

/* JADX INFO: loaded from: classes2.dex */
public class r extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.r f19569a = new uf.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19571c;

    public r(int i10) {
        this.f19570b = i10;
    }

    @Override // wf.a, wf.d
    public boolean a() {
        return true;
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        if (!hVar.b()) {
            return hVar.c() >= this.f19570b ? wf.c.a(hVar.a() + this.f19570b) : wf.c.d();
        }
        if (this.f19569a.c() == null) {
            return wf.c.d();
        }
        uf.a aVarG = hVar.f().g();
        this.f19571c = (aVarG instanceof v) || (aVarG instanceof uf.r);
        return wf.c.b(hVar.e());
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19569a;
    }

    @Override // wf.a, wf.d
    public boolean h(uf.a aVar) {
        if (!this.f19571c) {
            return true;
        }
        uf.a aVarN = this.f19569a.n();
        if (!(aVarN instanceof uf.q)) {
            return true;
        }
        ((uf.q) aVarN).o(false);
        return true;
    }
}
