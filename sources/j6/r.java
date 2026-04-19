package j6;

import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14061b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f14062c = new r(r0.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f14063a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final r a(Map<Class<?>, ? extends Object> map) {
            return new r(o6.c.b(map), null);
        }
    }

    private r(Map<Class<?>, ? extends Object> map) {
        this.f14063a = map;
    }

    public /* synthetic */ r(Map map, ae.j jVar) {
        this(map);
    }

    public final Map<Class<?>, Object> a() {
        return this.f14063a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && ae.r.b(this.f14063a, ((r) obj).f14063a);
    }

    public int hashCode() {
        return this.f14063a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f14063a + ')';
    }
}
