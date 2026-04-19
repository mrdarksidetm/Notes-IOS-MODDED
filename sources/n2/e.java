package n2;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.b;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    public static final class a extends b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.o<Typeface> f15782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f15783b;

        /* JADX WARN: Multi-variable type inference failed */
        a(le.o<? super Typeface> oVar, t0 t0Var) {
            this.f15782a = oVar;
            this.f15783b = t0Var;
        }

        @Override // androidx.core.content.res.b.e
        /* JADX INFO: renamed from: h */
        public void f(int i10) {
            this.f15782a.cancel(new IllegalStateException("Unable to load font " + this.f15783b + " (reason=" + i10 + ')'));
        }

        @Override // androidx.core.content.res.b.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            this.f15782a.resumeWith(md.t.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(t0 t0Var, Context context) {
        Typeface typefaceF = androidx.core.content.res.b.f(context, t0Var.d());
        ae.r.c(typefaceF);
        return typefaceF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(t0 t0Var, Context context, qd.d<? super Typeface> dVar) {
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        androidx.core.content.res.b.h(context, t0Var.d(), new a(pVar, t0Var), null);
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }
}
