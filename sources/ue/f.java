package ue;

import qe.h0;
import qe.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21788a = k0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f21789b = new h0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h0 f21790c = new h0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0 f21791d = new h0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f21792e = new h0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21793f = k0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final d a(int i10, int i11) {
        return new e(i10, i11);
    }

    public static /* synthetic */ d b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g j(long j10, g gVar) {
        return new g(j10, gVar, 0);
    }
}
