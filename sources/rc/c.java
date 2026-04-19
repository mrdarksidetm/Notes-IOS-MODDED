package rc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.j f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gc.a f19251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<j.d>> f19252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j.c f19253d;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            int iIntValue;
            String str;
            String strB;
            if (c.this.f19251b == null) {
                return;
            }
            String str2 = iVar.f20503a;
            Map map = (Map) iVar.b();
            cc.b.f("DeferredComponentChannel", "Received '" + str2 + "' message.");
            iIntValue = ((Integer) map.get("loadingUnitId")).intValue();
            str = (String) map.get("componentName");
            str2.hashCode();
            switch (str2) {
                case "uninstallDeferredComponent":
                    c.this.f19251b.c(iIntValue, str);
                    strB = null;
                    break;
                case "getDeferredComponentInstallState":
                    strB = c.this.f19251b.b(iIntValue, str);
                    break;
                case "installDeferredComponent":
                    c.this.f19251b.a(iIntValue, str);
                    if (!c.this.f19252c.containsKey(str)) {
                        c.this.f19252c.put(str, new ArrayList());
                    }
                    ((List) c.this.f19252c.get(str)).add(dVar);
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
            dVar.success(strB);
        }
    }

    public c(fc.a aVar) {
        a aVar2 = new a();
        this.f19253d = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/deferredcomponent", sc.q.f20518b);
        this.f19250a = jVar;
        jVar.e(aVar2);
        this.f19251b = cc.a.e().a();
        this.f19252c = new HashMap();
    }

    public void c(gc.a aVar) {
        this.f19251b = aVar;
    }
}
