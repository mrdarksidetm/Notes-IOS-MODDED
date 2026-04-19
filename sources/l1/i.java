package l1;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f14513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Shader f14515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k0 f14516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g1 f14517e;

    public i() {
        this(j.j());
    }

    public i(Paint paint) {
        this.f14513a = paint;
        this.f14514b = v.f14592a.B();
    }

    @Override // l1.d1
    public float a() {
        return j.c(this.f14513a);
    }

    @Override // l1.d1
    public void b(float f10) {
        j.k(this.f14513a, f10);
    }

    @Override // l1.d1
    public long c() {
        return j.d(this.f14513a);
    }

    @Override // l1.d1
    public int d() {
        return j.g(this.f14513a);
    }

    @Override // l1.d1
    public void e(int i10) {
        j.r(this.f14513a, i10);
    }

    @Override // l1.d1
    public void f(int i10) {
        if (v.E(this.f14514b, i10)) {
            return;
        }
        this.f14514b = i10;
        j.l(this.f14513a, i10);
    }

    @Override // l1.d1
    public float g() {
        return j.h(this.f14513a);
    }

    @Override // l1.d1
    public void h(k0 k0Var) {
        this.f14516d = k0Var;
        j.n(this.f14513a, k0Var);
    }

    @Override // l1.d1
    public k0 i() {
        return this.f14516d;
    }

    @Override // l1.d1
    public Paint j() {
        return this.f14513a;
    }

    @Override // l1.d1
    public void k(Shader shader) {
        this.f14515c = shader;
        j.q(this.f14513a, shader);
    }

    @Override // l1.d1
    public Shader l() {
        return this.f14515c;
    }

    @Override // l1.d1
    public void m(float f10) {
        j.t(this.f14513a, f10);
    }

    @Override // l1.d1
    public void n(int i10) {
        j.o(this.f14513a, i10);
    }

    @Override // l1.d1
    public int o() {
        return j.e(this.f14513a);
    }

    @Override // l1.d1
    public int p() {
        return j.f(this.f14513a);
    }

    @Override // l1.d1
    public void q(int i10) {
        j.s(this.f14513a, i10);
    }

    @Override // l1.d1
    public void r(g1 g1Var) {
        j.p(this.f14513a, g1Var);
        this.f14517e = g1Var;
    }

    @Override // l1.d1
    public void s(int i10) {
        j.v(this.f14513a, i10);
    }

    @Override // l1.d1
    public void t(long j10) {
        j.m(this.f14513a, j10);
    }

    @Override // l1.d1
    public g1 u() {
        return this.f14517e;
    }

    @Override // l1.d1
    public void v(float f10) {
        j.u(this.f14513a, f10);
    }

    @Override // l1.d1
    public float w() {
        return j.i(this.f14513a);
    }

    @Override // l1.d1
    public int x() {
        return this.f14514b;
    }
}
