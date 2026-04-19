package hf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class n extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j0 f12006f;

    public n(j0 j0Var) {
        ae.r.f(j0Var, "delegate");
        this.f12006f = j0Var;
    }

    @Override // hf.j0
    public j0 a() {
        return this.f12006f.a();
    }

    @Override // hf.j0
    public j0 b() {
        return this.f12006f.b();
    }

    @Override // hf.j0
    public long c() {
        return this.f12006f.c();
    }

    @Override // hf.j0
    public j0 d(long j10) {
        return this.f12006f.d(j10);
    }

    @Override // hf.j0
    public boolean e() {
        return this.f12006f.e();
    }

    @Override // hf.j0
    public void f() throws InterruptedIOException {
        this.f12006f.f();
    }

    @Override // hf.j0
    public j0 g(long j10, TimeUnit timeUnit) {
        ae.r.f(timeUnit, "unit");
        return this.f12006f.g(j10, timeUnit);
    }

    @Override // hf.j0
    public long h() {
        return this.f12006f.h();
    }

    public final j0 j() {
        return this.f12006f;
    }

    public final n k(j0 j0Var) {
        ae.r.f(j0Var, "delegate");
        this.f12006f = j0Var;
        return this;
    }
}
