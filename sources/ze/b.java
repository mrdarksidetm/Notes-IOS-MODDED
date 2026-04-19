package ze;

import ae.i0;
import ae.r;
import af.t0;
import we.g;
import we.h;
import ze.d;
import ze.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f, d {
    @Override // ze.f
    public void A(int i10) {
        I(Integer.valueOf(i10));
    }

    @Override // ze.d
    public final void B(ye.f fVar, int i10, long j10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            C(j10);
        }
    }

    @Override // ze.f
    public void C(long j10) {
        I(Long.valueOf(j10));
    }

    @Override // ze.f
    public <T> void D(h<? super T> hVar, T t10) {
        f.a.d(this, hVar, t10);
    }

    @Override // ze.d
    public <T> void E(ye.f fVar, int i10, h<? super T> hVar, T t10) {
        r.f(fVar, "descriptor");
        r.f(hVar, "serializer");
        if (G(fVar, i10)) {
            D(hVar, t10);
        }
    }

    @Override // ze.f
    public void F(String str) {
        r.f(str, "value");
        I(str);
    }

    public boolean G(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return true;
    }

    public <T> void H(h<? super T> hVar, T t10) {
        f.a.c(this, hVar, t10);
    }

    public void I(Object obj) {
        r.f(obj, "value");
        throw new g("Non-serializable " + i0.b(obj.getClass()) + " is not supported by " + i0.b(getClass()) + " encoder");
    }

    @Override // ze.f
    public d c(ye.f fVar) {
        r.f(fVar, "descriptor");
        return this;
    }

    public void d(ye.f fVar) {
        r.f(fVar, "descriptor");
    }

    @Override // ze.d
    public final void e(ye.f fVar, int i10, float f10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            q(f10);
        }
    }

    @Override // ze.f
    public void f(ye.f fVar, int i10) {
        r.f(fVar, "enumDescriptor");
        I(Integer.valueOf(i10));
    }

    @Override // ze.f
    public void g() {
        throw new g("'null' is not supported by default");
    }

    @Override // ze.f
    public void h(double d10) {
        I(Double.valueOf(d10));
    }

    @Override // ze.f
    public void i(short s10) {
        I(Short.valueOf(s10));
    }

    @Override // ze.d
    public final void j(ye.f fVar, int i10, boolean z10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            n(z10);
        }
    }

    public <T> void k(ye.f fVar, int i10, h<? super T> hVar, T t10) {
        r.f(fVar, "descriptor");
        r.f(hVar, "serializer");
        if (G(fVar, i10)) {
            H(hVar, t10);
        }
    }

    @Override // ze.f
    public void l(byte b10) {
        I(Byte.valueOf(b10));
    }

    @Override // ze.d
    public final void m(ye.f fVar, int i10, char c10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            t(c10);
        }
    }

    @Override // ze.f
    public void n(boolean z10) {
        I(Boolean.valueOf(z10));
    }

    @Override // ze.d
    public final void o(ye.f fVar, int i10, short s10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            i(s10);
        }
    }

    @Override // ze.f
    public d p(ye.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // ze.f
    public void q(float f10) {
        I(Float.valueOf(f10));
    }

    public boolean r(ye.f fVar, int i10) {
        return d.a.a(this, fVar, i10);
    }

    @Override // ze.d
    public final f s(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return G(fVar, i10) ? z(fVar.i(i10)) : t0.f822a;
    }

    @Override // ze.f
    public void t(char c10) {
        I(Character.valueOf(c10));
    }

    @Override // ze.f
    public void u() {
        f.a.b(this);
    }

    @Override // ze.d
    public final void v(ye.f fVar, int i10, byte b10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            l(b10);
        }
    }

    @Override // ze.d
    public final void w(ye.f fVar, int i10, String str) {
        r.f(fVar, "descriptor");
        r.f(str, "value");
        if (G(fVar, i10)) {
            F(str);
        }
    }

    @Override // ze.d
    public final void x(ye.f fVar, int i10, double d10) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            h(d10);
        }
    }

    @Override // ze.d
    public final void y(ye.f fVar, int i10, int i11) {
        r.f(fVar, "descriptor");
        if (G(fVar, i10)) {
            A(i11);
        }
    }

    @Override // ze.f
    public f z(ye.f fVar) {
        r.f(fVar, "descriptor");
        return this;
    }
}
