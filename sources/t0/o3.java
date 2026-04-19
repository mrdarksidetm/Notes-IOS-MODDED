package t0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<T> f20894a = new ArrayList<>();

    public final void a() {
        this.f20894a.clear();
    }

    public final int b() {
        return this.f20894a.size();
    }

    public final boolean c() {
        return this.f20894a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.f20894a.get(b() - 1);
    }

    public final T f(int i10) {
        return this.f20894a.get(i10);
    }

    public final T g() {
        return this.f20894a.remove(b() - 1);
    }

    public final boolean h(T t10) {
        return this.f20894a.add(t10);
    }

    public final T[] i() {
        int size = this.f20894a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f20894a.get(i10);
        }
        return tArr;
    }
}
