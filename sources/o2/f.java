package o2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import l3.g;
import le.o;
import le.p;
import md.t;
import n2.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f16284a = new f();

    public static final class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o<Typeface> f16285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2.b f16286b;

        /* JADX WARN: Multi-variable type inference failed */
        a(o<? super Typeface> oVar, n2.b bVar) {
            this.f16285a = oVar;
            this.f16286b = bVar;
        }

        @Override // l3.g.c
        public void a(int i10) {
            this.f16285a.cancel(new IllegalStateException("Failed to load " + this.f16286b + " (reason=" + i10 + ", " + e.c(i10) + ')'));
        }

        @Override // l3.g.c
        public void b(Typeface typeface) {
            this.f16285a.resumeWith(t.b(typeface));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return g.f16287a.a(looperMyLooper);
    }

    @Override // n2.b.a
    public Object a(Context context, n2.b bVar, qd.d<? super Typeface> dVar) {
        return e(context, bVar, o2.a.f16272a, dVar);
    }

    @Override // n2.b.a
    public Typeface b(Context context, n2.b bVar) {
        throw new IllegalStateException(("GoogleFont only support async loading: " + bVar).toString());
    }

    public final Object e(Context context, n2.b bVar, b bVar2, qd.d<? super Typeface> dVar) {
        if (!(bVar instanceof d)) {
            throw new IllegalArgumentException(("Only GoogleFontImpl supported (actual " + bVar + ')').toString());
        }
        d dVar2 = (d) bVar;
        l3.e eVarG = dVar2.g();
        int i10 = dVar2.i();
        p pVar = new p(rd.c.c(dVar), 1);
        pVar.A();
        bVar2.a(context, eVarG, i10, f16284a.d(), new a(pVar, bVar));
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }
}
