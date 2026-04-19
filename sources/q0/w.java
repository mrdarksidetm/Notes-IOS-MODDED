package q0;

import androidx.compose.material3.MinimumInteractiveModifier;
import t0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<Boolean> f18923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<Boolean> f18924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f18925c;

    static final class a extends ae.s implements zd.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18926a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        a2<Boolean> a2VarE = t0.v.e(a.f18926a);
        f18923a = a2VarE;
        f18924b = a2VarE;
        float f10 = 48;
        f18925c = w2.i.b(w2.h.m(f10), w2.h.m(f10));
    }

    public static final a2<Boolean> b() {
        return f18923a;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        return eVar.h(MinimumInteractiveModifier.f2631b);
    }
}
