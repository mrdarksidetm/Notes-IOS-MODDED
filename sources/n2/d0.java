package n2;

import java.util.ArrayList;
import java.util.List;
import n2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final List<s> a(List<? extends s> list, i0 i0Var, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            s sVar = list.get(i12);
            s sVar2 = sVar;
            if (ae.r.b(sVar2.b(), i0Var) && e0.f(sVar2.c(), i10)) {
                arrayList.add(sVar);
            }
            i12++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            s sVar3 = list.get(i13);
            if (e0.f(sVar3.c(), i10)) {
                arrayList2.add(sVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        i0.a aVar = i0.f15808b;
        i0 i0Var2 = null;
        if (i0Var.compareTo(aVar.j()) < 0) {
            int size3 = list.size();
            i0 i0Var3 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                i0 i0VarB = list.get(i14).b();
                if (i0VarB.compareTo(i0Var) >= 0) {
                    if (i0VarB.compareTo(i0Var) <= 0) {
                        i0Var3 = i0VarB;
                        i0Var2 = i0Var3;
                        break;
                    }
                    if (i0Var3 == null || i0VarB.compareTo(i0Var3) < 0) {
                        i0Var3 = i0VarB;
                    }
                } else if (i0Var2 == null || i0VarB.compareTo(i0Var2) > 0) {
                    i0Var2 = i0VarB;
                }
                i14++;
            }
            if (i0Var2 != null) {
                i0Var3 = i0Var2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i11 < size4) {
                s sVar4 = list.get(i11);
                if (ae.r.b(sVar4.b(), i0Var3)) {
                    arrayList3.add(sVar4);
                }
                i11++;
            }
            return arrayList3;
        }
        if (i0Var.compareTo(aVar.k()) > 0) {
            int size5 = list.size();
            i0 i0Var4 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                i0 i0VarB2 = list.get(i15).b();
                if (i0VarB2.compareTo(i0Var) >= 0) {
                    if (i0VarB2.compareTo(i0Var) <= 0) {
                        i0Var4 = i0VarB2;
                        i0Var2 = i0Var4;
                        break;
                    }
                    if (i0Var4 == null || i0VarB2.compareTo(i0Var4) < 0) {
                        i0Var4 = i0VarB2;
                    }
                } else if (i0Var2 == null || i0VarB2.compareTo(i0Var2) > 0) {
                    i0Var2 = i0VarB2;
                }
                i15++;
            }
            if (i0Var4 == null) {
                i0Var4 = i0Var2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i11 < size6) {
                s sVar5 = list.get(i11);
                if (ae.r.b(sVar5.b(), i0Var4)) {
                    arrayList4.add(sVar5);
                }
                i11++;
            }
            return arrayList4;
        }
        i0 i0VarK = aVar.k();
        int size7 = list.size();
        i0 i0Var5 = null;
        i0 i0Var6 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            i0 i0VarB3 = list.get(i16).b();
            if (i0VarK == null || i0VarB3.compareTo(i0VarK) <= 0) {
                if (i0VarB3.compareTo(i0Var) >= 0) {
                    if (i0VarB3.compareTo(i0Var) <= 0) {
                        i0Var5 = i0VarB3;
                        i0Var6 = i0Var5;
                        break;
                    }
                    if (i0Var6 == null || i0VarB3.compareTo(i0Var6) < 0) {
                        i0Var6 = i0VarB3;
                    }
                } else if (i0Var5 == null || i0VarB3.compareTo(i0Var5) > 0) {
                    i0Var5 = i0VarB3;
                }
            }
            i16++;
        }
        if (i0Var6 != null) {
            i0Var5 = i0Var6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i17 = 0; i17 < size8; i17++) {
            s sVar6 = list.get(i17);
            if (ae.r.b(sVar6.b(), i0Var5)) {
                arrayList5.add(sVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        i0 i0VarK2 = i0.f15808b.k();
        int size9 = list.size();
        i0 i0Var7 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            i0 i0VarB4 = list.get(i18).b();
            if (i0VarK2 == null || i0VarB4.compareTo(i0VarK2) >= 0) {
                if (i0VarB4.compareTo(i0Var) >= 0) {
                    if (i0VarB4.compareTo(i0Var) <= 0) {
                        i0Var2 = i0VarB4;
                        i0Var7 = i0Var2;
                        break;
                    }
                    if (i0Var7 == null || i0VarB4.compareTo(i0Var7) < 0) {
                        i0Var7 = i0VarB4;
                    }
                } else if (i0Var2 == null || i0VarB4.compareTo(i0Var2) > 0) {
                    i0Var2 = i0VarB4;
                }
            }
            i18++;
        }
        if (i0Var7 != null) {
            i0Var2 = i0Var7;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i11 < size10) {
            s sVar7 = list.get(i11);
            if (ae.r.b(sVar7.b(), i0Var2)) {
                arrayList6.add(sVar7);
            }
            i11++;
        }
        return arrayList6;
    }
}
