package h0;

import a2.h1;
import androidx.compose.ui.e;
import f1.b;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends e.c implements h1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.c f11697n;

    public n0(b.c cVar) {
        this.f11697n = cVar;
    }

    @Override // a2.h1
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e0 r(w2.d dVar, Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var == null) {
            e0Var = new e0(0.0f, false, null, 7, null);
        }
        e0Var.d(k.f11671a.b(this.f11697n));
        return e0Var;
    }

    public final void b2(b.c cVar) {
        this.f11697n = cVar;
    }
}
