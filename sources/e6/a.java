package e6;

import ae.h0;
import ae.j;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import e6.b;
import h6.c;
import j6.m;
import j6.p;
import j6.q;
import java.util.List;
import le.n0;
import md.i0;
import md.u;
import o6.l;
import o6.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e6.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0247a f10544e = new C0247a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x5.e f10545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f10546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f10547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h6.d f10548d;

    /* JADX INFO: renamed from: e6.a$a, reason: collision with other inner class name */
    public static final class C0247a {
        private C0247a() {
        }

        public /* synthetic */ C0247a(j jVar) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f10549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f10550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a6.d f10551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10552d;

        public b(Drawable drawable, boolean z10, a6.d dVar, String str) {
            this.f10549a = drawable;
            this.f10550b = z10;
            this.f10551c = dVar;
            this.f10552d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, a6.d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f10549a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f10550b;
            }
            if ((i10 & 4) != 0) {
                dVar = bVar.f10551c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f10552d;
            }
            return bVar.a(drawable, z10, dVar, str);
        }

        public final b a(Drawable drawable, boolean z10, a6.d dVar, String str) {
            return new b(drawable, z10, dVar, str);
        }

        public final a6.d c() {
            return this.f10551c;
        }

        public final String d() {
            return this.f10552d;
        }

        public final Drawable e() {
            return this.f10549a;
        }

        public final boolean f() {
            return this.f10550b;
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f10558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f10559g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f10560h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f10561i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f10562j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f10564l;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10562j = obj;
            this.f10564l |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, null, null, this);
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 144}, m = "execute")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f10570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f10571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f10572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f10573i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f10575k;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10573i = obj;
            this.f10575k |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, this);
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<n0, qd.d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10576a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0<d6.h> f10578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0<x5.b> f10579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j6.h f10580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f10581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0<m> f10582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ x5.c f10583h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0<d6.h> h0Var, h0<x5.b> h0Var2, j6.h hVar, Object obj, h0<m> h0Var3, x5.c cVar, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f10578c = h0Var;
            this.f10579d = h0Var2;
            this.f10580e = hVar;
            this.f10581f = obj;
            this.f10582g = h0Var3;
            this.f10583h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return a.this.new e(this.f10578c, this.f10579d, this.f10580e, this.f10581f, this.f10582g, this.f10583h, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super b> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10576a;
            if (i10 == 0) {
                u.b(obj);
                a aVar = a.this;
                d6.m mVar = (d6.m) this.f10578c.f712a;
                x5.b bVar = this.f10579d.f712a;
                j6.h hVar = this.f10580e;
                Object obj2 = this.f10581f;
                m mVar2 = this.f10582g.f712a;
                x5.c cVar = this.f10583h;
                this.f10576a = 1;
                obj = aVar.h(mVar, bVar, hVar, obj2, mVar2, cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return obj;
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
    static final class f extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f10589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f10590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f10592i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f10594k;

        f(qd.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10592i = obj;
            this.f10594k |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, null, this);
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "intercept")
    static final class g extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10597c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10599e;

        g(qd.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10597c = obj;
            this.f10599e |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
    static final class h extends sd.j implements zd.p<n0, qd.d<? super q>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j6.h f10602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f10603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f10604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x5.c f10605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f10606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b.a f10607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j6.h hVar, Object obj, m mVar, x5.c cVar, c.b bVar, b.a aVar, qd.d<? super h> dVar) {
            super(2, dVar);
            this.f10602c = hVar;
            this.f10603d = obj;
            this.f10604e = mVar;
            this.f10605f = cVar;
            this.f10606g = bVar;
            this.f10607h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return a.this.new h(this.f10602c, this.f10603d, this.f10604e, this.f10605f, this.f10606g, this.f10607h, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super q> dVar) {
            return ((h) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10600a;
            if (i10 == 0) {
                u.b(obj);
                a aVar = a.this;
                j6.h hVar = this.f10602c;
                Object obj2 = this.f10603d;
                m mVar = this.f10604e;
                x5.c cVar = this.f10605f;
                this.f10600a = 1;
                obj = aVar.i(hVar, obj2, mVar, cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            b bVar = (b) obj;
            return new q(bVar.e(), this.f10602c, bVar.c(), a.this.f10548d.h(this.f10606g, this.f10602c, bVar) ? this.f10606g : null, bVar.d(), bVar.f(), o6.j.u(this.f10607h));
        }
    }

    @sd.d(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
    static final class i extends sd.j implements zd.p<n0, qd.d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f10613f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f10615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m f10616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<m6.a> f10617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ x5.c f10618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ j6.h f10619l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(b bVar, m mVar, List<? extends m6.a> list, x5.c cVar, j6.h hVar, qd.d<? super i> dVar) {
            super(2, dVar);
            this.f10615h = bVar;
            this.f10616i = mVar;
            this.f10617j = list;
            this.f10618k = cVar;
            this.f10619l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            i iVar = a.this.new i(this.f10615h, this.f10616i, this.f10617j, this.f10618k, this.f10619l, dVar);
            iVar.f10613f = obj;
            return iVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super b> dVar) {
            return ((i) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007e -> B:13:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f10612e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                int r2 = r0.f10611d
                int r4 = r0.f10610c
                java.lang.Object r5 = r0.f10609b
                j6.m r5 = (j6.m) r5
                java.lang.Object r6 = r0.f10608a
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.f10613f
                le.n0 r7 = (le.n0) r7
                md.u.b(r20)
                r9 = r0
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r20
                goto L81
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2f:
                md.u.b(r20)
                java.lang.Object r2 = r0.f10613f
                le.n0 r2 = (le.n0) r2
                e6.a r4 = e6.a.this
                e6.a$b r5 = r0.f10615h
                android.graphics.drawable.Drawable r5 = r5.e()
                j6.m r6 = r0.f10616i
                java.util.List<m6.a> r7 = r0.f10617j
                android.graphics.Bitmap r4 = e6.a.b(r4, r5, r6, r7)
                x5.c r5 = r0.f10618k
                j6.h r6 = r0.f10619l
                r5.f(r6, r4)
                java.util.List<m6.a> r5 = r0.f10617j
                j6.m r6 = r0.f10616i
                r7 = 0
                int r8 = r5.size()
                r9 = r0
                r17 = r8
                r8 = r2
                r2 = r17
                r18 = r5
                r5 = r4
                r4 = r7
                r7 = r18
            L62:
                if (r4 >= r2) goto L88
                java.lang.Object r10 = r7.get(r4)
                m6.a r10 = (m6.a) r10
                k6.i r11 = r6.n()
                r9.f10613f = r8
                r9.f10608a = r7
                r9.f10609b = r6
                r9.f10610c = r4
                r9.f10611d = r2
                r9.f10612e = r3
                java.lang.Object r5 = r10.b(r5, r11, r9)
                if (r5 != r1) goto L81
                return r1
            L81:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                le.o0.f(r8)
                int r4 = r4 + r3
                goto L62
            L88:
                x5.c r1 = r9.f10618k
                j6.h r2 = r9.f10619l
                r1.p(r2, r5)
                e6.a$b r10 = r9.f10615h
                j6.h r1 = r9.f10619l
                android.content.Context r1 = r1.l()
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
                r11.<init>(r1, r5)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 14
                r16 = 0
                e6.a$b r1 = e6.a.b.b(r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e6.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(x5.e eVar, p pVar, r rVar) {
        this.f10545a = eVar;
        this.f10546b = pVar;
        this.f10547c = rVar;
        this.f10548d = new h6.d(eVar, pVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap g(Drawable drawable, m mVar, List<? extends m6.a> list) {
        r rVar;
        String str;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configC = o6.a.c(bitmap);
            if (nd.p.F(o6.j.p(), configC)) {
                return bitmap;
            }
            rVar = this.f10547c;
            if (rVar != null && rVar.a() <= 4) {
                str = "Converting bitmap with config " + configC + " to apply transformations: " + list + com.amazon.a.a.o.c.a.b.f7490a;
                rVar.b("EngineInterceptor", 4, str, null);
            }
        } else {
            rVar = this.f10547c;
            if (rVar != null && rVar.a() <= 4) {
                str = "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + com.amazon.a.a.o.c.a.b.f7490a;
                rVar.b("EngineInterceptor", 4, str, null);
            }
        }
        return l.f16390a.a(drawable, mVar.f(), mVar.n(), mVar.m(), mVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:21:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(d6.m r17, x5.b r18, j6.h r19, java.lang.Object r20, j6.m r21, x5.c r22, qd.d<? super e6.a.b> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.h(d6.m, x5.b, j6.h, java.lang.Object, j6.m, x5.c, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, x5.b] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, j6.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, x5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(j6.h r36, java.lang.Object r37, j6.m r38, x5.c r39, qd.d<? super e6.a.b> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.i(j6.h, java.lang.Object, j6.m, x5.c, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(x5.b r10, j6.h r11, java.lang.Object r12, j6.m r13, x5.c r14, qd.d<? super d6.h> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.j(x5.b, j6.h, java.lang.Object, j6.m, x5.c, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(e6.b.a r14, qd.d<? super j6.i> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof e6.a.g
            if (r0 == 0) goto L13
            r0 = r15
            e6.a$g r0 = (e6.a.g) r0
            int r1 = r0.f10599e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10599e = r1
            goto L18
        L13:
            e6.a$g r0 = new e6.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f10597c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10599e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f10596b
            e6.b$a r14 = (e6.b.a) r14
            java.lang.Object r0 = r0.f10595a
            e6.a r0 = (e6.a) r0
            md.u.b(r15)     // Catch: java.lang.Throwable -> L31
            goto L9b
        L31:
            r15 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            md.u.b(r15)
            j6.h r6 = r14.b()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> L9c
            k6.i r2 = r14.a()     // Catch: java.lang.Throwable -> L9c
            x5.c r9 = o6.j.h(r14)     // Catch: java.lang.Throwable -> L9c
            j6.p r4 = r13.f10546b     // Catch: java.lang.Throwable -> L9c
            j6.m r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> L9c
            k6.h r4 = r8.m()     // Catch: java.lang.Throwable -> L9c
            r9.l(r6, r15)     // Catch: java.lang.Throwable -> L9c
            x5.e r5 = r13.f10545a     // Catch: java.lang.Throwable -> L9c
            x5.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> L9c
            r9.k(r6, r7)     // Catch: java.lang.Throwable -> L9c
            h6.d r15 = r13.f10548d     // Catch: java.lang.Throwable -> L9c
            h6.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L77
            h6.d r15 = r13.f10548d     // Catch: java.lang.Throwable -> L9c
            h6.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto L78
        L77:
            r15 = 0
        L78:
            if (r15 == 0) goto L81
            h6.d r0 = r13.f10548d     // Catch: java.lang.Throwable -> L9c
            j6.q r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L9c
            return r14
        L81:
            le.j0 r15 = r6.v()     // Catch: java.lang.Throwable -> L9c
            e6.a$h r2 = new e6.a$h     // Catch: java.lang.Throwable -> L9c
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r0.f10595a = r13     // Catch: java.lang.Throwable -> L9c
            r0.f10596b = r14     // Catch: java.lang.Throwable -> L9c
            r0.f10599e = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = le.i.g(r15, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r15 != r1) goto L9b
            return r1
        L9b:
            return r15
        L9c:
            r15 = move-exception
            r0 = r13
        L9e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lad
            j6.p r0 = r0.f10546b
            j6.h r14 = r14.b()
            j6.f r14 = r0.b(r14, r15)
            return r14
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.a(e6.b$a, qd.d):java.lang.Object");
    }

    public final Object k(b bVar, j6.h hVar, m mVar, x5.c cVar, qd.d<? super b> dVar) {
        List<m6.a> listO = hVar.O();
        if (listO.isEmpty()) {
            return bVar;
        }
        if ((bVar.e() instanceof BitmapDrawable) || hVar.g()) {
            return le.i.g(hVar.N(), new i(bVar, mVar, listO, cVar, hVar, null), dVar);
        }
        r rVar = this.f10547c;
        if (rVar != null && rVar.a() <= 4) {
            rVar.b("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.e().getClass().getCanonicalName() + com.amazon.a.a.o.c.a.b.f7490a, null);
        }
        return bVar;
    }
}
