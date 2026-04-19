package androidx.lifecycle;

import androidx.lifecycle.g;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f4383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4384c;

    public s(String str, q qVar) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(qVar, "handle");
        this.f4382a = str;
        this.f4383b = qVar;
    }

    public final void a(x4.d dVar, g gVar) {
        ae.r.f(dVar, "registry");
        ae.r.f(gVar, "lifecycle");
        if (!(!this.f4384c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f4384c = true;
        gVar.a(this);
        dVar.h(this.f4382a, this.f4383b.c());
    }

    public final q b() {
        return this.f4383b;
    }

    public final boolean c() {
        return this.f4384c;
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        ae.r.f(eVar, "source");
        ae.r.f(aVar, "event");
        if (aVar == g.a.ON_DESTROY) {
            this.f4384c = false;
            eVar.getLifecycle().c(this);
        }
    }
}
