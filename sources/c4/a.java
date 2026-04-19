package c4;

import ae.r;
import ae.s;
import android.content.Context;
import java.util.List;
import le.d1;
import le.n0;
import le.o0;
import le.w2;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    public static final class C0151a extends s implements l<Context, List<? extends a4.d<d4.d>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0151a f6378a = new C0151a();

        C0151a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<a4.d<d4.d>> invoke(Context context) {
            r.f(context, "it");
            return u.m();
        }
    }

    public static final de.a<Context, a4.f<d4.d>> a(String str, b4.b<d4.d> bVar, l<? super Context, ? extends List<? extends a4.d<d4.d>>> lVar, n0 n0Var) {
        r.f(str, "name");
        r.f(lVar, "produceMigrations");
        r.f(n0Var, "scope");
        return new c(str, bVar, lVar, n0Var);
    }

    public static /* synthetic */ de.a b(String str, b4.b bVar, l lVar, n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0151a.f6378a;
        }
        if ((i10 & 8) != 0) {
            n0Var = o0.a(d1.b().plus(w2.b(null, 1, null)));
        }
        return a(str, bVar, lVar, n0Var);
    }
}
