package c1;

import ae.s;
import t0.o;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    static final class a extends s implements zd.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6295a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(null, 1, null);
        }
    }

    public static final d a(t0.l lVar, int i10) {
        lVar.e(15454635);
        if (o.I()) {
            o.U(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        e eVar = (e) b.b(new Object[0], e.f6273d.a(), null, a.f6295a, lVar, 3080, 4);
        eVar.i((g) lVar.P(i.b()));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return eVar;
    }
}
