package r2;

import android.text.style.URLSpan;
import i2.j0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<j0, URLSpan> f19179a = new WeakHashMap<>();

    public final URLSpan a(j0 j0Var) {
        WeakHashMap<j0, URLSpan> weakHashMap = this.f19179a;
        URLSpan uRLSpan = weakHashMap.get(j0Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(j0Var.a());
            weakHashMap.put(j0Var, uRLSpan);
        }
        return uRLSpan;
    }
}
