package a4;

import ae.r;
import ae.s;
import com.google.android.gms.common.api.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.concurrent.atomic.AtomicInteger;
import le.a2;
import le.n0;
import md.i0;
import ne.h;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p<T, qd.d<? super i0>, Object> f440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ne.d<T> f441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f442d;

    static final class a extends s implements zd.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Throwable, i0> f443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T> f444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, i0> f445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.l<? super Throwable, i0> lVar, l<T> lVar2, p<? super T, ? super Throwable, i0> pVar) {
            super(1);
            this.f443a = lVar;
            this.f444b = lVar2;
            this.f445c = pVar;
        }

        public final void a(Throwable th) {
            i0 i0Var;
            this.f443a.invoke(th);
            ((l) this.f444b).f441c.h(th);
            do {
                Object objF = ne.h.f(((l) this.f444b).f441c.g());
                if (objF == null) {
                    i0Var = null;
                } else {
                    this.f445c.invoke((T) objF, th);
                    i0Var = i0.f15558a;
                }
            } while (i0Var != null);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
    static final class b extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<T> f448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f448c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new b(this.f448c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r7.f447b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                md.u.b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f446a
                zd.p r1 = (zd.p) r1
                md.u.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                md.u.b(r8)
                a4.l<T> r8 = r7.f448c
                java.util.concurrent.atomic.AtomicInteger r8 = a4.l.c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                a4.l<T> r1 = r8.f448c
                le.n0 r1 = a4.l.d(r1)
                le.o0.f(r1)
                a4.l<T> r1 = r8.f448c
                zd.p r1 = a4.l.a(r1)
                a4.l<T> r4 = r8.f448c
                ne.d r4 = a4.l.b(r4)
                r8.f446a = r1
                r8.f447b = r3
                java.lang.Object r4 = r4.c(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f446a = r5
                r0.f447b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                a4.l<T> r1 = r8.f448c
                java.util.concurrent.atomic.AtomicInteger r1 = a4.l.c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                md.i0 r8 = md.i0.f15558a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(n0 n0Var, zd.l<? super Throwable, i0> lVar, p<? super T, ? super Throwable, i0> pVar, p<? super T, ? super qd.d<? super i0>, ? extends Object> pVar2) {
        r.f(n0Var, "scope");
        r.f(lVar, "onComplete");
        r.f(pVar, "onUndeliveredElement");
        r.f(pVar2, "consumeMessage");
        this.f439a = n0Var;
        this.f440b = pVar2;
        this.f441c = ne.g.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f442d = new AtomicInteger(0);
        a2 a2Var = (a2) n0Var.getCoroutineContext().get(a2.R);
        if (a2Var == null) {
            return;
        }
        a2Var.invokeOnCompletion(new a(lVar, this, pVar));
    }

    public final void e(T t10) throws Throwable {
        Object objI = this.f441c.i(t10);
        if (objI instanceof h.a) {
            Throwable thE = ne.h.e(objI);
            if (thE != null) {
                throw thE;
            }
            throw new ne.n("Channel was closed normally");
        }
        if (!ne.h.i(objI)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f442d.getAndIncrement() == 0) {
            le.k.d(this.f439a, null, null, new b(this, null), 3, null);
        }
    }
}
