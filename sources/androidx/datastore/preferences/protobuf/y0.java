package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface y0 {
    int A();

    void B(List<String> list);

    void C(List<String> list);

    g D();

    void E(List<Float> list);

    int F();

    @Deprecated
    <T> void G(List<T> list, z0<T> z0Var, o oVar);

    boolean H();

    int I();

    void J(List<g> list);

    void K(List<Double> list);

    <T> void L(List<T> list, z0<T> z0Var, o oVar);

    long M();

    String N();

    void O(List<Long> list);

    @Deprecated
    <T> T P(z0<T> z0Var, o oVar);

    <T> T a(z0<T> z0Var, o oVar);

    void b(List<Integer> list);

    long c();

    long d();

    <T> T e(Class<T> cls, o oVar);

    void f(List<Integer> list);

    void g(List<Long> list);

    void h(List<Integer> list);

    int i();

    boolean j();

    long k();

    void l(List<Long> list);

    @Deprecated
    <T> T m(Class<T> cls, o oVar);

    int n();

    void o(List<Long> list);

    void p(List<Long> list);

    void q(List<Integer> list);

    void r(List<Integer> list);

    double readDouble();

    float readFloat();

    <K, V> void s(Map<K, V> map, g0.a<K, V> aVar, o oVar);

    int t();

    int u();

    void v(List<Integer> list);

    int w();

    long x();

    void y(List<Boolean> list);

    String z();
}
