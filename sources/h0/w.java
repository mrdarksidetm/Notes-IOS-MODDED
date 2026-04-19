package h0;

import a2.h1;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class w extends e.c implements h1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f11792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11793o;

    public w(float f10, boolean z10) {
        this.f11792n = f10;
        this.f11793o = z10;
    }

    @Override // a2.h1
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e0 r(w2.d dVar, Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var == null) {
            e0Var = new e0(0.0f, false, null, 7, null);
        }
        e0Var.f(this.f11792n);
        e0Var.e(this.f11793o);
        return e0Var;
    }

    public final void b2(boolean z10) {
        this.f11793o = z10;
    }

    public final void c2(float f10) {
        this.f11792n = f10;
    }
}
