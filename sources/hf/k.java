package hf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f11995e;

    public k(j jVar) {
        ae.r.f(jVar, "delegate");
        this.f11995e = jVar;
    }

    @Override // hf.j
    public g0 b(z zVar, boolean z10) {
        ae.r.f(zVar, "file");
        return this.f11995e.b(r(zVar, "appendingSink", "file"), z10);
    }

    @Override // hf.j
    public void c(z zVar, z zVar2) {
        ae.r.f(zVar, "source");
        ae.r.f(zVar2, "target");
        this.f11995e.c(r(zVar, "atomicMove", "source"), r(zVar2, "atomicMove", "target"));
    }

    @Override // hf.j
    public void g(z zVar, boolean z10) {
        ae.r.f(zVar, "dir");
        this.f11995e.g(r(zVar, "createDirectory", "dir"), z10);
    }

    @Override // hf.j
    public void i(z zVar, boolean z10) {
        ae.r.f(zVar, "path");
        this.f11995e.i(r(zVar, "delete", "path"), z10);
    }

    @Override // hf.j
    public List<z> k(z zVar) {
        ae.r.f(zVar, "dir");
        List<z> listK = this.f11995e.k(r(zVar, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(s((z) it.next(), "list"));
        }
        nd.y.A(arrayList);
        return arrayList;
    }

    @Override // hf.j
    public i m(z zVar) {
        ae.r.f(zVar, "path");
        i iVarM = this.f11995e.m(r(zVar, "metadataOrNull", "path"));
        if (iVarM == null) {
            return null;
        }
        return iVarM.e() == null ? iVarM : iVarM.a((251 & 1) != 0 ? iVarM.f11978a : false, (251 & 2) != 0 ? iVarM.f11979b : false, (251 & 4) != 0 ? iVarM.f11980c : s(iVarM.e(), "metadataOrNull"), (251 & 8) != 0 ? iVarM.f11981d : null, (251 & 16) != 0 ? iVarM.f11982e : null, (251 & 32) != 0 ? iVarM.f11983f : null, (251 & 64) != 0 ? iVarM.f11984g : null, (251 & 128) != 0 ? iVarM.f11985h : null);
    }

    @Override // hf.j
    public h n(z zVar) {
        ae.r.f(zVar, "file");
        return this.f11995e.n(r(zVar, "openReadOnly", "file"));
    }

    @Override // hf.j
    public g0 p(z zVar, boolean z10) {
        ae.r.f(zVar, "file");
        return this.f11995e.p(r(zVar, "sink", "file"), z10);
    }

    @Override // hf.j
    public i0 q(z zVar) {
        ae.r.f(zVar, "file");
        return this.f11995e.q(r(zVar, "source", "file"));
    }

    public z r(z zVar, String str, String str2) {
        ae.r.f(zVar, "path");
        ae.r.f(str, "functionName");
        ae.r.f(str2, "parameterName");
        return zVar;
    }

    public z s(z zVar, String str) {
        ae.r.f(zVar, "path");
        ae.r.f(str, "functionName");
        return zVar;
    }

    public String toString() {
        return ae.i0.b(getClass()).b() + '(' + this.f11995e + ')';
    }
}
