package o4;

import android.os.Bundle;
import androidx.lifecycle.t;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x4.d f16349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f16351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final md.l f16352d;

    static final class a extends ae.s implements zd.a<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f16353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(0);
            this.f16353a = qVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return t.e(this.f16353a);
        }
    }

    public m(x4.d dVar, q qVar) {
        ae.r.f(dVar, "savedStateRegistry");
        ae.r.f(qVar, "viewModelStoreOwner");
        this.f16349a = dVar;
        this.f16352d = md.n.b(new a(qVar));
    }

    private final n c() {
        return (n) this.f16352d.getValue();
    }

    @Override // x4.d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f16351c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, androidx.lifecycle.q> entry : c().a().entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().c().a();
            if (!ae.r.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.f16350b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        d();
        Bundle bundle = this.f16351c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f16351c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f16351c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f16351c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f16350b) {
            return;
        }
        Bundle bundleB = this.f16349a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f16351c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f16351c = bundle;
        this.f16350b = true;
        c();
    }
}
