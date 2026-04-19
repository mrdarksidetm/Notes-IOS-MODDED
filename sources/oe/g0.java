package oe;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class g0<T> extends pe.b<i0> implements s<T>, e, pe.m<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16496f = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16497e;

    @sd.d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, RCHTTPStatusCodes.UNAUTHORIZED}, m = "collect")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0<T> f16504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16505h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0<T> g0Var, qd.d<? super a> dVar) {
            super(dVar);
            this.f16504g = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16503f = obj;
            this.f16505h |= Integer.MIN_VALUE;
            return this.f16504g.a(null, this);
        }
    }

    public g0(Object obj) {
        this._state = obj;
    }

    private final boolean r(Object obj, Object obj2) {
        int i10;
        i0[] i0VarArrO;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16496f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !ae.r.b(obj3, obj)) {
                return false;
            }
            if (ae.r.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f16497e;
            if ((i11 & 1) != 0) {
                this.f16497e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f16497e = i12;
            i0[] i0VarArrO2 = o();
            md.i0 i0Var = md.i0.f15558a;
            while (true) {
                i0[] i0VarArr = i0VarArrO2;
                if (i0VarArr != null) {
                    for (i0 i0Var2 : i0VarArr) {
                        if (i0Var2 != null) {
                            i0Var2.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f16497e;
                    if (i10 == i12) {
                        this.f16497e = i12 + 1;
                        return true;
                    }
                    i0VarArrO = o();
                    md.i0 i0Var3 = md.i0.f15558a;
                }
                i0VarArrO2 = i0VarArrO;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:38:0x00b3, B:40:0x00b9], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:40:0x00b9, B:38:0x00b3], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [pe.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, oe.i0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, oe.f] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d8 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ea -> B:34:0x00a6). Please report as a decompilation issue!!! */
    @Override // oe.v, oe.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(oe.f<? super T> r11, qd.d<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.g0.a(oe.f, qd.d):java.lang.Object");
    }

    @Override // oe.r, oe.f
    public Object b(T t10, qd.d<? super md.i0> dVar) {
        setValue(t10);
        return md.i0.f15558a;
    }

    @Override // pe.m
    public e<T> c(qd.g gVar, int i10, ne.a aVar) {
        return h0.d(this, gVar, i10, aVar);
    }

    @Override // oe.s
    public boolean e(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) pe.p.f18356a;
        }
        if (t11 == null) {
            t11 = (T) pe.p.f18356a;
        }
        return r(t10, t11);
    }

    @Override // oe.s, oe.f0
    public T getValue() {
        qe.h0 h0Var = pe.p.f18356a;
        T t10 = (T) f16496f.get(this);
        if (t10 == h0Var) {
            return null;
        }
        return t10;
    }

    @Override // oe.r
    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // oe.r
    public boolean i(T t10) {
        setValue(t10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pe.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i0 j() {
        return new i0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pe.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i0[] l(int i10) {
        return new i0[i10];
    }

    @Override // oe.s
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) pe.p.f18356a;
        }
        r(null, t10);
    }
}
