package e0;

import ae.e0;
import c0.d1;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "animateScrollBy")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10453c;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10452b = obj;
            this.f10453c |= Integer.MIN_VALUE;
            return w.a(null, 0.0f, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<x, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.i<Float> f10457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f10458e;

        static final class a extends ae.s implements zd.p<Float, Float, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e0 f10459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f10460b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, x xVar) {
                super(2);
                this.f10459a = e0Var;
                this.f10460b = xVar;
            }

            public final void a(float f10, float f11) {
                e0 e0Var = this.f10459a;
                float f12 = e0Var.f701a;
                e0Var.f701a = f12 + this.f10460b.a(f10 - f12);
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ i0 invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, c0.i<Float> iVar, e0 e0Var, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f10456c = f10;
            this.f10457d = iVar;
            this.f10458e = e0Var;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x xVar, qd.d<? super i0> dVar) {
            return ((b) create(xVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f10456c, this.f10457d, this.f10458e, dVar);
            bVar.f10455b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10454a;
            if (i10 == 0) {
                md.u.b(obj);
                x xVar = (x) this.f10455b;
                float f10 = this.f10456c;
                c0.i<Float> iVar = this.f10457d;
                a aVar = new a(this.f10458e, xVar);
                this.f10454a = 1;
                if (d1.e(0.0f, f10, 0.0f, iVar, aVar, this, 4, null) == objE) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(e0.z r7, float r8, c0.i<java.lang.Float> r9, qd.d<? super java.lang.Float> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof e0.w.a
            if (r0 == 0) goto L13
            r0 = r10
            e0.w$a r0 = (e0.w.a) r0
            int r1 = r0.f10453c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10453c = r1
            goto L18
        L13:
            e0.w$a r0 = new e0.w$a
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f10452b
            java.lang.Object r0 = rd.b.e()
            int r1 = r4.f10453c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f10451a
            ae.e0 r7 = (ae.e0) r7
            md.u.b(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            md.u.b(r10)
            ae.e0 r10 = new ae.e0
            r10.<init>()
            r3 = 0
            e0.w$b r5 = new e0.w$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f10451a = r10
            r4.f10453c = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = e0.z.f(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.f701a
            java.lang.Float r7 = sd.a.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.w.a(e0.z, float, c0.i, qd.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(z zVar, float f10, c0.i iVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = c0.j.g(0.0f, 0.0f, null, 7, null);
        }
        return a(zVar, f10, iVar, dVar);
    }
}
