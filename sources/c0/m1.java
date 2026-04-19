package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
public interface m1<V extends q> {
    boolean a();

    long b(V v10, V v11, V v12);

    default V c(V v10, V v11, V v12) {
        return (V) g(b(v10, v11, v12), v10, v11, v12);
    }

    V d(long j10, V v10, V v11, V v12);

    V g(long j10, V v10, V v11, V v12);
}
