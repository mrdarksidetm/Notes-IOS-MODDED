package i0;

import h0.b;
import j0.l0;
import java.util.ArrayList;
import java.util.List;
import le.n0;
import t0.k1;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    static final class a extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12222a = new a();

        a() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
        }
    }

    static final class b extends ae.s implements zd.l<t0.a, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<x> f12223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1<md.i0> f12224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<x> list, k1<md.i0> k1Var) {
            super(1);
            this.f12223a = list;
            this.f12224b = k1Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return md.i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            List<x> list = this.f12223a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).p(aVar);
            }
            l0.a(this.f12224b);
        }
    }

    private static final List<x> a(List<z> list, List<x> list2, List<x> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, b.m mVar, b.e eVar, boolean z11, w2.d dVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).b().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(b(i17, z11, size2)).c();
            }
            int[] iArr2 = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr2[i18] = 0;
            }
            if (z10) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                mVar.b(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
                eVar.c(dVar, i15, iArr, w2.r.Ltr, iArr2);
            }
            ge.g gVarN = nd.p.N(iArr2);
            if (z11) {
                gVarN = ge.o.r(gVarN);
            }
            int iL = gVarN.l();
            int iN = gVarN.n();
            int iO = gVarN.o();
            if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
                while (true) {
                    int iC = iArr2[iL];
                    z zVar = list.get(b(iL, z11, size2));
                    if (z11) {
                        iC = (i15 - iC) - zVar.c();
                    }
                    nd.z.D(arrayList, zVar.f(iC, i10, i11));
                    if (iL == iN) {
                        break;
                    }
                    iL += iO;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i19 = i14;
                while (true) {
                    int i20 = size3 - 1;
                    x xVar = list2.get(size3);
                    int iK = i19 - xVar.k();
                    xVar.q(iK, 0, i10, i11, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                    arrayList.add(xVar);
                    if (i20 < 0) {
                        break;
                    }
                    size3 = i20;
                    i19 = iK;
                }
            }
            int size4 = list.size();
            int iD = i14;
            for (int i21 = 0; i21 < size4; i21++) {
                z zVar2 = list.get(i21);
                nd.z.D(arrayList, zVar2.f(iD, i10, i11));
                iD += zVar2.d();
            }
            int iK2 = iD;
            int i22 = 0;
            for (int size5 = list3.size(); i22 < size5; size5 = size5) {
                x xVar2 = list3.get(i22);
                xVar2.q(iK2, 0, i10, i11, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList.add(xVar2);
                iK2 += xVar2.k();
                i22++;
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    public static final w c(int i10, a0 a0Var, y yVar, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, b.m mVar, b.e eVar, boolean z11, w2.d dVar, l lVar, g0 g0Var, List<Integer> list, n0 n0Var, k1<md.i0> k1Var, zd.q<? super Integer, ? super Integer, ? super zd.l<? super t0.a, md.i0>, ? extends y1.f0> qVar) {
        boolean z12;
        int i17;
        int index;
        int iD;
        z zVar;
        z zVar2;
        int i18;
        List<x> list2;
        int i19;
        x[] xVarArrB;
        x xVar;
        int i20;
        int i21;
        boolean z13;
        int i22;
        List<Integer> list3 = list;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i10 <= 0) {
            return new w(null, 0, false, 0.0f, qVar.invoke(Integer.valueOf(w2.b.p(j10)), Integer.valueOf(w2.b.o(j10)), a.f12222a), false, nd.u.m(), -i12, i11 + i13, 0, z11, z10 ? e0.r.Vertical : e0.r.Horizontal, i13, i14);
        }
        int iD2 = ce.c.d(f10);
        int i23 = i16 - iD2;
        if (i15 == 0 && i23 < 0) {
            iD2 += i23;
            i23 = 0;
        }
        nd.k kVar = new nd.k();
        int i24 = -i12;
        int i25 = (i14 < 0 ? i14 : 0) + i24;
        int iD3 = i23 + i25;
        int i26 = i15;
        while (iD3 < 0 && i26 > 0) {
            i26--;
            z zVarC = a0Var.c(i26);
            kVar.add(0, zVarC);
            iD3 += zVarC.d();
        }
        if (iD3 < i25) {
            iD2 += iD3;
            iD3 = i25;
        }
        int i27 = iD3 - i25;
        int i28 = i11 + i13;
        int i29 = i26;
        int iD4 = ge.o.d(i28, 0);
        int iD5 = -i27;
        int i30 = i29;
        int iD6 = i27;
        int i31 = 0;
        boolean z14 = false;
        while (i31 < kVar.size()) {
            if (iD5 >= iD4) {
                kVar.remove(i31);
                z14 = true;
            } else {
                i30++;
                iD5 += ((z) kVar.get(i31)).d();
                i31++;
            }
        }
        int i32 = i30;
        boolean z15 = z14;
        while (i32 < i10 && (iD5 < iD4 || iD5 <= 0 || kVar.isEmpty())) {
            int i33 = iD4;
            z zVarC2 = a0Var.c(i32);
            if (zVarC2.e()) {
                break;
            }
            int iD7 = iD5 + zVarC2.d();
            if (iD7 <= i25) {
                i20 = iD7;
                i21 = i25;
                if (((x) nd.p.s0(zVarC2.b())).getIndex() != i10 - 1) {
                    i22 = i32 + 1;
                    iD6 -= zVarC2.d();
                    z13 = true;
                }
                i32++;
                i29 = i22;
                z15 = z13;
                iD4 = i33;
                i25 = i21;
                iD5 = i20;
            } else {
                i20 = iD7;
                i21 = i25;
            }
            kVar.add(zVarC2);
            z13 = z15;
            i22 = i29;
            i32++;
            i29 = i22;
            z15 = z13;
            iD4 = i33;
            i25 = i21;
            iD5 = i20;
        }
        if (iD5 < i11) {
            int i34 = i11 - iD5;
            iD5 += i34;
            int i35 = i29;
            iD = iD6 - i34;
            while (iD < i12 && i35 > 0) {
                i35--;
                int i36 = i24;
                z zVarC3 = a0Var.c(i35);
                kVar.add(0, zVarC3);
                iD += zVarC3.d();
                z15 = z15;
                i24 = i36;
            }
            z12 = z15;
            i17 = i24;
            index = 0;
            iD2 += i34;
            if (iD < 0) {
                iD2 += iD;
                iD5 += iD;
                iD = 0;
            }
        } else {
            z12 = z15;
            i17 = i24;
            index = 0;
            iD = iD6;
        }
        float f11 = (ce.c.a(ce.c.d(f10)) != ce.c.a(iD2) || Math.abs(ce.c.d(f10)) < Math.abs(iD2)) ? f10 : iD2;
        if ((iD >= 0 ? 1 : index) == 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i37 = -iD;
        z zVar3 = (z) kVar.first();
        x xVar2 = (x) nd.p.M(zVar3.b());
        int index2 = xVar2 != null ? xVar2.getIndex() : index;
        z zVar4 = (z) kVar.s();
        if (zVar4 == null || (xVarArrB = zVar4.b()) == null || (xVar = (x) nd.p.u0(xVarArrB)) == null) {
            zVar = zVar3;
        } else {
            zVar = zVar3;
            index = xVar.getIndex();
        }
        int size = list.size();
        List listM = null;
        int i38 = iD;
        List listM2 = null;
        int i39 = 0;
        while (i39 < size) {
            int i40 = size;
            int iIntValue = list3.get(i39).intValue();
            if (iIntValue >= 0 && iIntValue < index2) {
                x xVarC = y.c(yVar, iIntValue, 0, a0Var.d(iIntValue), 2, null);
                if (listM2 == null) {
                    listM2 = new ArrayList();
                }
                i19 = index2;
                List list4 = listM2;
                list4.add(xVarC);
                listM2 = list4;
            } else {
                i19 = index2;
            }
            i39++;
            index2 = i19;
            size = i40;
        }
        int i41 = index2;
        if (listM2 == null) {
            listM2 = nd.u.m();
        }
        List list5 = listM2;
        int size2 = list.size();
        int i42 = 0;
        while (i42 < size2) {
            int iIntValue2 = list3.get(i42).intValue();
            if (index + 1 <= iIntValue2 && iIntValue2 < i10) {
                x xVarC2 = y.c(yVar, iIntValue2, 0, a0Var.d(iIntValue2), 2, null);
                if (listM == null) {
                    listM = new ArrayList();
                }
                List list6 = listM;
                list6.add(xVarC2);
                listM = list6;
            }
            i42++;
            list3 = list;
        }
        if (listM == null) {
            listM = nd.u.m();
        }
        List list7 = listM;
        if (i12 > 0 || i14 < 0) {
            int size3 = kVar.size();
            z zVar5 = zVar;
            int i43 = i38;
            int i44 = 0;
            while (i44 < size3) {
                int iD8 = ((z) kVar.get(i44)).d();
                if (i43 == 0 || iD8 > i43) {
                    break;
                }
                int i45 = size3;
                if (i44 == nd.u.o(kVar)) {
                    break;
                }
                i43 -= iD8;
                i44++;
                zVar5 = (z) kVar.get(i44);
                size3 = i45;
            }
            zVar2 = zVar5;
            i18 = i43;
        } else {
            zVar2 = zVar;
            i18 = i38;
        }
        int iN = z10 ? w2.b.n(j10) : w2.c.g(j10, iD5);
        int iF = z10 ? w2.c.f(j10, iD5) : w2.b.m(j10);
        int i46 = i17;
        List<x> listA = a(kVar, list5, list7, iN, iF, iD5, i11, i37, z10, mVar, eVar, z11, dVar);
        lVar.f((int) f11, iN, iF, listA, yVar, g0Var, z10, n0Var);
        boolean z16 = index != i10 + (-1) || iD5 > i11;
        y1.f0 f0VarInvoke = qVar.invoke(Integer.valueOf(iN), Integer.valueOf(iF), new b(listA, k1Var));
        if (list5.isEmpty() && list7.isEmpty()) {
            list2 = listA;
        } else {
            ArrayList arrayList = new ArrayList(listA.size());
            int size4 = listA.size();
            for (int i47 = 0; i47 < size4; i47++) {
                x xVar3 = listA.get(i47);
                int index3 = xVar3.getIndex();
                if (i41 <= index3 && index3 <= index) {
                    arrayList.add(xVar3);
                }
            }
            list2 = arrayList;
        }
        return new w(zVar2, i18, z16, f11, f0VarInvoke, z12, list2, i46, i28, i10, z11, z10 ? e0.r.Vertical : e0.r.Horizontal, i13, i14);
    }
}
