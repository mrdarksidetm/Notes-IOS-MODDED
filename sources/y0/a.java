package y0;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends nd.h<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    public final boolean d(E e10) {
        if ((e10 instanceof Object ? e10 : null) instanceof Map.Entry) {
            return f(e10);
        }
        return false;
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public final boolean l(E e10) {
        if ((e10 instanceof Object ? e10 : null) instanceof Map.Entry) {
            return n(e10);
        }
        return false;
    }

    public abstract boolean n(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return l((Map.Entry) obj);
        }
        return false;
    }
}
