package b2;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f5391a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f5392b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f5393c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5394d = 8;

    @sd.d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f5396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ne.d<md.i0> f5398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ne.d<md.i0> dVar, qd.d<? super a> dVar2) {
            super(2, dVar2);
            this.f5398d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f5398d, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:17:0x0042, B:19:0x004a, B:20:0x0062), top: B:30:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #0 {all -> 0x006a, blocks: (B:17:0x0042, B:19:0x004a, B:20:0x0062), top: B:30:0x0042 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r7.f5397c
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f5396b
                ne.f r1 = (ne.f) r1
                java.lang.Object r3 = r7.f5395a
                ne.t r3 = (ne.t) r3
                md.u.b(r8)     // Catch: java.lang.Throwable -> L6d
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L41
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                md.u.b(r8)
                ne.d<md.i0> r3 = r7.f5398d
                ne.f r8 = r3.iterator()     // Catch: java.lang.Throwable -> L6d
                r1 = r8
                r8 = r7
            L2e:
                r8.f5395a = r3     // Catch: java.lang.Throwable -> L6d
                r8.f5396b = r1     // Catch: java.lang.Throwable -> L6d
                r8.f5397c = r2     // Catch: java.lang.Throwable -> L6d
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L6d
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L41:
                r5 = 0
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6a
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6a
                if (r8 == 0) goto L62
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L6a
                md.i0 r8 = (md.i0) r8     // Catch: java.lang.Throwable -> L6a
                java.util.concurrent.atomic.AtomicBoolean r8 = b2.q0.a()     // Catch: java.lang.Throwable -> L6a
                r5 = 0
                r8.set(r5)     // Catch: java.lang.Throwable -> L6a
                d1.k$a r8 = d1.k.f9368e     // Catch: java.lang.Throwable -> L6a
                r8.k()     // Catch: java.lang.Throwable -> L6a
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L62:
                md.i0 r8 = md.i0.f15558a     // Catch: java.lang.Throwable -> L6a
                ne.k.a(r4, r5)
                md.i0 r8 = md.i0.f15558a
                return r8
            L6a:
                r8 = move-exception
                r3 = r4
                goto L6e
            L6d:
                r8 = move-exception
            L6e:
                throw r8     // Catch: java.lang.Throwable -> L6f
            L6f:
                r0 = move-exception
                ne.k.a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.q0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ne.d<md.i0> f5399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ne.d<md.i0> dVar) {
            super(1);
            this.f5399a = dVar;
        }

        public final void a(Object obj) {
            if (q0.f5393c.compareAndSet(false, true)) {
                this.f5399a.i(md.i0.f15558a);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    private q0() {
    }

    public final void b() {
        if (f5392b.compareAndSet(false, true)) {
            ne.d dVarB = ne.g.b(1, null, null, 6, null);
            le.k.d(le.o0.a(b0.f5188m.b()), null, null, new a(dVarB, null), 3, null);
            d1.k.f9368e.i(new b(dVarB));
        }
    }
}
