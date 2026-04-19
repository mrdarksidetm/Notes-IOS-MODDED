package t0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import qd.g;
import t0.c1;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f20953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f20954b = new x0();

    @sd.d(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {R.styleable.AppCompatTheme_dialogPreferredPadding, R.styleable.AppCompatTheme_dialogTheme}, m = "withFrameNanos")
    static final class a<R> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f20957c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20959e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20957c = obj;
            this.f20959e |= Integer.MIN_VALUE;
            return s1.this.M(null, this);
        }
    }

    public s1(c1 c1Var) {
        this.f20953a = c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object M(zd.l<? super java.lang.Long, ? extends R> r6, qd.d<? super R> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t0.s1.a
            if (r0 == 0) goto L13
            r0 = r7
            t0.s1$a r0 = (t0.s1.a) r0
            int r1 = r0.f20959e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20959e = r1
            goto L18
        L13:
            t0.s1$a r0 = new t0.s1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20957c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f20959e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            md.u.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f20956b
            zd.l r6 = (zd.l) r6
            java.lang.Object r2 = r0.f20955a
            t0.s1 r2 = (t0.s1) r2
            md.u.b(r7)
            goto L53
        L40:
            md.u.b(r7)
            t0.x0 r7 = r5.f20954b
            r0.f20955a = r5
            r0.f20956b = r6
            r0.f20959e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            t0.c1 r7 = r2.f20953a
            r2 = 0
            r0.f20955a = r2
            r0.f20956b = r2
            r0.f20959e = r3
            java.lang.Object r7 = r7.M(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.s1.M(zd.l, qd.d):java.lang.Object");
    }

    public final void b() {
        this.f20954b.d();
    }

    public final void c() {
        this.f20954b.f();
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) c1.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) c1.a.b(this, cVar);
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return c1.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return c1.a.d(this, gVar);
    }
}
