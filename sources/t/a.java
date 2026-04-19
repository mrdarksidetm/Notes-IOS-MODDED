package t;

import java.util.HashMap;
import java.util.Map;
import t.b;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f20607e = new HashMap<>();

    @Override // t.b
    protected b.c<K, V> b(K k10) {
        return this.f20607e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f20607e.containsKey(k10);
    }

    @Override // t.b
    public V l(K k10, V v10) {
        b.c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.f20613b;
        }
        this.f20607e.put(k10, k(k10, v10));
        return null;
    }

    @Override // t.b
    public V n(K k10) {
        V v10 = (V) super.n(k10);
        this.f20607e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> o(K k10) {
        if (contains(k10)) {
            return this.f20607e.get(k10).f20615d;
        }
        return null;
    }
}
