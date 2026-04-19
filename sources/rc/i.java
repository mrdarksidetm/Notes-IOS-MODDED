package rc;

import java.util.HashMap;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.c f19281c;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (i.this.f19280b == null) {
                return;
            }
            String str = iVar.f20503a;
            cc.b.f("MouseCursorChannel", "Received '" + str + "' message.");
            byte b10 = -1;
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    b10 = 0;
                }
                if (b10 != 0) {
                    return;
                }
                try {
                    i.this.f19280b.a((String) ((HashMap) iVar.f20504b).get("kind"));
                    dVar.success(Boolean.TRUE);
                } catch (Exception e10) {
                    dVar.error("error", "Error when setting cursors: " + e10.getMessage(), null);
                }
            } catch (Exception e11) {
                dVar.error("error", "Unhandled error: " + e11.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public i(fc.a aVar) {
        a aVar2 = new a();
        this.f19281c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/mousecursor", sc.q.f20518b);
        this.f19279a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f19280b = bVar;
    }
}
