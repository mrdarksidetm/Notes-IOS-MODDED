package b2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.g;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import oe.b0;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Context, oe.f0<Float>> f5278a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f5279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.g2 f5280b;

        a(View view, t0.g2 g2Var) {
            this.f5279a = view;
            this.f5280b = g2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f5279a.removeOnAttachStateChangeListener(this);
            this.f5280b.Y();
        }
    }

    public static final class b implements androidx.lifecycle.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.n0 f5281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.s1 f5282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0.g2 f5283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ae.h0<b1> f5284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f5285e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5286a;

            static {
                int[] iArr = new int[g.a.values().length];
                try {
                    iArr[g.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[g.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[g.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[g.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5286a = iArr;
            }
        }

        /* JADX INFO: renamed from: b2.i2$b$b, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {394}, m = "invokeSuspend")
        static final class C0125b extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f5287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f5288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ae.h0<b1> f5289c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ t0.g2 f5290d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ o4.e f5291e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f5292f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ View f5293g;

            /* JADX INFO: renamed from: b2.i2$b$b$a */
            @sd.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
            static final class a extends sd.j implements zd.p<le.n0, qd.d<? super md.i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f5294a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ oe.f0<Float> f5295b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b1 f5296c;

                /* JADX INFO: renamed from: b2.i2$b$b$a$a, reason: collision with other inner class name */
                static final class C0126a<T> implements oe.f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ b1 f5297a;

                    C0126a(b1 b1Var) {
                        this.f5297a = b1Var;
                    }

                    public final Object a(float f10, qd.d<? super md.i0> dVar) {
                        this.f5297a.b(f10);
                        return md.i0.f15558a;
                    }

                    @Override // oe.f
                    public /* bridge */ /* synthetic */ Object b(Object obj, qd.d dVar) {
                        return a(((Number) obj).floatValue(), dVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(oe.f0<Float> f0Var, b1 b1Var, qd.d<? super a> dVar) {
                    super(2, dVar);
                    this.f5295b = f0Var;
                    this.f5296c = b1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                    return new a(this.f5295b, this.f5296c, dVar);
                }

                @Override // zd.p
                public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                    return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f5294a;
                    if (i10 == 0) {
                        md.u.b(obj);
                        oe.f0<Float> f0Var = this.f5295b;
                        C0126a c0126a = new C0126a(this.f5296c);
                        this.f5294a = 1;
                        if (f0Var.a(c0126a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    throw new md.i();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125b(ae.h0<b1> h0Var, t0.g2 g2Var, o4.e eVar, b bVar, View view, qd.d<? super C0125b> dVar) {
                super(2, dVar);
                this.f5289c = h0Var;
                this.f5290d = g2Var;
                this.f5291e = eVar;
                this.f5292f = bVar;
                this.f5293g = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                C0125b c0125b = new C0125b(this.f5289c, this.f5290d, this.f5291e, this.f5292f, this.f5293g, dVar);
                c0125b.f5288b = obj;
                return c0125b;
            }

            @Override // zd.p
            public final Object invoke(le.n0 n0Var, qd.d<? super md.i0> dVar) {
                return ((C0125b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r11.f5287a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r11.f5288b
                    le.a2 r0 = (le.a2) r0
                    md.u.b(r12)     // Catch: java.lang.Throwable -> L14
                    goto L67
                L14:
                    r12 = move-exception
                    goto L81
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    md.u.b(r12)
                    java.lang.Object r12 = r11.f5288b
                    r4 = r12
                    le.n0 r4 = (le.n0) r4
                    ae.h0<b2.b1> r12 = r11.f5289c     // Catch: java.lang.Throwable -> L7f
                    T r12 = r12.f712a     // Catch: java.lang.Throwable -> L7f
                    b2.b1 r12 = (b2.b1) r12     // Catch: java.lang.Throwable -> L7f
                    if (r12 == 0) goto L58
                    android.view.View r1 = r11.f5293g     // Catch: java.lang.Throwable -> L7f
                    android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L7f
                    android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L7f
                    oe.f0 r1 = b2.i2.a(r1)     // Catch: java.lang.Throwable -> L7f
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L7f
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L7f
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L7f
                    r12.b(r5)     // Catch: java.lang.Throwable -> L7f
                    r5 = 0
                    r6 = 0
                    b2.i2$b$b$a r7 = new b2.i2$b$b$a     // Catch: java.lang.Throwable -> L7f
                    r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L7f
                    r8 = 3
                    r9 = 0
                    le.a2 r12 = le.i.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7f
                    goto L59
                L58:
                    r12 = r3
                L59:
                    t0.g2 r1 = r11.f5290d     // Catch: java.lang.Throwable -> L7a
                    r11.f5288b = r12     // Catch: java.lang.Throwable -> L7a
                    r11.f5287a = r2     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r1 = r1.y0(r11)     // Catch: java.lang.Throwable -> L7a
                    if (r1 != r0) goto L66
                    return r0
                L66:
                    r0 = r12
                L67:
                    if (r0 == 0) goto L6c
                    le.a2.a.b(r0, r3, r2, r3)
                L6c:
                    o4.e r12 = r11.f5291e
                    androidx.lifecycle.g r12 = r12.getLifecycle()
                    b2.i2$b r0 = r11.f5292f
                    r12.c(r0)
                    md.i0 r12 = md.i0.f15558a
                    return r12
                L7a:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                    goto L81
                L7f:
                    r12 = move-exception
                    r0 = r3
                L81:
                    if (r0 == 0) goto L86
                    le.a2.a.b(r0, r3, r2, r3)
                L86:
                    o4.e r0 = r11.f5291e
                    androidx.lifecycle.g r0 = r0.getLifecycle()
                    b2.i2$b r1 = r11.f5292f
                    r0.c(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: b2.i2.b.C0125b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(le.n0 n0Var, t0.s1 s1Var, t0.g2 g2Var, ae.h0<b1> h0Var, View view) {
            this.f5281a = n0Var;
            this.f5282b = s1Var;
            this.f5283c = g2Var;
            this.f5284d = h0Var;
            this.f5285e = view;
        }

        @Override // androidx.lifecycle.i
        public void s(o4.e eVar, g.a aVar) {
            int i10 = a.f5286a[aVar.ordinal()];
            if (i10 == 1) {
                le.k.d(this.f5281a, null, le.p0.UNDISPATCHED, new C0125b(this.f5284d, this.f5283c, eVar, this, this.f5285e, null), 1, null);
                return;
            }
            if (i10 == 2) {
                t0.s1 s1Var = this.f5282b;
                if (s1Var != null) {
                    s1Var.c();
                }
                this.f5283c.x0();
                return;
            }
            if (i10 == 3) {
                this.f5283c.l0();
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f5283c.Y();
            }
        }
    }

    @sd.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<oe.f<? super Float>, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContentResolver f5301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f5302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f5303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ne.d<md.i0> f5304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f5305h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, ne.d<md.i0> dVar2, Context context, qd.d<? super c> dVar3) {
            super(2, dVar3);
            this.f5301d = contentResolver;
            this.f5302e = uri;
            this.f5303f = dVar;
            this.f5304g = dVar2;
            this.f5305h = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            c cVar = new c(this.f5301d, this.f5302e, this.f5303f, this.f5304g, this.f5305h, dVar);
            cVar.f5300c = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(oe.f<? super Float> fVar, qd.d<? super md.i0> dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r9.f5299b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f5298a
                ne.f r1 = (ne.f) r1
                java.lang.Object r4 = r9.f5300c
                oe.f r4 = (oe.f) r4
                md.u.b(r10)     // Catch: java.lang.Throwable -> L91
                r10 = r4
                goto L48
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f5298a
                ne.f r1 = (ne.f) r1
                java.lang.Object r4 = r9.f5300c
                oe.f r4 = (oe.f) r4
                md.u.b(r10)     // Catch: java.lang.Throwable -> L91
                r5 = r4
                r4 = r9
                goto L59
            L31:
                md.u.b(r10)
                java.lang.Object r10 = r9.f5300c
                oe.f r10 = (oe.f) r10
                android.content.ContentResolver r1 = r9.f5301d
                android.net.Uri r4 = r9.f5302e
                r5 = 0
                b2.i2$d r6 = r9.f5303f
                r1.registerContentObserver(r4, r5, r6)
                ne.d<md.i0> r1 = r9.f5304g     // Catch: java.lang.Throwable -> L91
                ne.f r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
            L48:
                r4 = r9
            L49:
                r4.f5300c = r10     // Catch: java.lang.Throwable -> L8f
                r4.f5298a = r1     // Catch: java.lang.Throwable -> L8f
                r4.f5299b = r3     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L8f
                if (r5 != r0) goto L56
                return r0
            L56:
                r8 = r5
                r5 = r10
                r10 = r8
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
                if (r10 == 0) goto L85
                r1.next()     // Catch: java.lang.Throwable -> L8f
                android.content.Context r10 = r4.f5305h     // Catch: java.lang.Throwable -> L8f
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8f
                java.lang.String r6 = "animator_duration_scale"
                r7 = 1065353216(0x3f800000, float:1.0)
                float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L8f
                java.lang.Float r10 = sd.a.c(r10)     // Catch: java.lang.Throwable -> L8f
                r4.f5300c = r5     // Catch: java.lang.Throwable -> L8f
                r4.f5298a = r1     // Catch: java.lang.Throwable -> L8f
                r4.f5299b = r2     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r10 = r5.b(r10, r4)     // Catch: java.lang.Throwable -> L8f
                if (r10 != r0) goto L83
                return r0
            L83:
                r10 = r5
                goto L49
            L85:
                android.content.ContentResolver r10 = r4.f5301d
                b2.i2$d r0 = r4.f5303f
                r10.unregisterContentObserver(r0)
                md.i0 r10 = md.i0.f15558a
                return r10
            L8f:
                r10 = move-exception
                goto L93
            L91:
                r10 = move-exception
                r4 = r9
            L93:
                android.content.ContentResolver r0 = r4.f5301d
                b2.i2$d r1 = r4.f5303f
                r0.unregisterContentObserver(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.i2.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ne.d<md.i0> f5306a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ne.d<md.i0> dVar, Handler handler) {
            super(handler);
            this.f5306a = dVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f5306a.i(md.i0.f15558a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [qd.g] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, b2.b1] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r10v3, types: [qd.g] */
    public static final t0.g2 b(View view, qd.g gVar, androidx.lifecycle.g gVar2) {
        t0.s1 s1Var;
        if (gVar.get(qd.e.U) == null || gVar.get(t0.c1.W) == null) {
            gVar = b0.f5188m.a().plus(gVar);
        }
        t0.c1 c1Var = (t0.c1) gVar.get(t0.c1.W);
        if (c1Var != null) {
            t0.s1 s1Var2 = new t0.s1(c1Var);
            s1Var2.b();
            s1Var = s1Var2;
        } else {
            s1Var = null;
        }
        ae.h0 h0Var = new ae.h0();
        f1.d dVar = (f1.d) gVar.get(f1.d.P);
        ?? r02 = dVar;
        if (dVar == null) {
            ?? b1Var = new b1();
            h0Var.f712a = b1Var;
            r02 = b1Var;
        }
        qd.g gVarPlus = gVar.plus(s1Var != null ? s1Var : qd.h.f19040a).plus(r02);
        t0.g2 g2Var = new t0.g2(gVarPlus);
        g2Var.l0();
        le.n0 n0VarA = le.o0.a(gVarPlus);
        if (gVar2 == null) {
            o4.e eVarA = o4.r.a(view);
            gVar2 = eVarA != null ? eVarA.getLifecycle() : null;
        }
        if (gVar2 != null) {
            view.addOnAttachStateChangeListener(new a(view, g2Var));
            gVar2.a(new b(n0VarA, s1Var, g2Var, h0Var, view));
            return g2Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ t0.g2 c(View view, qd.g gVar, androidx.lifecycle.g gVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        if ((i10 & 2) != 0) {
            gVar2 = null;
        }
        return b(view, gVar, gVar2);
    }

    public static final t0.q d(View view) {
        t0.q qVarF = f(view);
        if (qVarF != null) {
            return qVarF;
        }
        for (ViewParent parent = view.getParent(); qVarF == null && (parent instanceof View); parent = parent.getParent()) {
            qVarF = f((View) parent);
        }
        return qVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oe.f0<Float> e(Context context) {
        oe.f0<Float> f0Var;
        Map<Context, oe.f0<Float>> map = f5278a;
        synchronized (map) {
            oe.f0<Float> f0VarS = map.get(context);
            if (f0VarS == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                ne.d dVarB = ne.g.b(-1, null, null, 6, null);
                f0VarS = oe.g.s(oe.g.o(new c(contentResolver, uriFor, new d(dVarB, k3.f.a(Looper.getMainLooper())), dVarB, context, null)), le.o0.b(), b0.a.b(oe.b0.f16466a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, f0VarS);
            }
            f0Var = f0VarS;
        }
        return f0Var;
    }

    public static final t0.q f(View view) {
        Object tag = view.getTag(f1.e.G);
        if (tag instanceof t0.q) {
            return (t0.q) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final t0.g2 h(View view) {
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View viewG = g(view);
        t0.q qVarF = f(viewG);
        if (qVarF == null) {
            return h2.f5270a.a(viewG);
        }
        if (qVarF instanceof t0.g2) {
            return (t0.g2) qVarF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static final void i(View view, t0.q qVar) {
        view.setTag(f1.e.G, qVar);
    }
}
