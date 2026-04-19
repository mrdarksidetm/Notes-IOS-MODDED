package h0;

import com.google.android.gms.common.api.a;
import h0.b;
import java.util.List;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f11646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.e f11647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.m f11648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f11650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f11651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<y1.d0> f11652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y1.t0[] f11653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0[] f11654i;

    /* JADX WARN: Multi-variable type inference failed */
    private d0(v vVar, b.e eVar, b.m mVar, float f10, i0 i0Var, k kVar, List<? extends y1.d0> list, y1.t0[] t0VarArr) {
        this.f11646a = vVar;
        this.f11647b = eVar;
        this.f11648c = mVar;
        this.f11649d = f10;
        this.f11650e = i0Var;
        this.f11651f = kVar;
        this.f11652g = list;
        this.f11653h = t0VarArr;
        int size = list.size();
        e0[] e0VarArr = new e0[size];
        for (int i10 = 0; i10 < size; i10++) {
            e0VarArr[i10] = a0.l(this.f11652g.get(i10));
        }
        this.f11654i = e0VarArr;
    }

    public /* synthetic */ d0(v vVar, b.e eVar, b.m mVar, float f10, i0 i0Var, k kVar, List list, y1.t0[] t0VarArr, ae.j jVar) {
        this(vVar, eVar, mVar, f10, i0Var, kVar, list, t0VarArr);
    }

    private final int b(y1.t0 t0Var, e0 e0Var, int i10, w2.r rVar, int i11) {
        k kVarA;
        if (e0Var == null || (kVarA = e0Var.a()) == null) {
            kVarA = this.f11651f;
        }
        int iA = i10 - a(t0Var);
        if (this.f11646a == v.Horizontal) {
            rVar = w2.r.Ltr;
        }
        return kVarA.a(iA, rVar, t0Var, i11);
    }

    private final int[] c(int i10, int[] iArr, int[] iArr2, y1.g0 g0Var) {
        if (this.f11646a == v.Vertical) {
            b.m mVar = this.f11648c;
            if (mVar == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
            mVar.b(g0Var, i10, iArr, iArr2);
        } else {
            b.e eVar = this.f11647b;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
            eVar.c(g0Var, i10, iArr, g0Var.getLayoutDirection(), iArr2);
        }
        return iArr2;
    }

    public final int a(y1.t0 t0Var) {
        return this.f11646a == v.Horizontal ? t0Var.d0() : t0Var.q0();
    }

    public final int d(y1.t0 t0Var) {
        return this.f11646a == v.Horizontal ? t0Var.q0() : t0Var.d0();
    }

    public final b0 e(y1.g0 g0Var, long j10, int i10, int i11) throws Throwable {
        int i12;
        String str;
        String str2;
        float f10;
        String str3;
        String str4;
        String str5;
        long j11;
        String str6;
        String str7;
        String str8;
        int iMax;
        d0 d0Var;
        int iM;
        long j12;
        String str9;
        long j13;
        String str10;
        long j14;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i13;
        String str17;
        float f11;
        int i14;
        int i15;
        d0 d0Var2;
        int iMax2;
        int iMax3;
        long j15;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        long j16;
        int iE;
        d0 d0Var3 = this;
        int i20 = i11;
        long jC = x.c(j10, d0Var3.f11646a);
        long jA1 = g0Var.a1(d0Var3.f11649d);
        int i21 = i20 - i10;
        int i22 = i10;
        float f13 = 0.0f;
        long jD = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (i22 >= i20) {
                break;
            }
            y1.d0 d0Var4 = d0Var3.f11652g.get(i22);
            e0 e0Var = d0Var3.f11654i[i22];
            float fM = a0.m(e0Var);
            if (fM > 0.0f) {
                f12 = f13 + fM;
                i16 = i23 + 1;
                i17 = i22;
            } else {
                int iN = w2.b.n(jC);
                y1.t0 t0VarI = d0Var3.f11653h[i22];
                if (t0VarI == null) {
                    float f14 = f13;
                    int i26 = i23;
                    if (iN == Integer.MAX_VALUE) {
                        i19 = iN;
                        iE = a.e.API_PRIORITY_OTHER;
                        j16 = 0;
                    } else {
                        i19 = iN;
                        j16 = 0;
                        iE = (int) ge.o.e(((long) iN) - jD, 0L);
                    }
                    j15 = jD;
                    f12 = f14;
                    i16 = i26;
                    i17 = i22;
                    i18 = i19;
                    t0VarI = d0Var4.I(x.f(x.e(jC, 0, iE, 0, 0, 8, null), d0Var3.f11646a));
                } else {
                    j15 = jD;
                    f12 = f13;
                    i16 = i23;
                    i17 = i22;
                    i18 = iN;
                }
                long j17 = j15;
                int iMin = Math.min((int) jA1, (int) ge.o.e((((long) i18) - j17) - ((long) d0Var3.d(t0VarI)), 0L));
                jD = ((long) (d0Var3.d(t0VarI) + iMin)) + j17;
                int iMax4 = Math.max(i25, d0Var3.a(t0VarI));
                if (!z10 && !a0.q(e0Var)) {
                    z11 = false;
                }
                d0Var3.f11653h[i17] = t0VarI;
                i24 = iMin;
                i25 = iMax4;
                z10 = z11;
            }
            i22 = i17 + 1;
            f13 = f12;
            i23 = i16;
        }
        long j18 = jD;
        float f15 = f13;
        int i27 = i23;
        if (i27 == 0) {
            j12 = j18 - ((long) i24);
            d0Var = d0Var3;
            i12 = i21;
            iMax = i25;
            iM = 0;
        } else {
            float f16 = f15;
            int iP = (f16 <= 0.0f || w2.b.n(jC) == Integer.MAX_VALUE) ? w2.b.p(jC) : w2.b.n(jC);
            long j19 = ((long) (i27 - 1)) * jA1;
            long jE = ge.o.e((((long) iP) - j18) - j19, 0L);
            float f17 = f16 > 0.0f ? jE / f16 : 0.0f;
            int i28 = i10;
            long jD2 = jE;
            while (true) {
                i12 = i21;
                str = "weightedSize ";
                str2 = "weightUnitSpace ";
                f10 = f16;
                str3 = "fixedSpace ";
                str4 = "totalWeight ";
                str5 = "weightChildrenCount ";
                j11 = jE;
                str6 = "arrangementSpacingPx ";
                str7 = "targetSpace ";
                str8 = "remainingToTarget ";
                if (i28 >= i20) {
                    break;
                }
                float fM2 = a0.m(d0Var3.f11654i[i28]);
                float f18 = f17 * fM2;
                try {
                    jD2 -= (long) ce.c.d(f18);
                    i28++;
                    d0Var3 = this;
                    i21 = i12;
                    i20 = i11;
                    jE = j11;
                    f16 = f10;
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + w2.b.n(jC) + "mainAxisMin " + w2.b.p(jC) + "targetSpace " + iP + "arrangementSpacingPx " + jA1 + "weightChildrenCount " + i27 + "fixedSpace " + j18 + "arrangementSpacingTotal " + j19 + str8 + j11 + str4 + f10 + str2 + f17 + "itemWeight " + fM2 + str + f18).initCause(e10);
                }
            }
            long j20 = j19;
            long j21 = j11;
            long j22 = j18;
            String str18 = "arrangementSpacingTotal ";
            long j23 = jA1;
            int i29 = i10;
            int i30 = i11;
            iMax = i25;
            int iD = 0;
            while (i29 < i30) {
                String str19 = str3;
                if (this.f11653h[i29] == null) {
                    y1.d0 d0Var5 = this.f11652g.get(i29);
                    int i31 = i27;
                    e0 e0Var2 = this.f11654i[i29];
                    String str20 = str5;
                    float fM3 = a0.m(e0Var2);
                    if (!(fM3 > 0.0f)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    long j24 = j23;
                    int iB = ce.c.b(jD2);
                    String str21 = str6;
                    String str22 = str7;
                    jD2 -= (long) iB;
                    float f19 = f17 * fM3;
                    int iMax5 = Math.max(0, ce.c.d(f19) + iB);
                    try {
                        if (!a0.k(e0Var2) || iMax5 == Integer.MAX_VALUE) {
                            i14 = iB;
                            i15 = 0;
                        } else {
                            i15 = iMax5;
                            i14 = iB;
                        }
                        try {
                            f11 = f19;
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            f11 = f19;
                        }
                        try {
                            y1.t0 t0VarI2 = d0Var5.I(x.f(x.a(i15, iMax5, 0, w2.b.m(jC)), this.f11646a));
                            iD += d(t0VarI2);
                            iMax = Math.max(iMax, a(t0VarI2));
                            boolean z12 = z10 || a0.q(e0Var2);
                            this.f11653h[i29] = t0VarI2;
                            z10 = z12;
                            str10 = str22;
                            str13 = str;
                            str15 = str4;
                            j14 = j22;
                            str9 = str21;
                            j23 = j24;
                            str12 = str19;
                            str17 = str18;
                            str11 = str20;
                            str14 = str2;
                            str16 = str8;
                            j13 = j21;
                            i13 = i31;
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + w2.b.n(jC) + "mainAxisMin " + w2.b.p(jC) + str22 + iP + str21 + j24 + str20 + i31 + str19 + j22 + str18 + j20 + str8 + j21 + str4 + f10 + str2 + f17 + "weight " + fM3 + str + f11 + "remainderUnit " + i14 + "childMainAxisSize " + iMax5).initCause(e);
                        }
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        f11 = f19;
                        i14 = iB;
                    }
                } else {
                    str9 = str6;
                    j13 = j21;
                    int i32 = i27;
                    str10 = str7;
                    j14 = j22;
                    str11 = str5;
                    str12 = str19;
                    str13 = str;
                    str14 = str2;
                    str15 = str4;
                    str16 = str8;
                    i13 = i32;
                    str17 = str18;
                }
                i29++;
                i30 = i11;
                j20 = j20;
                j21 = j13;
                str18 = str17;
                str4 = str15;
                str = str13;
                str5 = str11;
                long j25 = j14;
                str7 = str10;
                str6 = str9;
                str3 = str12;
                i27 = i13;
                j22 = j25;
                str8 = str16;
                str2 = str14;
            }
            d0Var = this;
            long j26 = j22;
            iM = (int) ge.o.m(((long) iD) + j20, 0L, ((long) w2.b.n(jC)) - j26);
            j12 = j26;
        }
        if (z10) {
            d0Var2 = d0Var;
            iMax2 = 0;
            iMax3 = 0;
            for (int i33 = i10; i33 < i11; i33++) {
                y1.t0 t0Var = d0Var2.f11653h[i33];
                ae.r.c(t0Var);
                k kVarJ = a0.j(d0Var2.f11654i[i33]);
                Integer numB = kVarJ != null ? kVarJ.b(t0Var) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = 0;
                    }
                    iMax2 = Math.max(iMax2, iIntValue);
                    int iA = d0Var2.a(t0Var);
                    int iIntValue2 = numB.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = d0Var2.a(t0Var);
                    }
                    iMax3 = Math.max(iMax3, iA - iIntValue2);
                }
            }
        } else {
            d0Var2 = d0Var;
            iMax2 = 0;
            iMax3 = 0;
        }
        int iMax6 = Math.max((int) ge.o.e(j12 + ((long) iM), 0L), w2.b.p(jC));
        int iMax7 = (w2.b.m(jC) == Integer.MAX_VALUE || d0Var2.f11650e != i0.Expand) ? Math.max(iMax, Math.max(w2.b.o(jC), iMax3 + iMax2)) : w2.b.m(jC);
        int i34 = i12;
        int[] iArr = new int[i34];
        for (int i35 = 0; i35 < i34; i35++) {
            iArr[i35] = 0;
        }
        int[] iArr2 = new int[i34];
        for (int i36 = 0; i36 < i34; i36++) {
            y1.t0 t0Var2 = d0Var2.f11653h[i36 + i10];
            ae.r.c(t0Var2);
            iArr2[i36] = d0Var2.d(t0Var2);
        }
        return new b0(iMax7, iMax6, i10, i11, iMax2, d0Var2.c(iMax6, iArr2, iArr, g0Var));
    }

    public final void f(t0.a aVar, b0 b0Var, int i10, w2.r rVar) {
        t0.a aVar2;
        y1.t0 t0Var;
        int i11;
        float f10;
        int i12;
        Object obj;
        int iC = b0Var.c();
        for (int iF = b0Var.f(); iF < iC; iF++) {
            y1.t0 t0Var2 = this.f11653h[iF];
            ae.r.c(t0Var2);
            int[] iArrD = b0Var.d();
            Object objF = this.f11652g.get(iF).f();
            int iB = b(t0Var2, objF instanceof e0 ? (e0) objF : null, b0Var.b(), rVar, b0Var.a()) + i10;
            if (this.f11646a == v.Horizontal) {
                i11 = iArrD[iF - b0Var.f()];
                f10 = 0.0f;
                i12 = 4;
                obj = null;
                aVar2 = aVar;
                t0Var = t0Var2;
            } else {
                aVar2 = aVar;
                t0Var = t0Var2;
                i11 = iB;
                iB = iArrD[iF - b0Var.f()];
                f10 = 0.0f;
                i12 = 4;
                obj = null;
            }
            t0.a.f(aVar2, t0Var, i11, iB, f10, i12, obj);
        }
    }
}
