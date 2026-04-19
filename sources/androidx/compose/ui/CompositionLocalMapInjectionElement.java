package androidx.compose.ui;

import a2.r0;
import ae.r;
import t0.w;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends r0<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f2632b;

    public CompositionLocalMapInjectionElement(w wVar) {
        this.f2632b = wVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && r.b(((CompositionLocalMapInjectionElement) obj).f2632b, this.f2632b);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.f2632b);
    }

    @Override // a2.r0
    public int hashCode() {
        return this.f2632b.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(d dVar) {
        dVar.a2(this.f2632b);
    }
}
