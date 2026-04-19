package va;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22334a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f22335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ma.b f22336b;

        public <RemoteT extends b> a(Class<RemoteT> cls, ma.b<Object> bVar) {
            this.f22335a = cls;
            this.f22336b = bVar;
        }

        final ma.b a() {
            return this.f22336b;
        }

        final Class b() {
            return this.f22335a;
        }
    }

    public c(Set<a> set) {
        for (a aVar : set) {
            this.f22334a.put(aVar.b(), aVar.a());
        }
    }
}
