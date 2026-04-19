package rc;

import java.util.ArrayList;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.c f19409c;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (q.this.f19408b == null) {
                cc.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = iVar.f20503a;
            Object obj = iVar.f20504b;
            cc.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.notImplemented();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                q.this.f19408b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e10) {
                dVar.error("error", e10.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, j.d dVar);
    }

    public q(fc.a aVar) {
        a aVar2 = new a();
        this.f19409c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/spellcheck", sc.q.f20518b);
        this.f19407a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f19408b = bVar;
    }
}
