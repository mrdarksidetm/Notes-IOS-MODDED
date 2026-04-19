package sf;

import uf.a0;
import uf.s;
import uf.t;
import uf.y;
import uf.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements xf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f20587a;

    protected e(char c10) {
        this.f20587a = c10;
    }

    @Override // xf.a
    public char a() {
        return this.f20587a;
    }

    @Override // xf.a
    public int b(xf.b bVar, xf.b bVar2) {
        s gVar;
        if ((bVar.f() || bVar2.d()) && bVar2.b() % 3 != 0 && (bVar.b() + bVar2.b()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            i10 = 1;
            gVar = new uf.g(String.valueOf(this.f20587a));
        } else {
            gVar = new z(String.valueOf(this.f20587a) + this.f20587a);
        }
        y yVarC = y.c();
        yVarC.b(bVar.c(i10));
        a0 a0VarG = bVar.g();
        for (s sVar : t.a(a0VarG, bVar2.e())) {
            gVar.b(sVar);
            yVarC.a(sVar.g());
        }
        yVarC.b(bVar2.a(i10));
        gVar.k(yVarC.d());
        a0VarG.h(gVar);
        return i10;
    }

    @Override // xf.a
    public int c() {
        return 1;
    }

    @Override // xf.a
    public char d() {
        return this.f20587a;
    }
}
