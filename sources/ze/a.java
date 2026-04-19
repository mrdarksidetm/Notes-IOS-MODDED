package ze;

import ae.i0;
import ae.r;
import we.g;
import ze.c;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e, c {
    @Override // ze.e
    public abstract byte A();

    @Override // ze.e
    public int B(ye.f fVar) {
        r.f(fVar, "enumDescriptor");
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // ze.e
    public abstract short C();

    @Override // ze.c
    public final byte D(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return A();
    }

    @Override // ze.e
    public float E() {
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // ze.e
    public e F(ye.f fVar) {
        r.f(fVar, "descriptor");
        return this;
    }

    @Override // ze.c
    public e G(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return F(fVar.i(i10));
    }

    @Override // ze.e
    public double H() {
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    public <T> T I(we.a<? extends T> aVar, T t10) {
        r.f(aVar, "deserializer");
        return (T) v(aVar);
    }

    public Object J() {
        throw new g(i0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // ze.e
    public c c(ye.f fVar) {
        r.f(fVar, "descriptor");
        return this;
    }

    public void d(ye.f fVar) {
        r.f(fVar, "descriptor");
    }

    @Override // ze.c
    public final char e(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return i();
    }

    @Override // ze.c
    public final short f(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return C();
    }

    @Override // ze.c
    public final boolean g(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return h();
    }

    @Override // ze.e
    public boolean h() {
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // ze.e
    public char i() {
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // ze.c
    public final float j(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return E();
    }

    public <T> T k(ye.f fVar, int i10, we.a<? extends T> aVar, T t10) {
        r.f(fVar, "descriptor");
        r.f(aVar, "deserializer");
        return (T) I(aVar, t10);
    }

    @Override // ze.c
    public final <T> T l(ye.f fVar, int i10, we.a<? extends T> aVar, T t10) {
        r.f(fVar, "descriptor");
        r.f(aVar, "deserializer");
        return (aVar.getDescriptor().c() || w()) ? (T) I(aVar, t10) : (T) r();
    }

    @Override // ze.c
    public final String m(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return s();
    }

    @Override // ze.c
    public int n(ye.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // ze.c
    public final int o(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return q();
    }

    @Override // ze.e
    public abstract int q();

    @Override // ze.e
    public Void r() {
        return null;
    }

    @Override // ze.e
    public String s() {
        Object objJ = J();
        r.d(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // ze.c
    public final long t(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return u();
    }

    @Override // ze.e
    public abstract long u();

    @Override // ze.e
    public <T> T v(we.a<? extends T> aVar) {
        return (T) e.a.a(this, aVar);
    }

    @Override // ze.e
    public boolean w() {
        return true;
    }

    @Override // ze.c
    public boolean x() {
        return c.a.b(this);
    }

    @Override // ze.c
    public final double y(ye.f fVar, int i10) {
        r.f(fVar, "descriptor");
        return H();
    }
}
