package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public interface d<T, V extends q> {
    boolean a();

    long b();

    j1<T, V> c();

    V d(long j10);

    default boolean e(long j10) {
        return j10 >= b();
    }

    T f(long j10);

    T g();
}
