package u1;

import ae.s;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import k1.f;
import le.n0;
import md.x;
import z1.g;
import z1.h;
import z1.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e.c implements h, u1.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u1.a f21489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private u1.b f21490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g f21491p;

    @sd.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSmall, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "onPostFling-RZ2iAVY")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f21493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f21494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f21495d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f21497f;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21495d = obj;
            this.f21497f |= Integer.MIN_VALUE;
            return c.this.W0(0L, 0L, this);
        }
    }

    @sd.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless, R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "onPreFling-QWom1Mo")
    static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f21499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f21500c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21502e;

        b(qd.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21500c = obj;
            this.f21502e |= Integer.MIN_VALUE;
            return c.this.p1(0L, this);
        }
    }

    /* JADX INFO: renamed from: u1.c$c, reason: collision with other inner class name */
    static final class C0438c extends s implements zd.a<n0> {
        C0438c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return c.this.b2();
        }
    }

    public c(u1.a aVar, u1.b bVar) {
        this.f21489n = aVar;
        this.f21490o = bVar == null ? new u1.b() : bVar;
        this.f21491p = i.b(x.a(d.a(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0 b2() {
        n0 n0VarH;
        c cVarD2 = d2();
        if ((cVarD2 == null || (n0VarH = cVarD2.b2()) == null) && (n0VarH = this.f21490o.h()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return n0VarH;
    }

    private final u1.a c2() {
        if (H1()) {
            return (u1.a) p(d.a());
        }
        return null;
    }

    private final c d2() {
        if (H1()) {
            return (c) p(d.a());
        }
        return null;
    }

    private final void e2() {
        if (this.f21490o.f() == this) {
            this.f21490o.j(null);
        }
    }

    private final void f2() {
        this.f21490o.j(this);
        this.f21490o.i(new C0438c());
        this.f21490o.k(A1());
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        f2();
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        e2();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // u1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object W0(long r16, long r18, qd.d<? super w2.w> r20) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof u1.c.a
            if (r2 == 0) goto L16
            r2 = r1
            u1.c$a r2 = (u1.c.a) r2
            int r3 = r2.f21497f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f21497f = r3
            goto L1b
        L16:
            u1.c$a r2 = new u1.c$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f21495d
            java.lang.Object r9 = rd.b.e()
            int r3 = r2.f21497f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f21493b
            md.u.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f21494c
            long r5 = r2.f21493b
            java.lang.Object r7 = r2.f21492a
            u1.c r7 = (u1.c) r7
            md.u.b(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            md.u.b(r1)
            u1.a r3 = r0.f21489n
            r2.f21492a = r0
            r11 = r16
            r2.f21493b = r11
            r13 = r18
            r2.f21494c = r13
            r2.f21497f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.W0(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            w2.w r1 = (w2.w) r1
            long r4 = r1.o()
            u1.a r3 = r7.c2()
            if (r3 == 0) goto L94
            long r6 = w2.w.l(r11, r4)
            long r11 = w2.w.k(r13, r4)
            r1 = 0
            r2.f21492a = r1
            r2.f21493b = r4
            r2.f21497f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.W0(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            w2.w r1 = (w2.w) r1
            long r4 = r1.o()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            w2.w$a r1 = w2.w.f22437b
            long r4 = r1.a()
        L9b:
            long r1 = w2.w.l(r13, r4)
            w2.w r1 = w2.w.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.c.W0(long, long, qd.d):java.lang.Object");
    }

    @Override // u1.a
    public long m1(long j10, long j11, int i10) {
        long jM1 = this.f21489n.m1(j10, j11, i10);
        u1.a aVarC2 = c2();
        return f.t(jM1, aVarC2 != null ? aVarC2.m1(f.t(j10, jM1), f.s(j11, jM1), i10) : f.f14338b.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p1(long r9, qd.d<? super w2.w> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof u1.c.b
            if (r0 == 0) goto L13
            r0 = r11
            u1.c$b r0 = (u1.c.b) r0
            int r1 = r0.f21502e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21502e = r1
            goto L18
        L13:
            u1.c$b r0 = new u1.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f21500c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f21502e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f21499b
            md.u.b(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f21499b
            java.lang.Object r2 = r0.f21498a
            u1.c r2 = (u1.c) r2
            md.u.b(r11)
            goto L57
        L40:
            md.u.b(r11)
            u1.a r11 = r8.c2()
            if (r11 == 0) goto L5e
            r0.f21498a = r8
            r0.f21499b = r9
            r0.f21502e = r4
            java.lang.Object r11 = r11.p1(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            w2.w r11 = (w2.w) r11
            long r4 = r11.o()
            goto L65
        L5e:
            w2.w$a r11 = w2.w.f22437b
            long r4 = r11.a()
            r2 = r8
        L65:
            r6 = r9
            r9 = r4
            r4 = r6
            u1.a r11 = r2.f21489n
            long r4 = w2.w.k(r4, r9)
            r2 = 0
            r0.f21498a = r2
            r0.f21499b = r9
            r0.f21502e = r3
            java.lang.Object r11 = r11.p1(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            w2.w r11 = (w2.w) r11
            long r0 = r11.o()
            long r9 = w2.w.l(r9, r0)
            w2.w r9 = w2.w.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.c.p1(long, qd.d):java.lang.Object");
    }

    @Override // z1.h
    public g u0() {
        return this.f21491p;
    }

    @Override // u1.a
    public long x0(long j10, int i10) {
        u1.a aVarC2 = c2();
        long jX0 = aVarC2 != null ? aVarC2.x0(j10, i10) : f.f14338b.c();
        return f.t(jX0, this.f21489n.x0(f.s(j10, jX0), i10));
    }
}
