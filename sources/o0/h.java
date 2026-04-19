package o0;

import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import e0.q;
import java.util.List;
import md.i0;
import md.u;
import v1.b0;
import v1.k0;
import v1.m0;
import v1.p0;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    @sd.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {225}, m = "awaitDown")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16227c;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16226b = obj;
            this.f16227c |= Integer.MIN_VALUE;
            return h.d(null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {153, 176}, m = "mouseSelection")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16231d;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16230c = obj;
            this.f16231d |= Integer.MIN_VALUE;
            return h.g(null, null, null, null, this);
        }
    }

    static final class c extends s implements zd.l<b0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.b f16232a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0.b bVar) {
            super(1);
            this.f16232a = bVar;
        }

        public final void a(b0 b0Var) {
            if (this.f16232a.a(b0Var.i())) {
                b0Var.a();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b0 b0Var) {
            a(b0Var);
            return i0.f15558a;
        }
    }

    static final class d extends s implements zd.l<b0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.b f16233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0.g f16234b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0.b bVar, o0.g gVar) {
            super(1);
            this.f16233a = bVar;
            this.f16234b = gVar;
        }

        public final void a(b0 b0Var) {
            if (this.f16233a.d(b0Var.i(), this.f16234b)) {
                b0Var.a();
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b0 b0Var) {
            a(b0Var);
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
    static final class e extends sd.j implements p<k0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f16236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0.b f16237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0.h f16238d;

        @sd.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {100, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "invokeSuspend")
        static final class a extends sd.i implements p<v1.c, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f16239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f16240b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o0.b f16241c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o0.a f16242d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ m0.h f16243e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0.b bVar, o0.a aVar, m0.h hVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f16241c = bVar;
                this.f16242d = aVar;
                this.f16243e = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f16241c, this.f16242d, this.f16243e, dVar);
                aVar.f16240b = obj;
                return aVar;
            }

            @Override // zd.p
            public final Object invoke(v1.c cVar, qd.d<? super i0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r11.f16239a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    md.u.b(r12)
                    goto L8f
                L1f:
                    java.lang.Object r1 = r11.f16240b
                    v1.c r1 = (v1.c) r1
                    md.u.b(r12)
                    goto L3a
                L27:
                    md.u.b(r12)
                    java.lang.Object r12 = r11.f16240b
                    r1 = r12
                    v1.c r1 = (v1.c) r1
                    r11.f16240b = r1
                    r11.f16239a = r4
                    java.lang.Object r12 = o0.h.a(r1, r11)
                    if (r12 != r0) goto L3a
                    return r0
                L3a:
                    v1.p r12 = (v1.p) r12
                    boolean r5 = o0.h.f(r12)
                    r6 = 0
                    if (r5 == 0) goto L7c
                    int r5 = r12.b()
                    boolean r5 = v1.u.b(r5)
                    if (r5 == 0) goto L7c
                    java.util.List r5 = r12.c()
                    int r7 = r5.size()
                    r8 = 0
                    r9 = r8
                L57:
                    if (r9 >= r7) goto L6b
                    java.lang.Object r10 = r5.get(r9)
                    v1.b0 r10 = (v1.b0) r10
                    boolean r10 = r10.q()
                    r10 = r10 ^ r4
                    if (r10 != 0) goto L68
                    r4 = r8
                    goto L6b
                L68:
                    int r9 = r9 + 1
                    goto L57
                L6b:
                    if (r4 == 0) goto L7c
                    o0.b r2 = r11.f16241c
                    o0.a r4 = r11.f16242d
                    r11.f16240b = r6
                    r11.f16239a = r3
                    java.lang.Object r12 = o0.h.b(r1, r2, r4, r12, r11)
                    if (r12 != r0) goto L8f
                    return r0
                L7c:
                    boolean r3 = o0.h.f(r12)
                    if (r3 != 0) goto L8f
                    m0.h r3 = r11.f16243e
                    r11.f16240b = r6
                    r11.f16239a = r2
                    java.lang.Object r12 = o0.h.c(r1, r3, r12, r11)
                    if (r12 != r0) goto L8f
                    return r0
                L8f:
                    md.i0 r12 = md.i0.f15558a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: o0.h.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0.b bVar, m0.h hVar, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f16237c = bVar;
            this.f16238d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            e eVar = new e(this.f16237c, this.f16238d, dVar);
            eVar.f16236b = obj;
            return eVar;
        }

        @Override // zd.p
        public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
            return ((e) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f16235a;
            if (i10 == 0) {
                u.b(obj);
                k0 k0Var = (k0) this.f16236b;
                a aVar = new a(this.f16237c, new o0.a(k0Var.getViewConfiguration()), this.f16238d, null);
                this.f16235a = 1;
                if (q.c(k0Var, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "touchSelection")
    static final class f extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f16247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16248e;

        f(qd.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16247d = obj;
            this.f16248e |= Integer.MIN_VALUE;
            return h.i(null, null, null, this);
        }
    }

    static final class g extends s implements zd.l<b0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0.h f16249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m0.h hVar) {
            super(1);
            this.f16249a = hVar;
        }

        public final void a(b0 b0Var) {
            this.f16249a.c(v1.q.g(b0Var));
            b0Var.a();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b0 b0Var) {
            a(b0Var);
            return i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(v1.c r8, qd.d<? super v1.p> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof o0.h.a
            if (r0 == 0) goto L13
            r0 = r9
            o0.h$a r0 = (o0.h.a) r0
            int r1 = r0.f16227c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16227c = r1
            goto L18
        L13:
            o0.h$a r0 = new o0.h$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16226b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f16227c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f16225a
            v1.c r8 = (v1.c) r8
            md.u.b(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            md.u.b(r9)
        L38:
            v1.r r9 = v1.r.Main
            r0.f16225a = r8
            r0.f16227c = r3
            java.lang.Object r9 = r8.J(r9, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            v1.p r9 = (v1.p) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L51:
            if (r6 >= r4) goto L63
            java.lang.Object r7 = r2.get(r6)
            v1.b0 r7 = (v1.b0) r7
            boolean r7 = v1.q.b(r7)
            if (r7 != 0) goto L60
            goto L64
        L60:
            int r6 = r6 + 1
            goto L51
        L63:
            r5 = r3
        L64:
            if (r5 == 0) goto L38
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.d(v1.c, qd.d):java.lang.Object");
    }

    private static final boolean e(v1.c cVar, long j10, long j11) {
        return k1.f.m(k1.f.s(j10, j11)) < cVar.getViewConfiguration().f();
    }

    public static final boolean f(v1.p pVar) {
        List<b0> listC = pVar.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m0.g(listC.get(i10).o(), m0.f21952a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(v1.c r7, o0.b r8, o0.a r9, v1.p r10, qd.d<? super md.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.g(v1.c, o0.b, o0.a, v1.p, qd.d):java.lang.Object");
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, o0.b bVar, m0.h hVar) {
        return p0.c(eVar, bVar, hVar, new e(bVar, hVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:13:0x0031, B:31:0x00a2, B:33:0x00aa, B:35:0x00b9, B:37:0x00c5, B:38:0x00c8, B:39:0x00cb, B:40:0x00cf, B:18:0x0049, B:24:0x0070, B:26:0x0074, B:28:0x0082, B:21:0x0053), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:13:0x0031, B:31:0x00a2, B:33:0x00aa, B:35:0x00b9, B:37:0x00c5, B:38:0x00c8, B:39:0x00cb, B:40:0x00cf, B:18:0x0049, B:24:0x0070, B:26:0x0074, B:28:0x0082, B:21:0x0053), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(v1.c r9, m0.h r10, v1.p r11, qd.d<? super md.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.h.i(v1.c, m0.h, v1.p, qd.d):java.lang.Object");
    }
}
