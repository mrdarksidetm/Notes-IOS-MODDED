package af;

import java.util.ArrayList;
import ze.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o1<Tag> implements ze.e, ze.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f796a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f797b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends ae.s implements zd.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1<Tag> f798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ we.a<T> f799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o1<Tag> o1Var, we.a<? extends T> aVar, T t10) {
            super(0);
            this.f798a = o1Var;
            this.f799b = aVar;
            this.f800c = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zd.a
        public final T invoke() {
            if (!this.f798a.w()) {
                return (T) this.f798a.r();
            }
            return (T) this.f798a.I((we.a<? extends T>) this.f799b, this.f800c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends ae.s implements zd.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1<Tag> f801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ we.a<T> f802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1<Tag> o1Var, we.a<? extends T> aVar, T t10) {
            super(0);
            this.f801a = o1Var;
            this.f802b = aVar;
            this.f803c = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // zd.a
        public final T invoke() {
            return (T) this.f801a.I((we.a<? extends T>) this.f802b, this.f803c);
        }
    }

    private final <E> E Y(Tag tag, zd.a<? extends E> aVar) {
        X(tag);
        E eInvoke = aVar.invoke();
        if (!this.f797b) {
            W();
        }
        this.f797b = false;
        return eInvoke;
    }

    @Override // ze.e
    public final byte A() {
        return K(W());
    }

    @Override // ze.e
    public final int B(ye.f fVar) {
        ae.r.f(fVar, "enumDescriptor");
        return N(W(), fVar);
    }

    @Override // ze.e
    public final short C() {
        return S(W());
    }

    @Override // ze.c
    public final byte D(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return K(V(fVar, i10));
    }

    @Override // ze.e
    public final float E() {
        return O(W());
    }

    @Override // ze.e
    public ze.e F(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        return P(W(), fVar);
    }

    @Override // ze.c
    public final ze.e G(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return P(V(fVar, i10), fVar.i(i10));
    }

    @Override // ze.e
    public final double H() {
        return M(W());
    }

    protected <T> T I(we.a<? extends T> aVar, T t10) {
        ae.r.f(aVar, "deserializer");
        return (T) v(aVar);
    }

    protected abstract boolean J(Tag tag);

    protected abstract byte K(Tag tag);

    protected abstract char L(Tag tag);

    protected abstract double M(Tag tag);

    protected abstract int N(Tag tag, ye.f fVar);

    protected abstract float O(Tag tag);

    protected ze.e P(Tag tag, ye.f fVar) {
        ae.r.f(fVar, "inlineDescriptor");
        X(tag);
        return this;
    }

    protected abstract int Q(Tag tag);

    protected abstract long R(Tag tag);

    protected abstract short S(Tag tag);

    protected abstract String T(Tag tag);

    protected final Tag U() {
        return (Tag) nd.c0.k0(this.f796a);
    }

    protected abstract Tag V(ye.f fVar, int i10);

    protected final Tag W() {
        ArrayList<Tag> arrayList = this.f796a;
        Tag tagRemove = arrayList.remove(nd.u.o(arrayList));
        this.f797b = true;
        return tagRemove;
    }

    protected final void X(Tag tag) {
        this.f796a.add(tag);
    }

    @Override // ze.c
    public final char e(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return L(V(fVar, i10));
    }

    @Override // ze.c
    public final short f(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return S(V(fVar, i10));
    }

    @Override // ze.c
    public final boolean g(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return J(V(fVar, i10));
    }

    @Override // ze.e
    public final boolean h() {
        return J(W());
    }

    @Override // ze.e
    public final char i() {
        return L(W());
    }

    @Override // ze.c
    public final float j(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return O(V(fVar, i10));
    }

    @Override // ze.c
    public final <T> T k(ye.f fVar, int i10, we.a<? extends T> aVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, "deserializer");
        return (T) Y(V(fVar, i10), new b(this, aVar, t10));
    }

    @Override // ze.c
    public final <T> T l(ye.f fVar, int i10, we.a<? extends T> aVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, "deserializer");
        return (T) Y(V(fVar, i10), new a(this, aVar, t10));
    }

    @Override // ze.c
    public final String m(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return T(V(fVar, i10));
    }

    @Override // ze.c
    public int n(ye.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // ze.c
    public final int o(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return Q(V(fVar, i10));
    }

    @Override // ze.e
    public final int q() {
        return Q(W());
    }

    @Override // ze.e
    public final Void r() {
        return null;
    }

    @Override // ze.e
    public final String s() {
        return T(W());
    }

    @Override // ze.c
    public final long t(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return R(V(fVar, i10));
    }

    @Override // ze.e
    public final long u() {
        return R(W());
    }

    @Override // ze.e
    public abstract <T> T v(we.a<? extends T> aVar);

    @Override // ze.e
    public abstract boolean w();

    @Override // ze.c
    public boolean x() {
        return c.a.b(this);
    }

    @Override // ze.c
    public final double y(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return M(V(fVar, i10));
    }
}
