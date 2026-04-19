package e6;

import e6.b;
import j6.h;
import j6.j;
import java.util.List;
import k6.i;
import sd.d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f10620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f10623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f10624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x5.c f10625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10626g;

    @d(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10629c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10631e;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10629c = obj;
            this.f10631e |= Integer.MIN_VALUE;
            return c.this.h(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(h hVar, List<? extends b> list, int i10, h hVar2, i iVar, x5.c cVar, boolean z10) {
        this.f10620a = hVar;
        this.f10621b = list;
        this.f10622c = i10;
        this.f10623d = hVar2;
        this.f10624e = iVar;
        this.f10625f = cVar;
        this.f10626g = z10;
    }

    private final void c(h hVar, b bVar) {
        if (!(hVar.l() == this.f10620a.l())) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (!(hVar.m() != j.f14028a)) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (!(hVar.M() == this.f10620a.M())) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (!(hVar.z() == this.f10620a.z())) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.K() == this.f10620a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final c d(int i10, h hVar, i iVar) {
        return new c(this.f10620a, this.f10621b, i10, hVar, iVar, this.f10625f, this.f10626g);
    }

    static /* synthetic */ c e(c cVar, int i10, h hVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f10622c;
        }
        if ((i11 & 2) != 0) {
            hVar = cVar.b();
        }
        if ((i11 & 4) != 0) {
            iVar = cVar.a();
        }
        return cVar.d(i10, hVar, iVar);
    }

    @Override // e6.b.a
    public i a() {
        return this.f10624e;
    }

    @Override // e6.b.a
    public h b() {
        return this.f10623d;
    }

    public final x5.c f() {
        return this.f10625f;
    }

    public final boolean g() {
        return this.f10626g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(j6.h r12, qd.d<? super j6.i> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof e6.c.a
            if (r0 == 0) goto L13
            r0 = r13
            e6.c$a r0 = (e6.c.a) r0
            int r1 = r0.f10631e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10631e = r1
            goto L18
        L13:
            e6.c$a r0 = new e6.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f10629c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10631e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f10628b
            e6.b r12 = (e6.b) r12
            java.lang.Object r0 = r0.f10627a
            e6.c r0 = (e6.c) r0
            md.u.b(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            md.u.b(r13)
            int r13 = r11.f10622c
            if (r13 <= 0) goto L4c
            java.util.List<e6.b> r2 = r11.f10621b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            e6.b r13 = (e6.b) r13
            r11.c(r12, r13)
        L4c:
            java.util.List<e6.b> r13 = r11.f10621b
            int r2 = r11.f10622c
            java.lang.Object r13 = r13.get(r2)
            e6.b r13 = (e6.b) r13
            int r2 = r11.f10622c
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            e6.c r12 = e(r4, r5, r6, r7, r8, r9)
            r0.f10627a = r11
            r0.f10628b = r13
            r0.f10631e = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            j6.i r13 = (j6.i) r13
            j6.h r1 = r13.b()
            r0.c(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.c.h(j6.h, qd.d):java.lang.Object");
    }
}
