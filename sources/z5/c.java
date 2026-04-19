package z5;

import android.graphics.drawable.Drawable;
import b2.v0;
import j6.h;
import k1.l;
import k6.c;
import md.i0;
import t0.o;
import z5.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f24214a = new a();

    public static final class a implements n6.d {
        a() {
        }

        @Override // n6.d
        public Drawable d() {
            return null;
        }
    }

    private static final boolean c(long j10) {
        return ((double) l.i(j10)) >= 0.5d && ((double) l.g(j10)) >= 0.5d;
    }

    public static final b d(Object obj, x5.e eVar, o1.c cVar, o1.c cVar2, o1.c cVar3, zd.l<? super b.c.C0496c, i0> lVar, zd.l<? super b.c.d, i0> lVar2, zd.l<? super b.c.C0495b, i0> lVar3, y1.f fVar, int i10, t0.l lVar4, int i11, int i12) {
        lVar4.e(2140758544);
        o1.c cVar4 = (i12 & 4) != 0 ? null : cVar;
        o1.c cVar5 = (i12 & 8) != 0 ? null : cVar2;
        o1.c cVar6 = (i12 & 16) != 0 ? cVar5 : cVar3;
        zd.l<? super b.c.C0496c, i0> lVar5 = (i12 & 32) != 0 ? null : lVar;
        zd.l<? super b.c.d, i0> lVar6 = (i12 & 64) != 0 ? null : lVar2;
        zd.l<? super b.c.C0495b, i0> lVar7 = (i12 & 128) == 0 ? lVar3 : null;
        y1.f fVarB = (i12 & 256) != 0 ? y1.f.f23237a.b() : fVar;
        int iB = (i12 & 512) != 0 ? n1.f.S.b() : i10;
        if (o.I()) {
            o.U(2140758544, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:83)");
        }
        int i13 = i11 >> 12;
        b bVarE = e(obj, eVar, j.h(cVar4, cVar5, cVar6), j.d(lVar5, lVar6, lVar7), fVarB, iB, lVar4, (57344 & i13) | 72 | (i13 & 458752), 0);
        if (o.I()) {
            o.T();
        }
        lVar4.K();
        return bVarE;
    }

    public static final b e(Object obj, x5.e eVar, zd.l<? super b.c, ? extends b.c> lVar, zd.l<? super b.c, i0> lVar2, y1.f fVar, int i10, t0.l lVar3, int i11, int i12) {
        lVar3.e(-2020614074);
        if ((i12 & 4) != 0) {
            lVar = b.f24176v.a();
        }
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        if ((i12 & 16) != 0) {
            fVar = y1.f.f23237a.b();
        }
        if ((i12 & 32) != 0) {
            i10 = n1.f.S.b();
        }
        if (o.I()) {
            o.U(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        j6.h hVarE = j.e(obj, lVar3, 8);
        i(hVarE);
        lVar3.e(-492369756);
        Object objF = lVar3.f();
        if (objF == t0.l.f20813a.a()) {
            objF = new b(hVarE, eVar);
            lVar3.E(objF);
        }
        lVar3.K();
        b bVar = (b) objF;
        bVar.K(lVar);
        bVar.F(lVar2);
        bVar.C(fVar);
        bVar.D(i10);
        bVar.H(((Boolean) lVar3.P(v0.a())).booleanValue());
        bVar.E(eVar);
        bVar.I(hVarE);
        bVar.d();
        if (o.I()) {
            o.T();
        }
        lVar3.K();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k6.i f(long j10) {
        if (j10 == l.f14359b.a()) {
            return k6.i.f14419d;
        }
        if (!c(j10)) {
            return null;
        }
        float fI = l.i(j10);
        k6.c cVarA = !Float.isInfinite(fI) && !Float.isNaN(fI) ? k6.a.a(ce.c.d(l.i(j10))) : c.b.f14406a;
        float fG = l.g(j10);
        return new k6.i(cVarA, (Float.isInfinite(fG) || Float.isNaN(fG)) ? false : true ? k6.a.a(ce.c.d(l.g(j10))) : c.b.f14406a);
    }

    private static final Void g(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void h(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return g(str, str2);
    }

    private static final void i(j6.h hVar) {
        Object objM = hVar.m();
        if (objM instanceof h.a) {
            g("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new md.i();
        }
        if (objM instanceof l1.v0) {
            h("ImageBitmap", null, 2, null);
            throw new md.i();
        }
        if (objM instanceof p1.d) {
            h("ImageVector", null, 2, null);
            throw new md.i();
        }
        if (objM instanceof o1.c) {
            h("Painter", null, 2, null);
            throw new md.i();
        }
        if (!(hVar.M() == null)) {
            throw new IllegalArgumentException("request.target must be null.".toString());
        }
    }
}
