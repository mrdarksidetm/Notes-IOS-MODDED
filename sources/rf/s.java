package rf;

import java.util.List;
import uf.v;
import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class s extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f19572a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f19573b = new o();

    @Override // wf.a, wf.d
    public void b() {
        if (this.f19573b.e().f()) {
            this.f19572a.m();
        } else {
            this.f19572a.k(this.f19573b.f());
        }
    }

    @Override // wf.a, wf.d
    public void c(vf.b bVar) {
        vf.h hVarE = this.f19573b.e();
        if (hVarE.f()) {
            return;
        }
        bVar.b(hVarE, this.f19572a);
    }

    @Override // wf.a, wf.d
    public boolean d() {
        return true;
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        return !hVar.b() ? wf.c.b(hVar.getIndex()) : wf.c.d();
    }

    @Override // wf.a, wf.d
    public void f(x xVar) {
        this.f19573b.a(xVar);
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19572a;
    }

    @Override // wf.a, wf.d
    public void i(vf.g gVar) {
        this.f19573b.h(gVar);
    }

    public List<uf.p> j() {
        return this.f19573b.d();
    }

    public vf.h k() {
        return this.f19573b.e();
    }
}
