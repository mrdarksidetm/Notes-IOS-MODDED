package rc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.a<Object> f19411a;

    public r(fc.a aVar) {
        this.f19411a = new sc.a<>(aVar, "flutter/system", sc.e.f20501a);
    }

    public void a() {
        cc.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.f19411a.c(map);
    }
}
