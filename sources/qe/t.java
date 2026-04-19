package qe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class t<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19098a = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z10) {
        this._cur = new u(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19098a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int iA = uVar.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                b3.b.a(f19098a, this, uVar, uVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19098a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar.d()) {
                return;
            } else {
                b3.b.a(f19098a, this, uVar, uVar.i());
            }
        }
    }

    public final int c() {
        return ((u) f19098a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19098a;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) uVar.j();
            if (e10 != u.f19102h) {
                return e10;
            }
            b3.b.a(f19098a, this, uVar, uVar.i());
        }
    }
}
