package md;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f15557a;

    public h(T t10) {
        this.f15557a = t10;
    }

    @Override // md.l
    public T getValue() {
        return this.f15557a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
