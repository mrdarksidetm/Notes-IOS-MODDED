package af;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k0<K, V> extends q0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.f f776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(we.b<K> bVar, we.b<V> bVar2) {
        super(bVar, bVar2, null);
        ae.r.f(bVar, "kSerializer");
        ae.r.f(bVar2, "vSerializer");
        this.f776c = new j0(bVar.getDescriptor(), bVar2.getDescriptor());
    }

    @Override // af.q0, we.b, we.h, we.a
    public ye.f getDescriptor() {
        return this.f776c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> a() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap<K, V> linkedHashMap) {
        ae.r.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap<K, V> linkedHashMap, int i10) {
        ae.r.f(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        ae.r.f(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map<K, ? extends V> map) {
        ae.r.f(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> k(Map<K, ? extends V> map) {
        ae.r.f(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(LinkedHashMap<K, V> linkedHashMap) {
        ae.r.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
