package rc;

import java.util.HashMap;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.c f19284b;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            dVar.success(null);
        }
    }

    public j(fc.a aVar) {
        a aVar2 = new a();
        this.f19284b = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/navigation", sc.f.f20502a);
        this.f19283a = jVar;
        jVar.e(aVar2);
    }

    public void a() {
        cc.b.f("NavigationChannel", "Sending message to pop route.");
        this.f19283a.c("popRoute", null);
    }

    public void b(String str) {
        cc.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap map = new HashMap();
        map.put("location", str);
        this.f19283a.c("pushRouteInformation", map);
    }

    public void c(String str) {
        cc.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f19283a.c("setInitialRoute", str);
    }
}
