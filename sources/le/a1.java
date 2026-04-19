package le;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a1<T> extends se.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14979c;

    public a1(int i10) {
        this.f14979c = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract qd.d<T> c();

    public Throwable e(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f14990a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            md.f.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ae.r.c(th);
        l0.a(c().getContext(), new q0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00b0, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:3:0x0002, B:5:0x001e, B:24:0x007d, B:26:0x0083, B:34:0x00a6, B:37:0x00af, B:36:0x00ac, B:8:0x0024, B:10:0x0032, B:12:0x003a, B:15:0x0046, B:17:0x004c, B:18:0x005d, B:22:0x0079, B:20:0x0063, B:21:0x006e), top: B:47:0x0002, inners: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.a1.run():void");
    }
}
