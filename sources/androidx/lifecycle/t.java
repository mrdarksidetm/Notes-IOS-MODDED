package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.y;
import q4.a;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.b<x4.f> f4385a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b<o4.q> f4386b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.b<Bundle> f4387c = new a();

    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    public static final class b implements a.b<x4.f> {
        b() {
        }
    }

    public static final class c implements a.b<o4.q> {
        c() {
        }
    }

    public static final class d implements y.b {
        d() {
        }

        @Override // androidx.lifecycle.y.b
        public <T extends w> T create(Class<T> cls, q4.a aVar) {
            ae.r.f(cls, "modelClass");
            ae.r.f(aVar, "extras");
            return new o4.n();
        }
    }

    public static final q a(q4.a aVar) {
        ae.r.f(aVar, "<this>");
        x4.f fVar = (x4.f) aVar.a(f4385a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        o4.q qVar = (o4.q) aVar.a(f4386b);
        if (qVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f4387c);
        String str = (String) aVar.a(y.c.VIEW_MODEL_KEY);
        if (str != null) {
            return b(fVar, qVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final q b(x4.f fVar, o4.q qVar, String str, Bundle bundle) {
        o4.m mVarD = d(fVar);
        o4.n nVarE = e(qVar);
        q qVar2 = nVarE.a().get(str);
        if (qVar2 != null) {
            return qVar2;
        }
        q qVarA = q.f4374f.a(mVarD.b(str), bundle);
        nVarE.a().put(str, qVarA);
        return qVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends x4.f & o4.q> void c(T t10) {
        ae.r.f(t10, "<this>");
        g.b bVarB = t10.getLifecycle().b();
        if (!(bVarB == g.b.INITIALIZED || bVarB == g.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            o4.m mVar = new o4.m(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", mVar);
            t10.getLifecycle().a(new r(mVar));
        }
    }

    public static final o4.m d(x4.f fVar) {
        ae.r.f(fVar, "<this>");
        d.c cVarC = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        o4.m mVar = cVarC instanceof o4.m ? (o4.m) cVarC : null;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final o4.n e(o4.q qVar) {
        ae.r.f(qVar, "<this>");
        return (o4.n) new y(qVar, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", o4.n.class);
    }
}
