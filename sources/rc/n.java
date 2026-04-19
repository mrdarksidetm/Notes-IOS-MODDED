package rc;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f19376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f19377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j.c f19378d;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (n.this.f19377c == null) {
                return;
            }
            String str = iVar.f20503a;
            Object obj = iVar.f20504b;
            str.hashCode();
            try {
                if (str.equals("ProcessText.processTextAction")) {
                    ArrayList arrayList = (ArrayList) obj;
                    n.this.f19377c.a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
                } else {
                    if (!str.equals("ProcessText.queryTextActions")) {
                        dVar.notImplemented();
                        return;
                    }
                    dVar.success(n.this.f19377c.b());
                }
            } catch (IllegalStateException e10) {
                dVar.error("error", e10.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, boolean z10, j.d dVar);

        Map<String, String> b();
    }

    public n(fc.a aVar, PackageManager packageManager) {
        a aVar2 = new a();
        this.f19378d = aVar2;
        this.f19376b = packageManager;
        sc.j jVar = new sc.j(aVar, "flutter/processtext", sc.q.f20518b);
        this.f19375a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f19377c = bVar;
    }
}
