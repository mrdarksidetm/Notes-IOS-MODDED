package t0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class t2 implements e1.b, Iterable<e1.b>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f20982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20984c;

    public t2(s2 s2Var, int i10, int i11) {
        this.f20982a = s2Var;
        this.f20983b = i10;
        this.f20984c = i11;
    }

    private final void a() {
        if (this.f20982a.w() != this.f20984c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<e1.b> iterator() {
        a();
        q0 q0VarE = this.f20982a.E(this.f20983b);
        if (q0VarE != null) {
            return new m3(this.f20982a, q0VarE);
        }
        s2 s2Var = this.f20982a;
        int i10 = this.f20983b;
        return new o0(s2Var, i10 + 1, i10 + u2.I(s2Var.r(), this.f20983b));
    }
}
