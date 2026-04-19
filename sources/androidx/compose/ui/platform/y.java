package androidx.compose.ui.platform;

import a2.f1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class y implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<y> f3105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f3106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f3107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g2.j f3108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g2.j f3109f;

    public y(int i10, List<y> list, Float f10, Float f11, g2.j jVar, g2.j jVar2) {
        this.f3104a = i10;
        this.f3105b = list;
        this.f3106c = f10;
        this.f3107d = f11;
        this.f3108e = jVar;
        this.f3109f = jVar2;
    }

    @Override // a2.f1
    public boolean O() {
        return this.f3105b.contains(this);
    }

    public final g2.j a() {
        return this.f3108e;
    }

    public final Float b() {
        return this.f3106c;
    }

    public final Float c() {
        return this.f3107d;
    }

    public final int d() {
        return this.f3104a;
    }

    public final g2.j e() {
        return this.f3109f;
    }

    public final void f(g2.j jVar) {
        this.f3108e = jVar;
    }

    public final void g(Float f10) {
        this.f3106c = f10;
    }

    public final void h(Float f10) {
        this.f3107d = f10;
    }

    public final void i(g2.j jVar) {
        this.f3109f = jVar;
    }
}
