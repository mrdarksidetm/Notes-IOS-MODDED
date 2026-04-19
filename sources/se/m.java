package se;

import le.j0;
import qe.p;

/* JADX INFO: loaded from: classes2.dex */
final class m extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f20578c = new m();

    private m() {
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        c.f20559i.l0(runnable, l.f20577h, false);
    }

    @Override // le.j0
    public void h0(qd.g gVar, Runnable runnable) {
        c.f20559i.l0(runnable, l.f20577h, true);
    }

    @Override // le.j0
    public j0 j0(int i10) {
        p.a(i10);
        return i10 >= l.f20573d ? this : super.j0(i10);
    }
}
