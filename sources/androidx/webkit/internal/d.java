package androidx.webkit.internal;

import androidx.webkit.internal.a;
import f5.c;
import g5.l0;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class d extends f5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProxyControllerBoundaryInterface f4942a;

    private ProxyControllerBoundaryInterface d() {
        if (this.f4942a == null) {
            this.f4942a = l0.d().getProxyController();
        }
        return this.f4942a;
    }

    public static String[][] e(List<c.b> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).a();
            strArr[i10][1] = list.get(i10).b();
        }
        return strArr;
    }

    @Override // f5.d
    public void a(Executor executor, Runnable runnable) {
        if (!m.Q.d()) {
            throw m.a();
        }
        d().clearProxyOverride(runnable, executor);
    }

    @Override // f5.d
    public void c(f5.c cVar, Executor executor, Runnable runnable) {
        a.d dVar = m.Q;
        a.d dVar2 = m.W;
        String[][] strArrE = e(cVar.b());
        String[] strArr = (String[]) cVar.a().toArray(new String[0]);
        if (dVar.d() && !cVar.c()) {
            d().setProxyOverride(strArrE, strArr, runnable, executor);
        } else {
            if (!dVar.d() || !dVar2.d()) {
                throw m.a();
            }
            d().setProxyOverride(strArrE, strArr, runnable, executor, cVar.c());
        }
    }
}
