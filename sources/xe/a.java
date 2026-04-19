package xe;

import ae.d;
import ae.f;
import ae.l;
import ae.m0;
import ae.q;
import ae.r;
import af.a2;
import af.b2;
import af.c2;
import af.e;
import af.g;
import af.g0;
import af.h;
import af.h0;
import af.j;
import af.k;
import af.k0;
import af.l1;
import af.m1;
import af.n;
import af.n0;
import af.n1;
import af.o;
import af.o0;
import af.r1;
import af.s;
import af.s1;
import af.t;
import af.u;
import af.u1;
import af.v0;
import af.v1;
import af.w0;
import af.x1;
import af.y1;
import java.util.List;
import java.util.Map;
import ke.a;
import md.a0;
import md.b0;
import md.c0;
import md.d0;
import md.f0;
import md.i0;
import md.y;
import md.z;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final b<y> A(y.a aVar) {
        r.f(aVar, "<this>");
        return s1.f818a;
    }

    public static final b<a0> B(a0.a aVar) {
        r.f(aVar, "<this>");
        return v1.f840a;
    }

    public static final b<c0> C(c0.a aVar) {
        r.f(aVar, "<this>");
        return y1.f864a;
    }

    public static final b<f0> D(f0.a aVar) {
        r.f(aVar, "<this>");
        return b2.f745a;
    }

    public static final b<i0> E(i0 i0Var) {
        r.f(i0Var, "<this>");
        return c2.f748b;
    }

    public static final b<boolean[]> a() {
        return g.f759c;
    }

    public static final b<byte[]> b() {
        return j.f773c;
    }

    public static final b<char[]> c() {
        return n.f788c;
    }

    public static final b<double[]> d() {
        return s.f817c;
    }

    public static final b<float[]> e() {
        return af.a0.f725c;
    }

    public static final b<int[]> f() {
        return g0.f760c;
    }

    public static final <T> b<List<T>> g(b<T> bVar) {
        r.f(bVar, "elementSerializer");
        return new e(bVar);
    }

    public static final b<long[]> h() {
        return n0.f789c;
    }

    public static final <K, V> b<Map<K, V>> i(b<K> bVar, b<V> bVar2) {
        r.f(bVar, "keySerializer");
        r.f(bVar2, "valueSerializer");
        return new k0(bVar, bVar2);
    }

    public static final b j() {
        return v0.f838a;
    }

    public static final b<short[]> k() {
        return l1.f781c;
    }

    public static final b<z> l() {
        return r1.f816c;
    }

    public static final b<b0> m() {
        return u1.f831c;
    }

    public static final b<d0> n() {
        return x1.f862c;
    }

    public static final b<md.g0> o() {
        return a2.f742c;
    }

    public static final <T> b<T> p(b<T> bVar) {
        r.f(bVar, "<this>");
        return bVar.getDescriptor().c() ? bVar : new w0(bVar);
    }

    public static final b<Boolean> q(d dVar) {
        r.f(dVar, "<this>");
        return h.f763a;
    }

    public static final b<Byte> r(ae.e eVar) {
        r.f(eVar, "<this>");
        return k.f774a;
    }

    public static final b<Character> s(f fVar) {
        r.f(fVar, "<this>");
        return o.f792a;
    }

    public static final b<Double> t(ae.k kVar) {
        r.f(kVar, "<this>");
        return t.f820a;
    }

    public static final b<Float> u(l lVar) {
        r.f(lVar, "<this>");
        return af.b0.f743a;
    }

    public static final b<Integer> v(q qVar) {
        r.f(qVar, "<this>");
        return h0.f765a;
    }

    public static final b<Long> w(ae.t tVar) {
        r.f(tVar, "<this>");
        return o0.f794a;
    }

    public static final b<Short> x(ae.k0 k0Var) {
        r.f(k0Var, "<this>");
        return m1.f786a;
    }

    public static final b<String> y(m0 m0Var) {
        r.f(m0Var, "<this>");
        return n1.f790a;
    }

    public static final b<ke.a> z(a.C0337a c0337a) {
        r.f(c0337a, "<this>");
        return u.f826a;
    }
}
