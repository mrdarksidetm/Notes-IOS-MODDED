package androidx.lifecycle;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, w> f4405a = new LinkedHashMap();

    public final void a() {
        Iterator<w> it = this.f4405a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f4405a.clear();
    }

    public final w b(String str) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f4405a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f4405a.keySet());
    }

    public final void d(String str, w wVar) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(wVar, "viewModel");
        w wVarPut = this.f4405a.put(str, wVar);
        if (wVarPut != null) {
            wVarPut.onCleared();
        }
    }
}
