package uf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f21816a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f21817b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f21818c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f21819d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f21820e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<x> f21821f = null;

    public void a(x xVar) {
        if (this.f21821f == null) {
            this.f21821f = new ArrayList();
        }
        this.f21821f.add(xVar);
    }

    public void b(s sVar) {
        sVar.m();
        sVar.j(this);
        s sVar2 = this.f21818c;
        if (sVar2 != null) {
            sVar2.f21820e = sVar;
            sVar.f21819d = sVar2;
        } else {
            this.f21817b = sVar;
        }
        this.f21818c = sVar;
    }

    public s c() {
        return this.f21817b;
    }

    public s d() {
        return this.f21818c;
    }

    public s e() {
        return this.f21820e;
    }

    public s f() {
        return this.f21816a;
    }

    public List<x> g() {
        List<x> list = this.f21821f;
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public void h(s sVar) {
        sVar.m();
        s sVar2 = this.f21820e;
        sVar.f21820e = sVar2;
        if (sVar2 != null) {
            sVar2.f21819d = sVar;
        }
        sVar.f21819d = this;
        this.f21820e = sVar;
        s sVar3 = this.f21816a;
        sVar.f21816a = sVar3;
        if (sVar.f21820e == null) {
            sVar3.f21818c = sVar;
        }
    }

    public void i(s sVar) {
        sVar.m();
        s sVar2 = this.f21819d;
        sVar.f21819d = sVar2;
        if (sVar2 != null) {
            sVar2.f21820e = sVar;
        }
        sVar.f21820e = this;
        this.f21819d = sVar;
        s sVar3 = this.f21816a;
        sVar.f21816a = sVar3;
        if (sVar.f21819d == null) {
            sVar3.f21817b = sVar;
        }
    }

    protected void j(s sVar) {
        this.f21816a = sVar;
    }

    public void k(List<x> list) {
        if (list.isEmpty()) {
            this.f21821f = null;
        } else {
            this.f21821f = new ArrayList(list);
        }
    }

    protected String l() {
        return "";
    }

    public void m() {
        s sVar = this.f21819d;
        if (sVar != null) {
            sVar.f21820e = this.f21820e;
        } else {
            s sVar2 = this.f21816a;
            if (sVar2 != null) {
                sVar2.f21817b = this.f21820e;
            }
        }
        s sVar3 = this.f21820e;
        if (sVar3 != null) {
            sVar3.f21819d = sVar;
        } else {
            s sVar4 = this.f21816a;
            if (sVar4 != null) {
                sVar4.f21818c = sVar;
            }
        }
        this.f21816a = null;
        this.f21820e = null;
        this.f21819d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + l() + "}";
    }
}
