package cf;

import cf.y;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y.a<Map<String, Integer>> f6940a = new y.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y.a<String[]> f6941b = new y.a<>();

    static final class a extends ae.s implements zd.a<Map<String, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ye.f f6942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bf.a f6943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ye.f fVar, bf.a aVar) {
            super(0);
            this.f6942a = fVar;
            this.f6943b = aVar;
        }

        @Override // zd.a
        public final Map<String, ? extends Integer> invoke() {
            return f0.b(this.f6942a, this.f6943b);
        }
    }

    static final class b extends ae.s implements zd.a<String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ye.f f6944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ bf.r f6945b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ye.f fVar, bf.r rVar) {
            super(0);
            this.f6944a = fVar;
            this.f6945b = rVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            int iF = this.f6944a.f();
            String[] strArr = new String[iF];
            for (int i10 = 0; i10 < iF; i10++) {
                strArr[i10] = this.f6945b.a(this.f6944a, i10, this.f6944a.g(i10));
            }
            return strArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> b(ye.f fVar, bf.a aVar) {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bf.r rVarK = k(fVar, aVar);
        int iF = fVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            List<Annotation> listH = fVar.h(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof bf.q) {
                    arrayList.add(obj);
                }
            }
            bf.q qVar = (bf.q) nd.c0.s0(arrayList);
            if (qVar != null && (strArrNames = qVar.names()) != null) {
                for (String str : strArrNames) {
                    c(linkedHashMap, fVar, str, i10);
                }
            }
            if (rVarK != null) {
                c(linkedHashMap, fVar, rVarK.a(fVar, i10, fVar.g(i10)), i10);
            }
        }
        return linkedHashMap.isEmpty() ? nd.r0.e() : linkedHashMap;
    }

    private static final void c(Map<String, Integer> map, ye.f fVar, String str, int i10) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new d0("The suggested name '" + str + "' for property " + fVar.g(i10) + " is already one of the names for property " + fVar.g(((Number) nd.r0.f(map, str)).intValue()) + " in " + fVar);
    }

    public static final Map<String, Integer> d(bf.a aVar, ye.f fVar) {
        ae.r.f(aVar, "<this>");
        ae.r.f(fVar, "descriptor");
        return (Map) bf.y.a(aVar).b(fVar, f6940a, new a(fVar, aVar));
    }

    public static final y.a<Map<String, Integer>> e() {
        return f6940a;
    }

    public static final String f(ye.f fVar, bf.a aVar, int i10) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        bf.r rVarK = k(fVar, aVar);
        return rVarK == null ? fVar.g(i10) : l(fVar, aVar, rVarK)[i10];
    }

    public static final int g(ye.f fVar, bf.a aVar, String str) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        ae.r.f(str, "name");
        if (k(fVar, aVar) != null) {
            return h(aVar, fVar, str);
        }
        int iD = fVar.d(str);
        return (iD == -3 && aVar.f().k()) ? h(aVar, fVar, str) : iD;
    }

    private static final int h(bf.a aVar, ye.f fVar, String str) {
        Integer num = d(aVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int i(ye.f fVar, bf.a aVar, String str, String str2) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        ae.r.f(str, "name");
        ae.r.f(str2, "suffix");
        int iG = g(fVar, aVar, str);
        if (iG != -3) {
            return iG;
        }
        throw new we.g(fVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int j(ye.f fVar, bf.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, aVar, str, str2);
    }

    public static final bf.r k(ye.f fVar, bf.a aVar) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        if (ae.r.b(fVar.e(), k.a.f24011a)) {
            return aVar.f().h();
        }
        return null;
    }

    public static final String[] l(ye.f fVar, bf.a aVar, bf.r rVar) {
        ae.r.f(fVar, "<this>");
        ae.r.f(aVar, "json");
        ae.r.f(rVar, "strategy");
        return (String[]) bf.y.a(aVar).b(fVar, f6941b, new b(fVar, rVar));
    }
}
