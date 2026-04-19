package com.amazon.a.b;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends com.amazon.a.a.d.b>, c<? extends com.amazon.a.a.d.b>> f7552a = new HashMap();

    private static final class a implements c<com.amazon.a.a.n.a.a.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, com.amazon.a.a.i.c> f7555a;

        private a() {
            this.f7555a = new HashMap<String, com.amazon.a.a.i.c>() { // from class: com.amazon.a.b.f.a.1
                {
                    put("NO_INTERNET", e.f7545d);
                    put("INVALID_CONTENT_ID", e.f7546e);
                    put("INTERNAL_SERVICE_ERROR", e.f7547f);
                }
            };
        }

        @Override // com.amazon.a.b.f.c
        public com.amazon.a.a.i.c a(com.amazon.a.a.n.a.a.f fVar) {
            com.amazon.a.a.i.c cVar = this.f7555a.get(fVar.b());
            return cVar != null ? cVar : e.f7546e;
        }
    }

    private static final class b implements c<com.amazon.a.b.a.a> {
        private b() {
        }

        @Override // com.amazon.a.b.f.c
        public com.amazon.a.a.i.c a(com.amazon.a.b.a.a aVar) {
            return aVar.d().a(h.EXPIRATION) ? e.f7545d : e.f7546e;
        }
    }

    private interface c<T extends com.amazon.a.a.d.b> {
        com.amazon.a.a.i.c a(T t10);
    }

    public f() {
        Class<com.amazon.a.a.n.a.a.c> cls;
        com.amazon.a.a.i.c cVar;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            cls = com.amazon.a.a.n.a.a.c.class;
            cVar = e.f7543b;
        } else {
            cls = com.amazon.a.a.n.a.a.c.class;
            cVar = e.f7542a;
        }
        a(cls, cVar);
        com.amazon.a.a.i.c cVar2 = e.f7543b;
        a(com.amazon.a.a.n.a.a.b.class, cVar2);
        a(com.amazon.a.a.n.a.a.d.class, cVar2);
        a(com.amazon.a.a.n.a.a.a.class, e.f7544c);
        a(com.amazon.a.a.n.a.a.f.class, new a());
        com.amazon.a.a.i.c cVar3 = e.f7546e;
        a(com.amazon.a.a.n.a.a.g.class, cVar3);
        a(com.amazon.a.a.n.a.a.h.class, cVar3);
        a(com.amazon.a.b.a.a.class, new b());
        a(com.amazon.a.a.o.b.a.a.class, e.f7548g);
        a(com.amazon.a.a.o.b.a.b.class, cVar3);
        a(com.amazon.a.a.o.b.a.c.class, cVar3);
    }

    private void a(Class<? extends com.amazon.a.a.d.b> cls, final com.amazon.a.a.i.c cVar) {
        a(cls, new c<com.amazon.a.a.d.b>() { // from class: com.amazon.a.b.f.1
            @Override // com.amazon.a.b.f.c
            public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
                return cVar;
            }
        });
    }

    private void a(Class<? extends com.amazon.a.a.d.b> cls, c<? extends com.amazon.a.a.d.b> cVar) {
        com.amazon.a.a.o.a.a.b(this.f7552a.containsKey(cls), "mapping exists for type: " + cls);
        this.f7552a.put(cls, cVar);
    }

    public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
        c<? extends com.amazon.a.a.d.b> cVar = this.f7552a.get(bVar.getClass());
        if (cVar == null) {
            return null;
        }
        return cVar.a(bVar);
    }
}
