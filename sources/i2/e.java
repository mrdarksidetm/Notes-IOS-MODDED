package i2;

import i2.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f12352a = new d("", null, null, 6, null);

    public static final boolean f(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<d.b<T>> g(List<? extends d.b<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<? extends T> bVar = list.get(i12);
            d.b<? extends T> bVar2 = bVar;
            if (k(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            arrayList2.add(new d.b(bVar3.e(), Math.max(i10, bVar3.f()) - i10, Math.min(i11, bVar3.d()) - i10, bVar3.g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.b<? extends Object>> h(d dVar, int i10, int i11) {
        List<d.b<? extends Object>> listB;
        if (i10 == i11 || (listB = dVar.b()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return listB;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<? extends Object> bVar = listB.get(i12);
            d.b<? extends Object> bVar2 = bVar;
            if (k(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            arrayList2.add(new d.b(bVar3.e(), ge.o.l(bVar3.f(), i10, i11) - i10, ge.o.l(bVar3.d(), i10, i11) - i10, bVar3.g()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.b<s>> i(d dVar, int i10, int i11) {
        List<d.b<s>> listE;
        if (i10 == i11 || (listE = dVar.e()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return listE;
        }
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<s> bVar = listE.get(i12);
            d.b<s> bVar2 = bVar;
            if (k(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            arrayList2.add(new d.b(bVar3.e(), ge.o.l(bVar3.f(), i10, i11) - i10, ge.o.l(bVar3.d(), i10, i11) - i10));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.b<a0>> j(d dVar, int i10, int i11) {
        List<d.b<a0>> listG;
        if (i10 == i11 || (listG = dVar.g()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return listG;
        }
        ArrayList arrayList = new ArrayList(listG.size());
        int size = listG.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<a0> bVar = listG.get(i12);
            d.b<a0> bVar2 = bVar;
            if (k(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            arrayList2.add(new d.b(bVar3.e(), ge.o.l(bVar3.f(), i10, i11) - i10, ge.o.l(bVar3.d(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean k(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || f(i10, i11, i12, i13) || f(i12, i13, i10, i11);
    }

    public static final List<d.b<s>> l(d dVar, s sVar) {
        int length = dVar.j().length();
        List<d.b<s>> listE = dVar.e();
        if (listE == null) {
            listE = nd.u.m();
        }
        ArrayList arrayList = new ArrayList();
        int size = listE.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            d.b<s> bVar = listE.get(i10);
            s sVarA = bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            if (iB != i11) {
                arrayList.add(new d.b(sVar, i11, iB));
            }
            arrayList.add(new d.b(sVar.l(sVarA), iB, iC));
            i10++;
            i11 = iC;
        }
        if (i11 != length) {
            arrayList.add(new d.b(sVar, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new d.b(sVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d m(d dVar, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = dVar.j().substring(i10, i11);
            ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new d(strSubstring, j(dVar, i10, i11), null, null, 12, null);
    }
}
