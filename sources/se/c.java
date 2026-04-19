package se;

import le.j0;
import qe.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f20559i = new c();

    private c() {
        super(l.f20572c, l.f20573d, l.f20574e, l.f20570a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // le.j0
    public j0 j0(int i10) {
        p.a(i10);
        return i10 >= l.f20572c ? this : super.j0(i10);
    }

    @Override // le.j0
    public String toString() {
        return "Dispatchers.Default";
    }
}
