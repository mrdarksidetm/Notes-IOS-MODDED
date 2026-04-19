package td;

import ae.r;
import java.io.Serializable;
import java.lang.Enum;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
final class c<T extends Enum<T>> extends nd.c<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T[] f21370b;

    public c(T[] tArr) {
        r.f(tArr, "entries");
        this.f21370b = tArr;
    }

    @Override // nd.a
    public int a() {
        return this.f21370b.length;
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return false;
    }

    public boolean d(T t10) {
        r.f(t10, "element");
        return ((Enum) p.R(this.f21370b, t10.ordinal())) == t10;
    }

    @Override // nd.c, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        nd.c.f16106a.b(i10, this.f21370b.length);
        return this.f21370b[i10];
    }

    @Override // nd.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }

    public int l(T t10) {
        r.f(t10, "element");
        int iOrdinal = t10.ordinal();
        if (((Enum) p.R(this.f21370b, iOrdinal)) == t10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // nd.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public int n(T t10) {
        r.f(t10, "element");
        return indexOf(t10);
    }
}
