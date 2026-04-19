package m0;

import ae.s;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import c1.k;
import i2.d;
import i2.d0;
import i2.g0;
import i2.u;
import java.util.List;
import java.util.Map;
import l1.m0;
import md.i0;
import n2.t;
import t0.e2;
import t0.k1;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static final class a extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f15147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<d0, i0> f15148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15152h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m0 f15153i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f15154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15155k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, androidx.compose.ui.e eVar, g0 g0Var, zd.l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, m0 m0Var, int i13, int i14) {
            super(2);
            this.f15145a = str;
            this.f15146b = eVar;
            this.f15147c = g0Var;
            this.f15148d = lVar;
            this.f15149e = i10;
            this.f15150f = z10;
            this.f15151g = i11;
            this.f15152h = i12;
            this.f15153i = m0Var;
            this.f15154j = i13;
            this.f15155k = i14;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            b.b(this.f15145a, this.f15146b, this.f15147c, this.f15148d, this.f15149e, this.f15150f, this.f15151g, this.f15152h, this.f15153i, lVar, e2.a(this.f15154j | 1), this.f15155k);
        }
    }

    /* JADX INFO: renamed from: m0.b$b, reason: collision with other inner class name */
    static final class C0346b extends s implements zd.l<List<? extends k1.h>, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1<List<k1.h>> f15156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0346b(k1<List<k1.h>> k1Var) {
            super(1);
            this.f15156a = k1Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends k1.h> list) {
            invoke2((List<k1.h>) list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<k1.h> list) {
            this.f15156a.setValue(list);
        }
    }

    static final class c extends s implements zd.a<List<? extends k1.h>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1<List<k1.h>> f15157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1<List<k1.h>> k1Var) {
            super(0);
            this.f15157a = k1Var;
        }

        @Override // zd.a
        public final List<? extends k1.h> invoke() {
            return this.f15157a.getValue();
        }
    }

    static final class d extends s implements p<l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2.d f15158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f15160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.l<d0, i0> f15161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15165h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Map<String, m0.f> f15166i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f15167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15169l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(i2.d dVar, androidx.compose.ui.e eVar, g0 g0Var, zd.l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, Map<String, m0.f> map, m0 m0Var, int i13, int i14) {
            super(2);
            this.f15158a = dVar;
            this.f15159b = eVar;
            this.f15160c = g0Var;
            this.f15161d = lVar;
            this.f15162e = i10;
            this.f15163f = z10;
            this.f15164g = i11;
            this.f15165h = i12;
            this.f15166i = map;
            this.f15167j = m0Var;
            this.f15168k = i13;
            this.f15169l = i14;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            b.a(this.f15158a, this.f15159b, this.f15160c, this.f15161d, this.f15162e, this.f15163f, this.f15164g, this.f15165h, this.f15166i, this.f15167j, lVar, e2.a(this.f15168k | 1), this.f15169l);
        }
    }

    static final class e extends s implements zd.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.i f15170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0.i iVar) {
            super(0);
            this.f15170a = iVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f15170a.a());
        }
    }

    static final class f extends s implements zd.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.i f15171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o0.i iVar) {
            super(0);
            this.f15171a = iVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f15171a.a());
        }
    }

    public static final class g extends s implements zd.a<a2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f15172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(zd.a aVar) {
            super(0);
            this.f15172a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.g, java.lang.Object] */
        @Override // zd.a
        public final a2.g invoke() {
            return this.f15172a.invoke();
        }
    }

    public static final class h extends s implements zd.a<a2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f15173a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zd.a aVar) {
            super(0);
            this.f15173a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.g, java.lang.Object] */
        @Override // zd.a
        public final a2.g invoke() {
            return this.f15173a.invoke();
        }
    }

    static final class i extends s implements p<c1.l, Long, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.i f15174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(o0.i iVar) {
            super(2);
            this.f15174a = iVar;
        }

        public final Long a(c1.l lVar, long j10) {
            if (o0.j.b(this.f15174a, j10)) {
                return Long.valueOf(j10);
            }
            return null;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Long invoke(c1.l lVar, Long l10) {
            return a(lVar, l10.longValue());
        }
    }

    static final class j extends s implements zd.l<Long, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f15175a = new j();

        j() {
            super(1);
        }

        public final Long a(long j10) {
            return Long.valueOf(j10);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Long invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(i2.d r50, androidx.compose.ui.e r51, i2.g0 r52, zd.l<? super i2.d0, md.i0> r53, int r54, boolean r55, int r56, int r57, java.util.Map<java.lang.String, m0.f> r58, l1.m0 r59, t0.l r60, int r61, int r62) {
        /*
            Method dump skipped, instruction units count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.a(i2.d, androidx.compose.ui.e, i2.g0, zd.l, int, boolean, int, int, java.util.Map, l1.m0, t0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r43, androidx.compose.ui.e r44, i2.g0 r45, zd.l<? super i2.d0, md.i0> r46, int r47, boolean r48, int r49, int r50, l1.m0 r51, t0.l r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.b(java.lang.String, androidx.compose.ui.e, i2.g0, zd.l, int, boolean, int, int, l1.m0, t0.l, int, int):void");
    }

    private static final c1.j<Long, Long> c(o0.i iVar) {
        return k.a(new i(iVar), j.f15175a);
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, i2.d dVar, g0 g0Var, zd.l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, t.b bVar, List<d.b<u>> list, zd.l<? super List<k1.h>, i0> lVar2, n0.h hVar, m0 m0Var) {
        androidx.compose.ui.e selectableTextAnnotatedStringElement;
        androidx.compose.ui.e eVarF;
        if (hVar == null) {
            selectableTextAnnotatedStringElement = new TextAnnotatedStringElement(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, null, m0Var, null);
            eVarF = androidx.compose.ui.e.f2662a;
        } else {
            selectableTextAnnotatedStringElement = new SelectableTextAnnotatedStringElement(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, m0Var, null);
            eVarF = hVar.f();
        }
        return eVar.h(eVarF).h(selectableTextAnnotatedStringElement);
    }
}
