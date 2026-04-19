package rc;

import java.util.HashMap;
import java.util.Map;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.c f19261c;

    class a implements j.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<Long, Long> f19262a = new HashMap();

        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (f.this.f19260b != null) {
                String str = iVar.f20503a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.notImplemented();
                    return;
                } else {
                    try {
                        this.f19262a = f.this.f19260b.b();
                    } catch (IllegalStateException e10) {
                        dVar.error("error", e10.getMessage(), null);
                    }
                }
            }
            dVar.success(this.f19262a);
        }
    }

    public interface b {
        Map<Long, Long> b();
    }

    public f(sc.b bVar) {
        a aVar = new a();
        this.f19261c = aVar;
        sc.j jVar = new sc.j(bVar, "flutter/keyboard", sc.q.f20518b);
        this.f19259a = jVar;
        jVar.e(aVar);
    }

    public void b(b bVar) {
        this.f19260b = bVar;
    }
}
