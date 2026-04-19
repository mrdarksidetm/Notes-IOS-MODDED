package bf;

import cf.z0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends h implements Map<String, h>, be.a {
    public static final a Companion = new a(null);
    private final Map<String, h> content;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final we.b<u> serializer() {
            return v.f5848a;
        }
    }

    static final class b extends ae.s implements zd.l<Map.Entry<? extends String, ? extends h>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5847a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, ? extends h> entry) {
            ae.r.f(entry, "<name for destructuring parameter 0>");
            String key = entry.getKey();
            h value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            z0.c(sb2, key);
            sb2.append(':');
            sb2.append(value);
            String string = sb2.toString();
            ae.r.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Map<String, ? extends h> map) {
        super(null);
        ae.r.f(map, "content");
        this.content = map;
    }

    public boolean a(String str) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.content.containsKey(str);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h compute(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h computeIfAbsent(String str, Function<? super String, ? extends h> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h computeIfPresent(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h) {
            return d((h) obj);
        }
        return false;
    }

    public boolean d(h hVar) {
        ae.r.f(hVar, "value");
        return this.content.containsValue(hVar);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, h>> entrySet() {
        return l();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ae.r.b(this.content, obj);
    }

    public h f(String str) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.content.get(str);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h get(Object obj) {
        if (obj instanceof String) {
            return f((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return n();
    }

    public Set<Map.Entry<String, h>> l() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h merge(String str, h hVar, BiFunction<? super h, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<String> n() {
        return this.content.keySet();
    }

    public int o() {
        return this.content.size();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h put(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends h> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h putIfAbsent(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection<h> r() {
        return this.content.values();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h replace(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, h hVar, h hVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public h remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return o();
    }

    public String toString() {
        return c0.h0(this.content.entrySet(), com.amazon.a.a.o.b.f.f7478a, "{", "}", 0, null, b.f5847a, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<h> values() {
        return r();
    }
}
