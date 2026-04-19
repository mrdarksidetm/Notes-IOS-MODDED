package qf;

import uf.a0;
import uf.s;
import uf.t;
import uf.y;
import xf.b;

/* JADX INFO: loaded from: classes2.dex */
public class a implements xf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19117a;

    public a(boolean z10) {
        this.f19117a = z10;
    }

    @Override // xf.a
    public char a() {
        return '~';
    }

    @Override // xf.a
    public int b(b bVar, b bVar2) {
        if (bVar.length() != bVar2.length() || bVar.length() > 2) {
            return 0;
        }
        a0 a0VarG = bVar.g();
        pf.a aVar = new pf.a();
        y yVar = new y();
        yVar.b(bVar.c(bVar.length()));
        for (s sVar : t.a(a0VarG, bVar2.e())) {
            aVar.b(sVar);
            yVar.a(sVar.g());
        }
        yVar.b(bVar2.a(bVar2.length()));
        aVar.k(yVar.d());
        a0VarG.h(aVar);
        return bVar.length();
    }

    @Override // xf.a
    public int c() {
        return this.f19117a ? 2 : 1;
    }

    @Override // xf.a
    public char d() {
        return '~';
    }
}
