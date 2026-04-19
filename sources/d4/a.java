package d4;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d4.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nd.c0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<d.a<?>, Object> f9479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9480b;

    /* JADX INFO: renamed from: d4.a$a, reason: collision with other inner class name */
    static final class C0225a extends s implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0225a f9481a = new C0225a();

        C0225a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            r.f(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public a(Map<d.a<?>, Object> map, boolean z10) {
        r.f(map, "preferencesMap");
        this.f9479a = map;
        this.f9480b = new AtomicBoolean(z10);
    }

    public /* synthetic */ a(Map map, boolean z10, int i10, j jVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // d4.d
    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f9479a);
        r.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // d4.d
    public <T> T b(d.a<T> aVar) {
        r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return (T) this.f9479a.get(aVar);
    }

    public final void e() {
        if (!(!this.f9480b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return r.b(this.f9479a, ((a) obj).f9479a);
        }
        return false;
    }

    public final void f() {
        e();
        this.f9479a.clear();
    }

    public final void g() {
        this.f9480b.set(true);
    }

    public final void h(d.b<?>... bVarArr) {
        r.f(bVarArr, "pairs");
        e();
        for (d.b<?> bVar : bVarArr) {
            k(bVar.a(), bVar.b());
        }
    }

    public int hashCode() {
        return this.f9479a.hashCode();
    }

    public final <T> T i(d.a<T> aVar) {
        r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        e();
        return (T) this.f9479a.remove(aVar);
    }

    public final <T> void j(d.a<T> aVar, T t10) {
        r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        k(aVar, t10);
    }

    public final void k(d.a<?> aVar, Object obj) {
        Map<d.a<?>, Object> map;
        r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        e();
        if (obj == null) {
            i(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f9479a;
            obj = Collections.unmodifiableSet(c0.H0((Iterable) obj));
            r.e(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f9479a;
        }
        map.put(aVar, obj);
    }

    public String toString() {
        return c0.h0(this.f9479a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0225a.f9481a, 24, null);
    }
}
