package a3;

import ae.s;
import md.i0;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f389a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, i0> f390b = b1.c.c(210148896, false, a.f391a);

    static final class a extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f391a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:215)");
            }
            if (o.I()) {
                o.T();
            }
        }
    }

    public final p<l, Integer, i0> a() {
        return f390b;
    }
}
