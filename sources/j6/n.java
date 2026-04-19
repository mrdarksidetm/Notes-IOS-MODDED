package j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable<md.s<? extends String, ? extends c>>, be.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14045b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f14046c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, c> f14047a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, c> f14048a;

        public a(n nVar) {
            this.f14048a = r0.v(nVar.f14047a);
        }

        public final n a() {
            return new n(o6.c.b(this.f14048a), null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f14049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f14050b;

        public final String a() {
            return this.f14050b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (ae.r.b(this.f14049a, cVar.f14049a) && ae.r.b(this.f14050b, cVar.f14050b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f14049a;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f14050b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Entry(value=" + this.f14049a + ", memoryCacheKey=" + this.f14050b + ')';
        }
    }

    public n() {
        this(r0.e());
    }

    private n(Map<String, c> map) {
        this.f14047a = map;
    }

    public /* synthetic */ n(Map map, ae.j jVar) {
        this(map);
    }

    public final Map<String, String> d() {
        if (isEmpty()) {
            return r0.e();
        }
        Map<String, c> map = this.f14047a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String strA = entry.getValue().a();
            if (strA != null) {
                linkedHashMap.put(entry.getKey(), strA);
            }
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && ae.r.b(this.f14047a, ((n) obj).f14047a);
    }

    public final a f() {
        return new a(this);
    }

    public int hashCode() {
        return this.f14047a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f14047a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<md.s<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f14047a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(x.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f14047a + ')';
    }
}
