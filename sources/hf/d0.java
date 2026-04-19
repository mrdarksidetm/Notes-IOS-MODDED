package hf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11947h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f11953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f11954g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public d0() {
        this.f11948a = new byte[8192];
        this.f11952e = true;
        this.f11951d = false;
    }

    public d0(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        ae.r.f(bArr, "data");
        this.f11948a = bArr;
        this.f11949b = i10;
        this.f11950c = i11;
        this.f11951d = z10;
        this.f11952e = z11;
    }

    public final void a() {
        d0 d0Var = this.f11954g;
        int i10 = 0;
        if (!(d0Var != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        ae.r.c(d0Var);
        if (d0Var.f11952e) {
            int i11 = this.f11950c - this.f11949b;
            d0 d0Var2 = this.f11954g;
            ae.r.c(d0Var2);
            int i12 = 8192 - d0Var2.f11950c;
            d0 d0Var3 = this.f11954g;
            ae.r.c(d0Var3);
            if (!d0Var3.f11951d) {
                d0 d0Var4 = this.f11954g;
                ae.r.c(d0Var4);
                i10 = d0Var4.f11949b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            d0 d0Var5 = this.f11954g;
            ae.r.c(d0Var5);
            g(d0Var5, i11);
            b();
            e0.b(this);
        }
    }

    public final d0 b() {
        d0 d0Var = this.f11953f;
        if (d0Var == this) {
            d0Var = null;
        }
        d0 d0Var2 = this.f11954g;
        ae.r.c(d0Var2);
        d0Var2.f11953f = this.f11953f;
        d0 d0Var3 = this.f11953f;
        ae.r.c(d0Var3);
        d0Var3.f11954g = this.f11954g;
        this.f11953f = null;
        this.f11954g = null;
        return d0Var;
    }

    public final d0 c(d0 d0Var) {
        ae.r.f(d0Var, "segment");
        d0Var.f11954g = this;
        d0Var.f11953f = this.f11953f;
        d0 d0Var2 = this.f11953f;
        ae.r.c(d0Var2);
        d0Var2.f11954g = d0Var;
        this.f11953f = d0Var;
        return d0Var;
    }

    public final d0 d() {
        this.f11951d = true;
        return new d0(this.f11948a, this.f11949b, this.f11950c, true, false);
    }

    public final d0 e(int i10) {
        d0 d0VarC;
        if (!(i10 > 0 && i10 <= this.f11950c - this.f11949b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            d0VarC = d();
        } else {
            d0VarC = e0.c();
            byte[] bArr = this.f11948a;
            byte[] bArr2 = d0VarC.f11948a;
            int i11 = this.f11949b;
            nd.o.i(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        d0VarC.f11950c = d0VarC.f11949b + i10;
        this.f11949b += i10;
        d0 d0Var = this.f11954g;
        ae.r.c(d0Var);
        d0Var.c(d0VarC);
        return d0VarC;
    }

    public final d0 f() {
        byte[] bArr = this.f11948a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        ae.r.e(bArrCopyOf, "copyOf(this, size)");
        return new d0(bArrCopyOf, this.f11949b, this.f11950c, false, true);
    }

    public final void g(d0 d0Var, int i10) {
        ae.r.f(d0Var, "sink");
        if (!d0Var.f11952e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = d0Var.f11950c;
        if (i11 + i10 > 8192) {
            if (d0Var.f11951d) {
                throw new IllegalArgumentException();
            }
            int i12 = d0Var.f11949b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = d0Var.f11948a;
            nd.o.i(bArr, bArr, 0, i12, i11, 2, null);
            d0Var.f11950c -= d0Var.f11949b;
            d0Var.f11949b = 0;
        }
        byte[] bArr2 = this.f11948a;
        byte[] bArr3 = d0Var.f11948a;
        int i13 = d0Var.f11950c;
        int i14 = this.f11949b;
        nd.o.d(bArr2, bArr3, i13, i14, i14 + i10);
        d0Var.f11950c += i10;
        this.f11949b += i10;
    }
}
