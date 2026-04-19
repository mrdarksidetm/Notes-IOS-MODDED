package androidx.lifecycle;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4.m f4381a;

    public r(o4.m mVar) {
        ae.r.f(mVar, "provider");
        this.f4381a = mVar;
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        ae.r.f(eVar, "source");
        ae.r.f(aVar, "event");
        if (aVar == g.a.ON_CREATE) {
            eVar.getLifecycle().c(this);
            this.f4381a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
