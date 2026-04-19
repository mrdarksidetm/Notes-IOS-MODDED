package o6;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.i0;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    @sd.d(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle}, m = "awaitStarted")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16378d;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16377c = obj;
            this.f16378d |= Integer.MIN_VALUE;
            return g.a(null, this);
        }
    }

    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.o<i0> f16379a;

        /* JADX WARN: Multi-variable type inference failed */
        b(le.o<? super i0> oVar) {
            this.f16379a = oVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(o4.e eVar) {
            le.o<i0> oVar = this.f16379a;
            t.a aVar = md.t.f15576b;
            oVar.resumeWith(md.t.b(i0.f15558a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, o6.g$b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.g r6, qd.d<? super md.i0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof o6.g.a
            if (r0 == 0) goto L13
            r0 = r7
            o6.g$a r0 = (o6.g.a) r0
            int r1 = r0.f16378d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16378d = r1
            goto L18
        L13:
            o6.g$a r0 = new o6.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16377c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16378d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f16376b
            ae.h0 r6 = (ae.h0) r6
            java.lang.Object r0 = r0.f16375a
            androidx.lifecycle.g r0 = (androidx.lifecycle.g) r0
            md.u.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L85
        L31:
            r7 = move-exception
            goto L96
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            md.u.b(r7)
            androidx.lifecycle.g$b r7 = r6.b()
            androidx.lifecycle.g$b r2 = androidx.lifecycle.g.b.STARTED
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L4d
            md.i0 r6 = md.i0.f15558a
            return r6
        L4d:
            ae.h0 r7 = new ae.h0
            r7.<init>()
            r0.f16375a = r6     // Catch: java.lang.Throwable -> L91
            r0.f16376b = r7     // Catch: java.lang.Throwable -> L91
            r0.f16378d = r3     // Catch: java.lang.Throwable -> L91
            le.p r2 = new le.p     // Catch: java.lang.Throwable -> L91
            qd.d r4 = rd.b.c(r0)     // Catch: java.lang.Throwable -> L91
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L91
            r2.A()     // Catch: java.lang.Throwable -> L91
            o6.g$b r3 = new o6.g$b     // Catch: java.lang.Throwable -> L91
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L91
            r7.f712a = r3     // Catch: java.lang.Throwable -> L91
            ae.r.c(r3)     // Catch: java.lang.Throwable -> L91
            o4.d r3 = (o4.d) r3     // Catch: java.lang.Throwable -> L91
            r6.a(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r2.x()     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = rd.b.e()     // Catch: java.lang.Throwable -> L91
            if (r2 != r3) goto L80
            sd.f.c(r0)     // Catch: java.lang.Throwable -> L91
        L80:
            if (r2 != r1) goto L83
            return r1
        L83:
            r0 = r6
            r6 = r7
        L85:
            T r6 = r6.f712a
            o4.d r6 = (o4.d) r6
            if (r6 == 0) goto L8e
            r0.c(r6)
        L8e:
            md.i0 r6 = md.i0.f15558a
            return r6
        L91:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L96:
            T r6 = r6.f712a
            o4.d r6 = (o4.d) r6
            if (r6 == 0) goto L9f
            r0.c(r6)
        L9f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.g.a(androidx.lifecycle.g, qd.d):java.lang.Object");
    }

    public static final void b(androidx.lifecycle.g gVar, o4.d dVar) {
        gVar.c(dVar);
        gVar.a(dVar);
    }
}
