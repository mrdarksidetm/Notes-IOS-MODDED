package z5;

import md.i0;
import t0.o;
import z5.b;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final b a(Object obj, o1.c cVar, o1.c cVar2, o1.c cVar3, l<? super b.c.C0496c, i0> lVar, l<? super b.c.d, i0> lVar2, l<? super b.c.C0495b, i0> lVar3, y1.f fVar, int i10, t0.l lVar4, int i11, int i12) {
        lVar4.e(533921043);
        o1.c cVar4 = (i12 & 2) != 0 ? null : cVar;
        o1.c cVar5 = (i12 & 4) != 0 ? null : cVar2;
        o1.c cVar6 = (i12 & 8) != 0 ? cVar5 : cVar3;
        l<? super b.c.C0496c, i0> lVar5 = (i12 & 16) != 0 ? null : lVar;
        l<? super b.c.d, i0> lVar6 = (i12 & 32) != 0 ? null : lVar2;
        l<? super b.c.C0495b, i0> lVar7 = (i12 & 64) != 0 ? null : lVar3;
        y1.f fVarB = (i12 & 128) != 0 ? y1.f.f23237a.b() : fVar;
        int iB = (i12 & 256) != 0 ? n1.f.S.b() : i10;
        if (o.I()) {
            o.U(533921043, i11, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:44)");
        }
        int i13 = i11 << 3;
        b bVarD = c.d(obj, g.c(h.a(), lVar4, 6), cVar4, cVar5, cVar6, lVar5, lVar6, lVar7, fVarB, iB, lVar4, 37448 | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), 0);
        if (o.I()) {
            o.T();
        }
        lVar4.K();
        return bVarD;
    }
}
