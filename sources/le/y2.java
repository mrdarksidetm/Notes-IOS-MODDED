package le;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f15128a = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<j1> f15129b = qe.m0.a(new qe.h0("ThreadLocalEventLoop"));

    private y2() {
    }

    public final j1 a() {
        return f15129b.get();
    }

    public final j1 b() {
        ThreadLocal<j1> threadLocal = f15129b;
        j1 j1Var = threadLocal.get();
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1VarA = m1.a();
        threadLocal.set(j1VarA);
        return j1VarA;
    }

    public final void c() {
        f15129b.set(null);
    }

    public final void d(j1 j1Var) {
        f15129b.set(j1Var);
    }
}
