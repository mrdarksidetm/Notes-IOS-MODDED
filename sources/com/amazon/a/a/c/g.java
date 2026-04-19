package com.amazon.a.a.c;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7130a = new com.amazon.a.a.o.c("EventManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<b, e<?>> f7131b = new HashMap();

    @Override // com.amazon.a.a.c.f
    public void a(a aVar) {
        b bVarA = aVar.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7130a.a("Posting event: " + bVarA);
        }
        if (this.f7131b.containsKey(bVarA)) {
            this.f7131b.get(bVarA).a(aVar);
        } else if (com.amazon.a.a.o.c.f7483a) {
            f7130a.a("No registered listeners, returning");
        }
    }

    @Override // com.amazon.a.a.c.f
    public <T extends a> void a(c<T> cVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "listener");
        com.amazon.a.a.o.a.a.a();
        b bVarA = cVar.a();
        f7130a.a("Registering listener for event: " + bVarA + ", " + cVar);
        e<?> eVar = this.f7131b.get(bVarA);
        if (eVar == null) {
            eVar = new e<>();
            this.f7131b.put(bVarA, eVar);
        }
        eVar.a(cVar);
    }
}
