package a1;

import ae.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18a;

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        this.f18a = i10;
    }

    public /* synthetic */ b(int i10, int i11, j jVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final int a() {
        return this.f18a;
    }

    public final void b(int i10) {
        this.f18a += i10;
    }

    public final void c(int i10) {
        this.f18a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f18a == ((b) obj).f18a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f18a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f18a + ')';
    }
}
