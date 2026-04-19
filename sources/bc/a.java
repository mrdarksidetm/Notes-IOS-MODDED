package bc;

import ae.r;
import java.util.List;
import java.util.Map;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f5697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f5698b;

    public a(b bVar, dev.fluttercommunity.plus.share.a aVar) {
        r.f(bVar, "share");
        r.f(aVar, "manager");
        this.f5697a = bVar;
        this.f5698b = aVar;
    }

    private final void a(i iVar) {
        if (!(iVar.f20504b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
    }

    private final void b(boolean z10, j.d dVar) {
        if (z10) {
            return;
        }
        dVar.success("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        r.f(iVar, "call");
        r.f(dVar, "result");
        a(iVar);
        this.f5698b.c(dVar);
        try {
            String str = iVar.f20503a;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1811378728) {
                    if (iHashCode != -743768819) {
                        if (iHashCode == 109400031 && str.equals("share")) {
                            b bVar = this.f5697a;
                            Object objA = iVar.a("text");
                            r.d(objA, "null cannot be cast to non-null type kotlin.String");
                            bVar.m((String) objA, (String) iVar.a("subject"), true);
                            b(true, dVar);
                            return;
                        }
                    } else if (str.equals("shareUri")) {
                        b bVar2 = this.f5697a;
                        Object objA2 = iVar.a("uri");
                        r.d(objA2, "null cannot be cast to non-null type kotlin.String");
                        bVar2.m((String) objA2, null, true);
                        b(true, dVar);
                        return;
                    }
                } else if (str.equals("shareFiles")) {
                    b bVar3 = this.f5697a;
                    Object objA3 = iVar.a("paths");
                    r.c(objA3);
                    bVar3.n((List) objA3, (List) iVar.a("mimeTypes"), (String) iVar.a("text"), (String) iVar.a("subject"), true);
                    b(true, dVar);
                    return;
                }
            }
            dVar.notImplemented();
        } catch (Throwable th) {
            this.f5698b.a();
            dVar.error("Share failed", th.getMessage(), th);
        }
    }
}
