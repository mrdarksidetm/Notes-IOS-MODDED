package l0;

import k1.h;
import k1.k;
import k1.m;
import l1.b1;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // l0.a
    public b1 c(long j10, float f10, float f11, float f12, float f13, r rVar) {
        if (((f10 + f11) + f12) + f13 == 0.0f) {
            return new b1.b(m.c(j10));
        }
        h hVarC = m.c(j10);
        r rVar2 = r.Ltr;
        return new b1.c(k.b(hVarC, k1.b.b(rVar == rVar2 ? f10 : f11, 0.0f, 2, null), k1.b.b(rVar == rVar2 ? f11 : f10, 0.0f, 2, null), k1.b.b(rVar == rVar2 ? f12 : f13, 0.0f, 2, null), k1.b.b(rVar == rVar2 ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ae.r.b(g(), fVar.g()) && ae.r.b(f(), fVar.f()) && ae.r.b(d(), fVar.d()) && ae.r.b(e(), fVar.e());
    }

    @Override // l0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f a(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public int hashCode() {
        return (((((g().hashCode() * 31) + f().hashCode()) * 31) + d().hashCode()) * 31) + e().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + g() + ", topEnd = " + f() + ", bottomEnd = " + d() + ", bottomStart = " + e() + ')';
    }
}
