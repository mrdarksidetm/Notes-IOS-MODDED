package h1;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import l1.b0;
import md.i0;
import n1.a;
import w2.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2.d f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<n1.f, i0> f11800c;

    /* JADX WARN: Multi-variable type inference failed */
    private a(w2.d dVar, long j10, l<? super n1.f, i0> lVar) {
        this.f11798a = dVar;
        this.f11799b = j10;
        this.f11800c = lVar;
    }

    public /* synthetic */ a(w2.d dVar, long j10, l lVar, j jVar) {
        this(dVar, j10, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        n1.a aVar = new n1.a();
        w2.d dVar = this.f11798a;
        long j10 = this.f11799b;
        r rVar = r.Ltr;
        b0 b0VarB = l1.c.b(canvas);
        l<n1.f, i0> lVar = this.f11800c;
        a.C0358a c0358aR = aVar.r();
        w2.d dVarA = c0358aR.a();
        r rVarB = c0358aR.b();
        b0 b0VarC = c0358aR.c();
        long jD = c0358aR.d();
        a.C0358a c0358aR2 = aVar.r();
        c0358aR2.j(dVar);
        c0358aR2.k(rVar);
        c0358aR2.i(b0VarB);
        c0358aR2.l(j10);
        b0VarB.h();
        lVar.invoke(aVar);
        b0VarB.p();
        a.C0358a c0358aR3 = aVar.r();
        c0358aR3.j(dVarA);
        c0358aR3.k(rVarB);
        c0358aR3.i(b0VarC);
        c0358aR3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        w2.d dVar = this.f11798a;
        point.set(dVar.a1(dVar.n0(k1.l.i(this.f11799b))), dVar.a1(dVar.n0(k1.l.g(this.f11799b))));
        point2.set(point.x / 2, point.y / 2);
    }
}
