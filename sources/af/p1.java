package af;

import java.util.ArrayList;
import ze.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p1<Tag> implements ze.f, ze.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f809a = new ArrayList<>();

    private final boolean G(ye.f fVar, int i10) {
        Y(W(fVar, i10));
        return true;
    }

    @Override // ze.f
    public final void A(int i10) {
        P(X(), i10);
    }

    @Override // ze.d
    public final void B(ye.f fVar, int i10, long j10) {
        ae.r.f(fVar, "descriptor");
        Q(W(fVar, i10), j10);
    }

    @Override // ze.f
    public final void C(long j10) {
        Q(X(), j10);
    }

    @Override // ze.f
    public abstract <T> void D(we.h<? super T> hVar, T t10);

    @Override // ze.d
    public <T> void E(ye.f fVar, int i10, we.h<? super T> hVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(hVar, "serializer");
        if (G(fVar, i10)) {
            D(hVar, t10);
        }
    }

    @Override // ze.f
    public final void F(String str) {
        ae.r.f(str, "value");
        S(X(), str);
    }

    public <T> void H(we.h<? super T> hVar, T t10) {
        f.a.c(this, hVar, t10);
    }

    protected abstract void I(Tag tag, boolean z10);

    protected abstract void J(Tag tag, byte b10);

    protected abstract void K(Tag tag, char c10);

    protected abstract void L(Tag tag, double d10);

    protected abstract void M(Tag tag, ye.f fVar, int i10);

    protected abstract void N(Tag tag, float f10);

    protected ze.f O(Tag tag, ye.f fVar) {
        ae.r.f(fVar, "inlineDescriptor");
        Y(tag);
        return this;
    }

    protected abstract void P(Tag tag, int i10);

    protected abstract void Q(Tag tag, long j10);

    protected abstract void R(Tag tag, short s10);

    protected abstract void S(Tag tag, String str);

    protected abstract void T(ye.f fVar);

    protected final Tag U() {
        return (Tag) nd.c0.j0(this.f809a);
    }

    protected final Tag V() {
        return (Tag) nd.c0.k0(this.f809a);
    }

    protected abstract Tag W(ye.f fVar, int i10);

    protected final Tag X() {
        if (!(!this.f809a.isEmpty())) {
            throw new we.g("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f809a;
        return arrayList.remove(nd.u.o(arrayList));
    }

    protected final void Y(Tag tag) {
        this.f809a.add(tag);
    }

    @Override // ze.d
    public final void d(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        if (!this.f809a.isEmpty()) {
            X();
        }
        T(fVar);
    }

    @Override // ze.d
    public final void e(ye.f fVar, int i10, float f10) {
        ae.r.f(fVar, "descriptor");
        N(W(fVar, i10), f10);
    }

    @Override // ze.f
    public final void f(ye.f fVar, int i10) {
        ae.r.f(fVar, "enumDescriptor");
        M(X(), fVar, i10);
    }

    @Override // ze.f
    public final void h(double d10) {
        L(X(), d10);
    }

    @Override // ze.f
    public final void i(short s10) {
        R(X(), s10);
    }

    @Override // ze.d
    public final void j(ye.f fVar, int i10, boolean z10) {
        ae.r.f(fVar, "descriptor");
        I(W(fVar, i10), z10);
    }

    @Override // ze.d
    public <T> void k(ye.f fVar, int i10, we.h<? super T> hVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(hVar, "serializer");
        if (G(fVar, i10)) {
            H(hVar, t10);
        }
    }

    @Override // ze.f
    public final void l(byte b10) {
        J(X(), b10);
    }

    @Override // ze.d
    public final void m(ye.f fVar, int i10, char c10) {
        ae.r.f(fVar, "descriptor");
        K(W(fVar, i10), c10);
    }

    @Override // ze.f
    public final void n(boolean z10) {
        I(X(), z10);
    }

    @Override // ze.d
    public final void o(ye.f fVar, int i10, short s10) {
        ae.r.f(fVar, "descriptor");
        R(W(fVar, i10), s10);
    }

    @Override // ze.f
    public ze.d p(ye.f fVar, int i10) {
        return f.a.a(this, fVar, i10);
    }

    @Override // ze.f
    public final void q(float f10) {
        N(X(), f10);
    }

    @Override // ze.d
    public final ze.f s(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return O(W(fVar, i10), fVar.i(i10));
    }

    @Override // ze.f
    public final void t(char c10) {
        K(X(), c10);
    }

    @Override // ze.d
    public final void v(ye.f fVar, int i10, byte b10) {
        ae.r.f(fVar, "descriptor");
        J(W(fVar, i10), b10);
    }

    @Override // ze.d
    public final void w(ye.f fVar, int i10, String str) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(str, "value");
        S(W(fVar, i10), str);
    }

    @Override // ze.d
    public final void x(ye.f fVar, int i10, double d10) {
        ae.r.f(fVar, "descriptor");
        L(W(fVar, i10), d10);
    }

    @Override // ze.d
    public final void y(ye.f fVar, int i10, int i11) {
        ae.r.f(fVar, "descriptor");
        P(W(fVar, i10), i11);
    }

    @Override // ze.f
    public ze.f z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return O(X(), fVar);
    }
}
