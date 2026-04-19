package androidx.lifecycle;

import le.d1;
import le.n0;
import le.w2;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final n0 a(w wVar) {
        n0 n0Var = (n0) wVar.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        return n0Var != null ? n0Var : (n0) wVar.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new o4.b(w2.b(null, 1, null).plus(d1.c().m0())));
    }
}
