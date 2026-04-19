package b0;

import t0.h1;
import t0.v1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.animation.h f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.compose.animation.j f5106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1 f5107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f5108d;

    public j(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, w wVar) {
        this.f5105a = hVar;
        this.f5106b = jVar;
        this.f5107c = v1.a(f10);
        this.f5108d = wVar;
    }

    public /* synthetic */ j(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, w wVar, int i10, ae.j jVar2) {
        this(hVar, jVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : wVar);
    }

    public final androidx.compose.animation.j a() {
        return this.f5106b;
    }

    public final w b() {
        return this.f5108d;
    }

    public final androidx.compose.animation.h c() {
        return this.f5105a;
    }

    public final float d() {
        return this.f5107c.b();
    }
}
