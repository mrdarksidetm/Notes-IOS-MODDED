package j0;

import j0.d;
import j0.n;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.w<Object> f13733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f13734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13735d;

    static final class a extends ae.s implements zd.l<d.a<? extends n.a>, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z.t<Object> f13738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f13739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, z.t<Object> tVar, k0 k0Var) {
            super(1);
            this.f13736a = i10;
            this.f13737b = i11;
            this.f13738c = tVar;
            this.f13739d = k0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(j0.d.a<? extends j0.n.a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                j0.n$a r0 = (j0.n.a) r0
                zd.l r0 = r0.getKey()
                int r1 = r6.f13736a
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f13737b
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = j0.i0.a(r1)
            L3d:
                z.t<java.lang.Object> r4 = r6.f13738c
                r4.q(r3, r1)
                j0.k0 r4 = r6.f13739d
                java.lang.Object[] r4 = j0.k0.c(r4)
                j0.k0 r5 = r6.f13739d
                int r5 = j0.k0.d(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.k0.a.a(j0.d$a):void");
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(d.a<? extends n.a> aVar) {
            a(aVar);
            return md.i0.f15558a;
        }
    }

    public k0(ge.i iVar, n<?> nVar) {
        d<Interval> dVarD = nVar.d();
        int iL = iVar.l();
        if (!(iL >= 0)) {
            throw new IllegalStateException("negative nearestRange.first".toString());
        }
        int iMin = Math.min(iVar.n(), dVarD.a() - 1);
        if (iMin < iL) {
            this.f13733b = z.x.a();
            this.f13734c = new Object[0];
            this.f13735d = 0;
        } else {
            int i10 = (iMin - iL) + 1;
            this.f13734c = new Object[i10];
            this.f13735d = iL;
            z.t tVar = new z.t(i10);
            dVarD.b(iL, iMin, new a(iL, iMin, tVar, this));
            this.f13733b = tVar;
        }
    }

    @Override // j0.t
    public Object a(int i10) {
        Object[] objArr = this.f13734c;
        int i11 = i10 - this.f13735d;
        if (i11 < 0 || i11 > nd.p.Q(objArr)) {
            return null;
        }
        return objArr[i11];
    }

    @Override // j0.t
    public int b(Object obj) {
        z.w<Object> wVar = this.f13733b;
        int iA = wVar.a(obj);
        if (iA >= 0) {
            return wVar.f24108c[iA];
        }
        return -1;
    }
}
