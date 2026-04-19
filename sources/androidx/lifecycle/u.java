package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.y;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class u extends y.d implements y.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f4388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y.b f4389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f4390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f4391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x4.d f4392f;

    public u(Application application, x4.f fVar, Bundle bundle) {
        ae.r.f(fVar, "owner");
        this.f4392f = fVar.getSavedStateRegistry();
        this.f4391e = fVar.getLifecycle();
        this.f4390d = bundle;
        this.f4388b = application;
        this.f4389c = application != null ? y.a.f4397c.b(application) : new y.a();
    }

    @Override // androidx.lifecycle.y.d
    public void a(w wVar) {
        ae.r.f(wVar, "viewModel");
        if (this.f4391e != null) {
            x4.d dVar = this.f4392f;
            ae.r.c(dVar);
            g gVar = this.f4391e;
            ae.r.c(gVar);
            f.a(wVar, dVar, gVar);
        }
    }

    public final <T extends w> T b(String str, Class<T> cls) {
        T t10;
        Application application;
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(cls, "modelClass");
        g gVar = this.f4391e;
        if (gVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = o4.a.class.isAssignableFrom(cls);
        Constructor constructorC = o4.o.c(cls, (!zIsAssignableFrom || this.f4388b == null) ? o4.o.f16356b : o4.o.f16355a);
        if (constructorC == null) {
            return this.f4388b != null ? (T) this.f4389c.create(cls) : (T) y.c.Companion.a().create(cls);
        }
        x4.d dVar = this.f4392f;
        ae.r.c(dVar);
        s sVarB = f.b(dVar, gVar, str, this.f4390d);
        if (!zIsAssignableFrom || (application = this.f4388b) == null) {
            t10 = (T) o4.o.d(cls, constructorC, sVarB.b());
        } else {
            ae.r.c(application);
            t10 = (T) o4.o.d(cls, constructorC, application, sVarB.b());
        }
        t10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", sVarB);
        return t10;
    }

    @Override // androidx.lifecycle.y.b
    public <T extends w> T create(Class<T> cls) {
        ae.r.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.y.b
    public <T extends w> T create(Class<T> cls, q4.a aVar) {
        ae.r.f(cls, "modelClass");
        ae.r.f(aVar, "extras");
        String str = (String) aVar.a(y.c.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(t.f4385a) == null || aVar.a(t.f4386b) == null) {
            if (this.f4391e != null) {
                return (T) b(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(y.a.f4399e);
        boolean zIsAssignableFrom = o4.a.class.isAssignableFrom(cls);
        Constructor constructorC = o4.o.c(cls, (!zIsAssignableFrom || application == null) ? o4.o.f16356b : o4.o.f16355a);
        return constructorC == null ? (T) this.f4389c.create(cls, aVar) : (!zIsAssignableFrom || application == null) ? (T) o4.o.d(cls, constructorC, t.a(aVar)) : (T) o4.o.d(cls, constructorC, application, t.a(aVar));
    }
}
