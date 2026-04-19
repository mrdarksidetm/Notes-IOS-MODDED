package hf;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f11955a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f11956b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f11957c = new d0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference<d0>[] f11959e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f11958d = iHighestOneBit;
        AtomicReference<d0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f11959e = atomicReferenceArr;
    }

    private e0() {
    }

    private final AtomicReference<d0> a() {
        return f11959e[(int) (Thread.currentThread().getId() & (((long) f11958d) - 1))];
    }

    public static final void b(d0 d0Var) {
        AtomicReference<d0> atomicReferenceA;
        d0 d0Var2;
        d0 andSet;
        ae.r.f(d0Var, "segment");
        if (!(d0Var.f11953f == null && d0Var.f11954g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (d0Var.f11951d || (andSet = (atomicReferenceA = f11955a.a()).getAndSet((d0Var2 = f11957c))) == d0Var2) {
            return;
        }
        int i10 = andSet != null ? andSet.f11950c : 0;
        if (i10 >= f11956b) {
            atomicReferenceA.set(andSet);
            return;
        }
        d0Var.f11953f = andSet;
        d0Var.f11949b = 0;
        d0Var.f11950c = i10 + 8192;
        atomicReferenceA.set(d0Var);
    }

    public static final d0 c() {
        AtomicReference<d0> atomicReferenceA = f11955a.a();
        d0 d0Var = f11957c;
        d0 andSet = atomicReferenceA.getAndSet(d0Var);
        if (andSet == d0Var) {
            return new d0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new d0();
        }
        atomicReferenceA.set(andSet.f11953f);
        andSet.f11953f = null;
        andSet.f11950c = 0;
        return andSet;
    }
}
