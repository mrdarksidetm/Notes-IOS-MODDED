package qe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import le.r0;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19093a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19094b = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19095c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends qe.b<s> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f19096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f19097c;

        public a(s sVar) {
            this.f19096b = sVar;
        }

        @Override // qe.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(s sVar, Object obj) {
            boolean z10 = obj == null;
            s sVar2 = z10 ? this.f19096b : this.f19097c;
            if (sVar2 != null && b3.b.a(s.f19093a, sVar, this, sVar2) && z10) {
                s sVar3 = this.f19096b;
                s sVar4 = this.f19097c;
                ae.r.c(sVar4);
                sVar3.i(sVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (b3.b.a(r4, r3, r2, ((qe.b0) r5).f19046a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final qe.s f(qe.a0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qe.s.f19094b
            java.lang.Object r0 = r0.get(r8)
            qe.s r0 = (qe.s) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = qe.s.f19093a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qe.s.f19094b
            boolean r0 = b3.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof qe.a0
            if (r6 == 0) goto L34
            qe.a0 r5 = (qe.a0) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof qe.b0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            qe.b0 r5 = (qe.b0) r5
            qe.s r5 = r5.f19046a
            boolean r2 = b3.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = qe.s.f19094b
            java.lang.Object r2 = r4.get(r2)
            qe.s r2 = (qe.s) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            ae.r.d(r5, r3)
            r3 = r5
            qe.s r3 = (qe.s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.s.f(qe.a0):qe.s");
    }

    private final s h(s sVar) {
        while (sVar.m()) {
            sVar = (s) f19094b.get(sVar);
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(s sVar) {
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19094b;
        do {
            sVar2 = (s) atomicReferenceFieldUpdater.get(sVar);
            if (j() != sVar) {
                return;
            }
        } while (!b3.b.a(f19094b, sVar, sVar2, this));
        if (m()) {
            sVar.f(null);
        }
    }

    private final b0 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19095c;
        b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        atomicReferenceFieldUpdater.lazySet(this, b0Var2);
        return b0Var2;
    }

    public final boolean e(s sVar) {
        f19094b.lazySet(sVar, this);
        f19093a.lazySet(sVar, this);
        while (j() == this) {
            if (b3.b.a(f19093a, this, this, sVar)) {
                sVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    public final s k() {
        return r.b(j());
    }

    public final s l() {
        s sVarF = f(null);
        return sVarF == null ? h((s) f19094b.get(this)) : sVarF;
    }

    public boolean m() {
        return j() instanceof b0;
    }

    public boolean n() {
        return o() == null;
    }

    public final s o() {
        Object objJ;
        s sVar;
        do {
            objJ = j();
            if (objJ instanceof b0) {
                return ((b0) objJ).f19046a;
            }
            if (objJ == this) {
                return (s) objJ;
            }
            ae.r.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            sVar = (s) objJ;
        } while (!b3.b.a(f19093a, this, objJ, sVar.p()));
        sVar.f(null);
        return null;
    }

    public final int q(s sVar, s sVar2, a aVar) {
        f19094b.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093a;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        aVar.f19097c = sVar2;
        if (b3.b.a(atomicReferenceFieldUpdater, this, sVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new ae.z(this) { // from class: qe.s.b
            @Override // he.h
            public Object get() {
                return r0.a(this.receiver);
            }
        } + '@' + r0.b(this);
    }
}
