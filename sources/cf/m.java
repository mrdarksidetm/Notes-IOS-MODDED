package cf;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f6966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6967b;

    public m(s0 s0Var) {
        ae.r.f(s0Var, "writer");
        this.f6966a = s0Var;
        this.f6967b = true;
    }

    public final boolean a() {
        return this.f6967b;
    }

    public void b() {
        this.f6967b = true;
    }

    public void c() {
        this.f6967b = false;
    }

    public void d(byte b10) {
        this.f6966a.writeLong(b10);
    }

    public final void e(char c10) {
        this.f6966a.a(c10);
    }

    public void f(double d10) {
        this.f6966a.c(String.valueOf(d10));
    }

    public void g(float f10) {
        this.f6966a.c(String.valueOf(f10));
    }

    public void h(int i10) {
        this.f6966a.writeLong(i10);
    }

    public void i(long j10) {
        this.f6966a.writeLong(j10);
    }

    public final void j(String str) {
        ae.r.f(str, "v");
        this.f6966a.c(str);
    }

    public void k(short s10) {
        this.f6966a.writeLong(s10);
    }

    public void l(boolean z10) {
        this.f6966a.c(String.valueOf(z10));
    }

    public void m(String str) {
        ae.r.f(str, "value");
        this.f6966a.b(str);
    }

    protected final void n(boolean z10) {
        this.f6967b = z10;
    }

    public void o() {
    }

    public void p() {
    }
}
