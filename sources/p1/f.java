package p1;

import java.util.ArrayList;
import java.util.List;
import p1.h;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<h> f17932a = new ArrayList<>(32);

    public final f a() {
        this.f17932a.add(h.b.f17964c);
        return this;
    }

    public final List<h> b() {
        return this.f17932a;
    }

    public final f c(float f10) {
        this.f17932a.add(new h.d(f10));
        return this;
    }

    public final f d(float f10) {
        this.f17932a.add(new h.l(f10));
        return this;
    }

    public final f e(float f10, float f11) {
        this.f17932a.add(new h.m(f10, f11));
        return this;
    }

    public final f f(float f10, float f11) {
        this.f17932a.add(new h.f(f10, f11));
        return this;
    }

    public final f g(float f10, float f11) {
        this.f17932a.add(new h.n(f10, f11));
        return this;
    }

    public final f h(float f10, float f11, float f12, float f13) {
        this.f17932a.add(new h.o(f10, f11, f12, f13));
        return this;
    }

    public final f i(float f10, float f11) {
        this.f17932a.add(new h.i(f10, f11));
        return this;
    }

    public final f j(float f10, float f11) {
        this.f17932a.add(new h.q(f10, f11));
        return this;
    }

    public final f k(float f10) {
        this.f17932a.add(new h.r(f10));
        return this;
    }
}
