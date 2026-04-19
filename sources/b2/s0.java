package b2;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f5402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<md.i0> f5403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p2.r f5405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5406e;

    public final InputConnection a(EditorInfo editorInfo) {
        synchronized (this.f5404c) {
            if (this.f5406e) {
                return null;
            }
            p2.r rVar = this.f5405d;
            if (rVar != null) {
                rVar.a();
            }
            p2.r rVarA = p2.w.a(this.f5402a.a(editorInfo), this.f5403b);
            this.f5405d = rVarA;
            return rVarA;
        }
    }

    public final boolean b() {
        return !this.f5406e;
    }
}
