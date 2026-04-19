package ne;

import java.util.concurrent.atomic.AtomicReferenceArray;
import qe.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class j<E> extends e0<j<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b<E> f16197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReferenceArray f16198f;

    public j(long j10, j<E> jVar, b<E> bVar, int i10) {
        super(j10, jVar, i10);
        this.f16197e = bVar;
        this.f16198f = new AtomicReferenceArray(c.f16171b * 2);
    }

    private final void z(int i10, Object obj) {
        this.f16198f.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f16198f.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    @Override // qe.e0
    public int n() {
        return c.f16171b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().f16159b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        qe.z.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // qe.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, qd.g r6) {
        /*
            r3 = this;
            int r5 = ne.c.f16171b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof le.g3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof ne.v
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            qe.h0 r2 = ne.c.j()
            if (r1 == r2) goto L63
            qe.h0 r2 = ne.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            qe.h0 r2 = ne.c.p()
            if (r1 == r2) goto Le
            qe.h0 r2 = ne.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            qe.h0 r4 = ne.c.f()
            if (r1 == r4) goto L62
            qe.h0 r4 = ne.c.f16173d
            if (r1 != r4) goto L40
            goto L62
        L40:
            qe.h0 r4 = ne.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            ne.b r4 = r3.u()
            zd.l<E, md.i0> r4 = r4.f16159b
            if (r4 == 0) goto L73
            qe.z.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            qe.h0 r2 = ne.c.j()
            goto L7f
        L7b:
            qe.h0 r2 = ne.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            ne.b r4 = r3.u()
            zd.l<E, md.i0> r4 = r4.f16159b
            if (r4 == 0) goto L9a
            qe.z.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.j.o(int, java.lang.Throwable, qd.g):void");
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return i.a(this.f16198f, (i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, null);
    }

    public final Object t(int i10, Object obj) {
        return this.f16198f.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f16197e;
        ae.r.c(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return (E) this.f16198f.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f16198f.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().F0((this.f19053c * ((long) c.f16171b)) + ((long) i10));
        }
        p();
    }

    public final E y(int i10) {
        E eV = v(i10);
        s(i10);
        return eV;
    }
}
