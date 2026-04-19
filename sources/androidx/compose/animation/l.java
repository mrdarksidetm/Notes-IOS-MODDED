package androidx.compose.animation;

import b0.w;
import c0.e0;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p<w2.p, w2.p, e0<w2.p>> f2184b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(boolean z10, p<? super w2.p, ? super w2.p, ? extends e0<w2.p>> pVar) {
        this.f2183a = z10;
        this.f2184b = pVar;
    }

    @Override // b0.w
    public boolean a() {
        return this.f2183a;
    }

    @Override // b0.w
    public e0<w2.p> b(long j10, long j11) {
        return this.f2184b.invoke(w2.p.b(j10), w2.p.b(j11));
    }
}
