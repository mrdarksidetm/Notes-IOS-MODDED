package x4;

import ae.j;
import ae.r;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import x4.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f22963g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f22966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.C0477b f22968e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.b<String, c> f22964a = new t.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22969f = true;

    public interface a {
        void a(f fVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d dVar, o4.e eVar, g.a aVar) {
        boolean z10;
        r.f(dVar, "this$0");
        r.f(eVar, "<anonymous parameter 0>");
        r.f(aVar, "event");
        if (aVar == g.a.ON_START) {
            z10 = true;
        } else if (aVar != g.a.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        dVar.f22969f = z10;
    }

    public final Bundle b(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!this.f22967d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f22966c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f22966c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f22966c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f22966c = null;
        }
        return bundle2;
    }

    public final c c(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        for (Map.Entry<String, c> entry : this.f22964a) {
            r.e(entry, "components");
            String key = entry.getKey();
            c value = entry.getValue();
            if (r.b(key, str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.g gVar) {
        r.f(gVar, "lifecycle");
        if (!(!this.f22965b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        gVar.a(new i() { // from class: x4.c
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar, g.a aVar) {
                d.d(this.f22962a, eVar, aVar);
            }
        });
        this.f22965b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f22965b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f22967d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f22966c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f22967d = true;
    }

    public final void g(Bundle bundle) {
        r.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f22966c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        t.b<String, c>.d dVarD = this.f22964a.d();
        r.e(dVarD, "this.components.iteratorWithAdditions()");
        while (dVarD.hasNext()) {
            Map.Entry next = dVarD.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(cVar, "provider");
        if (!(this.f22964a.l(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends a> cls) {
        r.f(cls, "clazz");
        if (!this.f22969f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        b.C0477b c0477b = this.f22968e;
        if (c0477b == null) {
            c0477b = new b.C0477b(this);
        }
        this.f22968e = c0477b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            b.C0477b c0477b2 = this.f22968e;
            if (c0477b2 != null) {
                String name = cls.getName();
                r.e(name, "clazz.name");
                c0477b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void j(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f22964a.n(str);
    }
}
