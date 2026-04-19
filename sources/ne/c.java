package ne;

import md.i0;
import qe.h0;
import qe.k0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j<Object> f16170a = new j<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16171b = k0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16172c = k0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f16173d = new h0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f16174e = new h0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0 f16175f = new h0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h0 f16176g = new h0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h0 f16177h = new h0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h0 f16178i = new h0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h0 f16179j = new h0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final h0 f16180k = new h0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h0 f16181l = new h0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final h0 f16182m = new h0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final h0 f16183n = new h0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final h0 f16184o = new h0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final h0 f16185p = new h0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final h0 f16186q = new h0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h0 f16187r = new h0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h0 f16188s = new h0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* synthetic */ class a<E> extends ae.o implements zd.p<Long, j<E>, j<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16189a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j<E> d(long j10, j<E> jVar) {
            return c.x(j10, jVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return d(l10.longValue(), (j) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(le.o<? super T> oVar, T t10, zd.l<? super Throwable, i0> lVar) {
        Object objD = oVar.d(t10, null, lVar);
        if (objD == null) {
            return false;
        }
        oVar.r(objD);
        return true;
    }

    static /* synthetic */ boolean C(le.o oVar, Object obj, zd.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(oVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> j<E> x(long j10, j<E> jVar) {
        return new j<>(j10, jVar, jVar.u(), 0);
    }

    public static final <E> he.f<j<E>> y() {
        return a.f16189a;
    }

    public static final h0 z() {
        return f16181l;
    }
}
