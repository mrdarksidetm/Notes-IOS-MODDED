package pe;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import le.n0;
import le.o0;
import le.p0;
import le.r0;
import md.i0;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.g f18318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.a f18320c;

    @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ oe.f<T> f18323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<T> f18324d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(oe.f<? super T> fVar, e<T> eVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f18323c = fVar;
            this.f18324d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f18323c, this.f18324d, dVar);
            aVar.f18322b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f18321a;
            if (i10 == 0) {
                md.u.b(obj);
                n0 n0Var = (n0) this.f18322b;
                oe.f<T> fVar = this.f18323c;
                ne.t<T> tVarO = this.f18324d.o(n0Var);
                this.f18321a = 1;
                if (oe.g.i(fVar, tVarO, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_controlBackground}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<ne.r<? super T>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<T> f18327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f18327c = eVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ne.r<? super T> rVar, qd.d<? super i0> dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f18327c, dVar);
            bVar.f18326b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f18325a;
            if (i10 == 0) {
                md.u.b(obj);
                ne.r<? super T> rVar = (ne.r) this.f18326b;
                e<T> eVar = this.f18327c;
                this.f18325a = 1;
                if (eVar.g(rVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public e(qd.g gVar, int i10, ne.a aVar) {
        this.f18318a = gVar;
        this.f18319b = i10;
        this.f18320c = aVar;
    }

    static /* synthetic */ <T> Object f(e<T> eVar, oe.f<? super T> fVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new a(fVar, eVar, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    @Override // oe.e
    public Object a(oe.f<? super T> fVar, qd.d<? super i0> dVar) {
        return f(this, fVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[PHI: r4
  0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // pe.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oe.e<T> c(qd.g r2, int r3, ne.a r4) {
        /*
            r1 = this;
            qd.g r0 = r1.f18318a
            qd.g r2 = r2.plus(r0)
            ne.a r0 = ne.a.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f18319b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r4 = r4 + r3
            if (r4 < 0) goto L20
            goto L13
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            ne.a r4 = r1.f18320c
        L25:
            qd.g r0 = r1.f18318a
            boolean r0 = ae.r.b(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f18319b
            if (r3 != r0) goto L36
            ne.a r0 = r1.f18320c
            if (r4 != r0) goto L36
            return r1
        L36:
            pe.e r2 = r1.j(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.e.c(qd.g, int, ne.a):oe.e");
    }

    protected String d() {
        return null;
    }

    protected abstract Object g(ne.r<? super T> rVar, qd.d<? super i0> dVar);

    protected abstract e<T> j(qd.g gVar, int i10, ne.a aVar);

    public oe.e<T> l() {
        return null;
    }

    public final zd.p<ne.r<? super T>, qd.d<? super i0>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i10 = this.f18319b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public ne.t<T> o(n0 n0Var) {
        return ne.p.c(n0Var, this.f18318a, n(), this.f18320c, p0.ATOMIC, null, m(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        if (this.f18318a != qd.h.f19040a) {
            arrayList.add("context=" + this.f18318a);
        }
        if (this.f18319b != -3) {
            arrayList.add("capacity=" + this.f18319b);
        }
        if (this.f18320c != ne.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f18320c);
        }
        return r0.a(this) + '[' + c0.h0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
