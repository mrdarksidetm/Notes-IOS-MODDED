package androidx.compose.foundation.gestures;

import androidx.compose.ui.e;
import md.x;
import z1.i;

/* JADX INFO: loaded from: classes.dex */
final class a extends e.c implements z1.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z1.g f2289o = i.b(x.a(e.h(), Boolean.TRUE));

    public a(boolean z10) {
        this.f2288n = z10;
    }

    public final void a2(boolean z10) {
        this.f2288n = z10;
    }

    @Override // z1.h
    public z1.g u0() {
        return this.f2288n ? this.f2289o : i.a();
    }
}
