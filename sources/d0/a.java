package d0;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import b2.u0;
import b2.w0;
import java.util.List;
import t0.i1;
import t0.w2;
import v1.p0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f9128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k1.f f9129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EdgeEffect f9130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EdgeEffect f9131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EdgeEffect f9132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EdgeEffect f9133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<EdgeEffect> f9134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EdgeEffect f9135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EdgeEffect f9136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EdgeEffect f9137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final EdgeEffect f9138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i1 f9140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zd.l<w2.p, md.i0> f9144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v1.a0 f9145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.compose.ui.e f9146s;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {223, 248}, m = "applyToFling-BMRW4eQ")
    static final class C0216a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f9148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9149c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9151e;

        C0216a(qd.d<? super C0216a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9149c = obj;
            this.f9151e |= Integer.MIN_VALUE;
            return a.this.b(0L, null, this);
        }
    }

    @sd.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {320}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<v1.k0, qd.d<? super md.i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9153b;

        /* JADX INFO: renamed from: d0.a$b$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {321, 325}, m = "invokeSuspend")
        static final class C0217a extends sd.i implements zd.p<v1.c, qd.d<? super md.i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9155a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f9156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f9157c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0217a(a aVar, qd.d<? super C0217a> dVar) {
                super(2, dVar);
                this.f9157c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
                C0217a c0217a = new C0217a(this.f9157c, dVar);
                c0217a.f9156b = obj;
                return c0217a;
            }

            @Override // zd.p
            public final Object invoke(v1.c cVar, qd.d<? super md.i0> dVar) {
                return ((C0217a) create(cVar, dVar)).invokeSuspend(md.i0.f15558a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:18:0x0070). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 247
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: d0.a.b.C0217a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(qd.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f9153b = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(v1.k0 k0Var, qd.d<? super md.i0> dVar) {
            return ((b) create(k0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f9152a;
            if (i10 == 0) {
                md.u.b(obj);
                v1.k0 k0Var = (v1.k0) this.f9153b;
                C0217a c0217a = new C0217a(a.this, null);
                this.f9152a = 1;
                if (e0.q.c(k0Var, c0217a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.l<w2.p, md.i0> {
        c() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w2.p pVar) {
            m288invokeozmzZPI(pVar.j());
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final void m288invokeozmzZPI(long j10) {
            boolean z10 = !k1.l.f(w2.q.c(j10), a.this.f9143p);
            a.this.f9143p = w2.q.c(j10);
            if (z10) {
                a.this.f9130c.setSize(w2.p.g(j10), w2.p.f(j10));
                a.this.f9131d.setSize(w2.p.g(j10), w2.p.f(j10));
                a.this.f9132e.setSize(w2.p.f(j10), w2.p.g(j10));
                a.this.f9133f.setSize(w2.p.f(j10), w2.p.g(j10));
                a.this.f9135h.setSize(w2.p.g(j10), w2.p.f(j10));
                a.this.f9136i.setSize(w2.p.g(j10), w2.p.f(j10));
                a.this.f9137j.setSize(w2.p.f(j10), w2.p.g(j10));
                a.this.f9138k.setSize(w2.p.f(j10), w2.p.g(j10));
            }
            if (z10) {
                a.this.A();
                a.this.t();
            }
        }
    }

    public static final class d extends ae.s implements zd.l<w0, md.i0> {
        public d() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(w0 w0Var) {
            invoke2(w0Var);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w0 w0Var) {
            w0Var.b("overscroll");
            w0Var.c(a.this);
        }
    }

    public a(Context context, h0 h0Var) {
        this.f9128a = h0Var;
        s sVar = s.f9293a;
        EdgeEffect edgeEffectA = sVar.a(context, null);
        this.f9130c = edgeEffectA;
        EdgeEffect edgeEffectA2 = sVar.a(context, null);
        this.f9131d = edgeEffectA2;
        EdgeEffect edgeEffectA3 = sVar.a(context, null);
        this.f9132e = edgeEffectA3;
        EdgeEffect edgeEffectA4 = sVar.a(context, null);
        this.f9133f = edgeEffectA4;
        List<EdgeEffect> listP = nd.u.p(edgeEffectA3, edgeEffectA, edgeEffectA4, edgeEffectA2);
        this.f9134g = listP;
        this.f9135h = sVar.a(context, null);
        this.f9136i = sVar.a(context, null);
        this.f9137j = sVar.a(context, null);
        this.f9138k = sVar.a(context, null);
        int size = listP.size();
        for (int i10 = 0; i10 < size; i10++) {
            listP.get(i10).setColor(l1.l0.i(this.f9128a.b()));
        }
        this.f9139l = -1;
        this.f9140m = w2.a(0);
        this.f9141n = true;
        this.f9143p = k1.l.f14359b.b();
        c cVar = new c();
        this.f9144q = cVar;
        this.f9146s = y1.n0.a(p0.d(androidx.compose.ui.e.f2662a.h(d0.b.f9166a), md.i0.f15558a, new b(null)), cVar).h(new r(this, u0.c() ? new d() : u0.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (this.f9141n && this.f9139l == z()) {
            G(z() + 1);
        }
    }

    private final float B(long j10, long j11) {
        float fO = k1.f.o(j11) / k1.l.i(this.f9143p);
        float fP = k1.f.p(j10) / k1.l.g(this.f9143p);
        s sVar = s.f9293a;
        return !(sVar.b(this.f9131d) == 0.0f) ? k1.f.p(j10) : (-sVar.d(this.f9131d, -fP, 1 - fO)) * k1.l.g(this.f9143p);
    }

    private final float C(long j10, long j11) {
        float fP = k1.f.p(j11) / k1.l.g(this.f9143p);
        float fO = k1.f.o(j10) / k1.l.i(this.f9143p);
        s sVar = s.f9293a;
        return !(sVar.b(this.f9132e) == 0.0f) ? k1.f.o(j10) : sVar.d(this.f9132e, fO, 1 - fP) * k1.l.i(this.f9143p);
    }

    private final float D(long j10, long j11) {
        float fP = k1.f.p(j11) / k1.l.g(this.f9143p);
        float fO = k1.f.o(j10) / k1.l.i(this.f9143p);
        s sVar = s.f9293a;
        return !((sVar.b(this.f9133f) > 0.0f ? 1 : (sVar.b(this.f9133f) == 0.0f ? 0 : -1)) == 0) ? k1.f.o(j10) : (-sVar.d(this.f9133f, -fO, fP)) * k1.l.i(this.f9143p);
    }

    private final float E(long j10, long j11) {
        float fO = k1.f.o(j11) / k1.l.i(this.f9143p);
        float fP = k1.f.p(j10) / k1.l.g(this.f9143p);
        s sVar = s.f9293a;
        return !((sVar.b(this.f9130c) > 0.0f ? 1 : (sVar.b(this.f9130c) == 0.0f ? 0 : -1)) == 0) ? k1.f.p(j10) : sVar.d(this.f9130c, fP, fO) * k1.l.g(this.f9143p);
    }

    private final boolean F(long j10) {
        boolean zIsFinished;
        if (this.f9132e.isFinished() || k1.f.o(j10) >= 0.0f) {
            zIsFinished = false;
        } else {
            s.f9293a.e(this.f9132e, k1.f.o(j10));
            zIsFinished = this.f9132e.isFinished();
        }
        if (!this.f9133f.isFinished() && k1.f.o(j10) > 0.0f) {
            s.f9293a.e(this.f9133f, k1.f.o(j10));
            zIsFinished = zIsFinished || this.f9133f.isFinished();
        }
        if (!this.f9130c.isFinished() && k1.f.p(j10) < 0.0f) {
            s.f9293a.e(this.f9130c, k1.f.p(j10));
            zIsFinished = zIsFinished || this.f9130c.isFinished();
        }
        if (this.f9131d.isFinished() || k1.f.p(j10) <= 0.0f) {
            return zIsFinished;
        }
        s.f9293a.e(this.f9131d, k1.f.p(j10));
        return zIsFinished || this.f9131d.isFinished();
    }

    private final void G(int i10) {
        this.f9140m.k(i10);
    }

    private final boolean H() {
        boolean z10;
        long jB = k1.m.b(this.f9143p);
        s sVar = s.f9293a;
        if (sVar.b(this.f9132e) == 0.0f) {
            z10 = false;
        } else {
            C(k1.f.f14338b.c(), jB);
            z10 = true;
        }
        if (!(sVar.b(this.f9133f) == 0.0f)) {
            D(k1.f.f14338b.c(), jB);
            z10 = true;
        }
        if (!(sVar.b(this.f9130c) == 0.0f)) {
            E(k1.f.f14338b.c(), jB);
            z10 = true;
        }
        if (sVar.b(this.f9131d) == 0.0f) {
            return z10;
        }
        B(k1.f.f14338b.c(), jB);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        List<EdgeEffect> list = this.f9134g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            A();
        }
    }

    private final boolean u(n1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-k1.l.i(this.f9143p), (-k1.l.g(this.f9143p)) + fVar.G0(this.f9128a.a().a()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean v(n1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-k1.l.g(this.f9143p), fVar.G0(this.f9128a.a().d(fVar.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean x(n1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iD = ce.c.d(k1.l.i(this.f9143p));
        float fB = this.f9128a.a().b(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iD) + fVar.G0(fB));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean y(n1.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, fVar.G0(this.f9128a.a().c()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final int z() {
        return this.f9140m.e();
    }

    @Override // d0.j0
    public androidx.compose.ui.e a() {
        return this.f9146s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    @Override // d0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(long r12, zd.p<? super w2.w, ? super qd.d<? super w2.w>, ? extends java.lang.Object> r14, qd.d<? super md.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.b(long, zd.p, qd.d):java.lang.Object");
    }

    @Override // d0.j0
    public boolean c() {
        List<EdgeEffect> list = this.f9134g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(s.f9293a.b(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    @Override // d0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d(long r18, int r20, zd.l<? super k1.f, k1.f> r21) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.d(long, int, zd.l):long");
    }

    public final void w(n1.f fVar) {
        boolean zV;
        if (k1.l.k(this.f9143p)) {
            return;
        }
        l1.b0 b0VarD = fVar.M0().d();
        this.f9139l = z();
        Canvas canvasD = l1.c.d(b0VarD);
        s sVar = s.f9293a;
        boolean z10 = true;
        if (!(sVar.b(this.f9137j) == 0.0f)) {
            x(fVar, this.f9137j, canvasD);
            this.f9137j.finish();
        }
        if (this.f9132e.isFinished()) {
            zV = false;
        } else {
            zV = v(fVar, this.f9132e, canvasD);
            sVar.d(this.f9137j, sVar.b(this.f9132e), 0.0f);
        }
        if (!(sVar.b(this.f9135h) == 0.0f)) {
            u(fVar, this.f9135h, canvasD);
            this.f9135h.finish();
        }
        if (!this.f9130c.isFinished()) {
            zV = y(fVar, this.f9130c, canvasD) || zV;
            sVar.d(this.f9135h, sVar.b(this.f9130c), 0.0f);
        }
        if (!(sVar.b(this.f9138k) == 0.0f)) {
            v(fVar, this.f9138k, canvasD);
            this.f9138k.finish();
        }
        if (!this.f9133f.isFinished()) {
            zV = x(fVar, this.f9133f, canvasD) || zV;
            sVar.d(this.f9138k, sVar.b(this.f9133f), 0.0f);
        }
        if (!(sVar.b(this.f9136i) == 0.0f)) {
            y(fVar, this.f9136i, canvasD);
            this.f9136i.finish();
        }
        if (!this.f9131d.isFinished()) {
            if (!u(fVar, this.f9131d, canvasD) && !zV) {
                z10 = false;
            }
            sVar.d(this.f9136i, sVar.b(this.f9131d), 0.0f);
            zV = z10;
        }
        if (zV) {
            A();
        }
    }
}
