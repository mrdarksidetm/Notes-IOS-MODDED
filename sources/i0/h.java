package i0;

import h0.b;
import java.util.ArrayList;
import java.util.List;
import t0.e2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0.a f12084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f12086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0.y f12087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.m f12089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b.e f12090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0.p f12091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f12092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ zd.l<b0, md.i0> f12093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f12094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12095l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i0.a aVar, androidx.compose.ui.e eVar, h0 h0Var, h0.y yVar, boolean z10, b.m mVar, b.e eVar2, e0.p pVar, boolean z11, zd.l<? super b0, md.i0> lVar, int i10, int i11) {
            super(2);
            this.f12084a = aVar;
            this.f12085b = eVar;
            this.f12086c = h0Var;
            this.f12087d = yVar;
            this.f12088e = z10;
            this.f12089f = mVar;
            this.f12090g = eVar2;
            this.f12091h = pVar;
            this.f12092i = z11;
            this.f12093j = lVar;
            this.f12094k = i10;
            this.f12095l = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h.a(this.f12084a, this.f12085b, this.f12086c, this.f12087d, this.f12088e, this.f12089f, this.f12090g, this.f12091h, this.f12092i, this.f12093j, lVar, e2.a(this.f12094k | 1), this.f12095l);
        }
    }

    static final class b extends ae.s implements zd.p<w2.d, w2.b, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0.y f12096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0.a f12097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.e f12098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0.y yVar, i0.a aVar, b.e eVar) {
            super(2);
            this.f12096a = yVar;
            this.f12097b = aVar;
            this.f12098c = eVar;
        }

        public final d0 a(w2.d dVar, long j10) {
            if (!(w2.b.n(j10) != Integer.MAX_VALUE)) {
                throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
            }
            h0.y yVar = this.f12096a;
            w2.r rVar = w2.r.Ltr;
            int iN = w2.b.n(j10) - dVar.a1(w2.h.m(androidx.compose.foundation.layout.m.g(yVar, rVar) + androidx.compose.foundation.layout.m.f(this.f12096a, rVar)));
            i0.a aVar = this.f12097b;
            b.e eVar = this.f12098c;
            int[] iArrB0 = nd.c0.B0(aVar.a(dVar, iN, dVar.a1(eVar.a())));
            int[] iArr = new int[iArrB0.length];
            eVar.c(dVar, iN, iArrB0, rVar, iArr);
            return new d0(iArrB0, iArr);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ d0 invoke(w2.d dVar, w2.b bVar) {
            return a(dVar, bVar.t());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(i0.a r28, androidx.compose.ui.e r29, i0.h0 r30, h0.y r31, boolean r32, h0.b.m r33, h0.b.e r34, e0.p r35, boolean r36, zd.l<? super i0.b0, md.i0> r37, t0.l r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a(i0.a, androidx.compose.ui.e, i0.h0, h0.y, boolean, h0.b$m, h0.b$e, e0.p, boolean, zd.l, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> c(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    private static final e0 d(i0.a aVar, b.e eVar, h0.y yVar, t0.l lVar, int i10) {
        lVar.e(1632454918);
        if (t0.o.I()) {
            t0.o.U(1632454918, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        lVar.e(1618982084);
        boolean zN = lVar.N(aVar) | lVar.N(eVar) | lVar.N(yVar);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new c(new b(yVar, aVar, eVar));
            lVar.E(objF);
        }
        lVar.K();
        e0 e0Var = (e0) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return e0Var;
    }
}
