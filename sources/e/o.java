package e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.a<i0> f10102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<zd.a<i0>> f10107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f10108h;

    public o(Executor executor, zd.a<i0> aVar) {
        ae.r.f(executor, "executor");
        ae.r.f(aVar, "reportFullyDrawn");
        this.f10101a = executor;
        this.f10102b = aVar;
        this.f10103c = new Object();
        this.f10107g = new ArrayList();
        this.f10108h = new Runnable() { // from class: e.n
            @Override // java.lang.Runnable
            public final void run() {
                o.d(this.f10100a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(o oVar) {
        ae.r.f(oVar, "this$0");
        synchronized (oVar.f10103c) {
            oVar.f10105e = false;
            if (oVar.f10104d == 0 && !oVar.f10106f) {
                oVar.f10102b.invoke();
                oVar.b();
            }
            i0 i0Var = i0.f15558a;
        }
    }

    public final void b() {
        synchronized (this.f10103c) {
            this.f10106f = true;
            Iterator<T> it = this.f10107g.iterator();
            while (it.hasNext()) {
                ((zd.a) it.next()).invoke();
            }
            this.f10107g.clear();
            i0 i0Var = i0.f15558a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f10103c) {
            z10 = this.f10106f;
        }
        return z10;
    }
}
