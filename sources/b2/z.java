package b2;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z implements le.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final le.n0 f5429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f5430b;

    public final InputConnection a(EditorInfo editorInfo) {
        s0 s0Var = (s0) f1.h.c(this.f5430b);
        if (s0Var != null) {
            return s0Var.a(editorInfo);
        }
        return null;
    }

    public final boolean b() {
        s0 s0Var = (s0) f1.h.c(this.f5430b);
        return s0Var != null && s0Var.b();
    }

    @Override // le.n0
    public qd.g getCoroutineContext() {
        return this.f5429a.getCoroutineContext();
    }
}
