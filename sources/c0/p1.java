package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public interface p1<V extends q> extends q1<V> {
    @Override // c0.m1
    default long b(V v10, V v11, V v12) {
        return ((long) (e() + f())) * 1000000;
    }

    int e();

    int f();
}
