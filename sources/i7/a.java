package i7;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.Constants;
import e7.h;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.v;
import je.w;
import md.x;
import nd.c0;
import nd.t;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    static final class C0302a extends s implements l<List<? extends md.s<? extends String, ? extends Integer>>, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0302a f12588a = new C0302a();

        C0302a() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(List<md.s<String, Integer>> list) {
            r.f(list, "it");
            String strA = list.get(0).a();
            md.s<String, Integer> sVar = list.get(1);
            String strA2 = sVar.a();
            int iIntValue = sVar.b().intValue();
            if (v.v(strA) && v.v(strA2)) {
                return Integer.valueOf(iIntValue);
            }
            return null;
        }
    }

    static final class b extends s implements l<List<? extends Integer>, List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f12589a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list) {
            super(1);
            this.f12589a = list;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<Integer> list) {
            r.f(list, "it");
            return c0.t0(this.f12589a, new i(list.get(0).intValue() + 1, list.get(1).intValue() - 1));
        }
    }

    public static final h a(String str) {
        r.f(str, "contents");
        List listN0 = c0.n0(c0.n0(t.d(""), w.g0(str)), t.d(""));
        ArrayList arrayList = new ArrayList(nd.v.x(listN0, 10));
        int i10 = 0;
        for (Object obj : listN0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.w();
            }
            arrayList.add(x.a((String) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        List listV = c0.V(c0.J0(arrayList, 2, 1, false, C0302a.f12588a));
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        for (Object obj2 : listN0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                u.w();
            }
            if (!listV.contains(Integer.valueOf(i12))) {
                arrayList2.add(obj2);
            }
            i12 = i13;
        }
        ArrayList arrayList3 = new ArrayList(nd.v.x(arrayList2, 10));
        int i14 = 0;
        for (Object obj3 : arrayList2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                u.w();
            }
            Integer numValueOf = Integer.valueOf(i14);
            numValueOf.intValue();
            if (!v.v((String) obj3)) {
                numValueOf = null;
            }
            arrayList3.add(numValueOf);
            i14 = i15;
        }
        List<List> listJ0 = c0.J0(c0.V(arrayList3), 2, 1, false, new b(arrayList2));
        ArrayList arrayList4 = new ArrayList(nd.v.x(listJ0, 10));
        for (List list : listJ0) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                md.s<String, String> sVarE = e((String) it.next());
                if (sVarE != null) {
                    arrayList5.add(sVarE);
                }
            }
            arrayList4.add(arrayList5);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (!((List) obj4).isEmpty()) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayList7 = new ArrayList(nd.v.x(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(c((List) it2.next()));
        }
        ArrayList<List> arrayList8 = new ArrayList();
        for (Object obj5 : arrayList7) {
            if (!((List) obj5).isEmpty()) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList(nd.v.x(arrayList8, 10));
        for (List list2 : arrayList8) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj6 : list2) {
                if (!d((md.s) obj6)) {
                    arrayList10.add(obj6);
                }
            }
            arrayList9.add(arrayList10);
        }
        ArrayList arrayList11 = new ArrayList(nd.v.x(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList11.add(b((List) it3.next()));
        }
        ArrayList arrayList12 = new ArrayList();
        for (Object obj7 : arrayList11) {
            if (!((List) obj7).isEmpty()) {
                arrayList12.add(obj7);
            }
        }
        return new h(nd.v.z(arrayList12), arrayList9);
    }

    private static final List<md.s<String, String>> b(List<md.s<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(!d((md.s) obj))) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private static final List<md.s<String, String>> c(List<md.s<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (Object obj : list) {
            if (z10) {
                arrayList.add(obj);
            } else if (!(!d((md.s) obj))) {
                arrayList.add(obj);
                z10 = true;
            }
        }
        return arrayList;
    }

    private static final boolean d(md.s<String, String> sVar) {
        boolean z10;
        if (r.b(sVar.c(), "processor")) {
            String strD = sVar.d();
            int i10 = 0;
            while (true) {
                if (i10 >= strD.length()) {
                    z10 = true;
                    break;
                }
                if (!Character.isDigit(strD.charAt(i10))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private static final md.s<String, String> e(String str) {
        String strSubstring;
        String strSubstring2;
        List<String> listC0 = w.C0(str, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 2, 2, null);
        if (!(listC0.size() == 2)) {
            listC0 = null;
        }
        if (listC0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(nd.v.x(listC0, 10));
        for (String str2 : listC0) {
            int length = str2.length();
            int i10 = 0;
            while (true) {
                strSubstring = "";
                if (i10 >= length) {
                    strSubstring2 = "";
                    break;
                }
                if (!je.b.c(str2.charAt(i10))) {
                    strSubstring2 = str2.substring(i10);
                    r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    break;
                }
                i10++;
            }
            int iS = w.S(strSubstring2);
            while (true) {
                if (-1 >= iS) {
                    break;
                }
                if (!je.b.c(strSubstring2.charAt(iS))) {
                    strSubstring = strSubstring2.substring(0, iS + 1);
                    r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                }
                iS--;
            }
            arrayList.add(strSubstring);
        }
        return x.a(arrayList.get(0), arrayList.get(1));
    }
}
