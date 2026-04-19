package v1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z.m<b0> f21932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f21933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21934c;

    public h(z.m<b0> mVar, d0 d0Var) {
        this.f21932a = mVar;
        this.f21933b = d0Var;
    }

    public final z.m<b0> a() {
        return this.f21932a;
    }

    public final MotionEvent b() {
        return this.f21933b.a();
    }

    public final boolean c() {
        return this.f21934c;
    }

    public final boolean d(long j10) {
        e0 e0Var;
        List<e0> listB = this.f21933b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                e0Var = null;
                break;
            }
            e0Var = listB.get(i10);
            if (a0.d(e0Var.c(), j10)) {
                break;
            }
            i10++;
        }
        e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            return e0Var2.d();
        }
        return false;
    }
}
