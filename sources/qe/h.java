package qe;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final void a(qd.g gVar, Throwable th) {
        Iterator<le.k0> it = g.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().o(gVar, th);
            } catch (Throwable th2) {
                g.b(le.l0.b(th, th2));
            }
        }
        try {
            md.f.a(th, new i(gVar));
        } catch (Throwable unused) {
        }
        g.b(th);
    }
}
