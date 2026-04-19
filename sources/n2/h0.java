package n2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f15795a = new h0();

    public interface a {
        boolean a();

        float b(w2.d dVar);

        String c();
    }

    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f15797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f15798c;

        public b(String str, float f10) {
            this.f15796a = str;
            this.f15797b = f10;
        }

        @Override // n2.h0.a
        public boolean a() {
            return this.f15798c;
        }

        @Override // n2.h0.a
        public float b(w2.d dVar) {
            return this.f15797b;
        }

        @Override // n2.h0.a
        public String c() {
            return this.f15796a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (ae.r.b(c(), bVar.c())) {
                return (this.f15797b > bVar.f15797b ? 1 : (this.f15797b == bVar.f15797b ? 0 : -1)) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + Float.hashCode(this.f15797b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f15797b + ')';
        }
    }

    private static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f15800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f15801c;

        public c(String str, int i10) {
            this.f15799a = str;
            this.f15800b = i10;
        }

        @Override // n2.h0.a
        public boolean a() {
            return this.f15801c;
        }

        @Override // n2.h0.a
        public float b(w2.d dVar) {
            return this.f15800b;
        }

        @Override // n2.h0.a
        public String c() {
            return this.f15799a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ae.r.b(c(), cVar.c()) && this.f15800b == cVar.f15800b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + this.f15800b;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f15800b + ')';
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a> f15802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f15803b;

        public d(a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (a aVar : aVarArr) {
                String strC = aVar.c();
                Object arrayList = linkedHashMap.get(strC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strC, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    this.f15802a = arrayList3;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (((a) arrayList3.get(i10)).a()) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                    this.f15803b = z10;
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!(list.size() == 1)) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + nd.c0.h0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                nd.z.C(arrayList2, list);
            }
        }

        public final boolean a() {
            return this.f15803b;
        }

        public final List<a> b() {
            return this.f15802a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && ae.r.b(this.f15802a, ((d) obj).f15802a);
        }

        public int hashCode() {
            return this.f15802a.hashCode();
        }
    }

    private h0() {
    }

    public final d a(i0 i0Var, int i10, a... aVarArr) {
        ae.l0 l0Var = new ae.l0(3);
        l0Var.a(c(i0Var.t()));
        l0Var.a(b(i10));
        l0Var.b(aVarArr);
        return new d((a[]) l0Var.d(new a[l0Var.c()]));
    }

    public final a b(float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (z10) {
            return new b("ital", f10);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f10).toString());
    }

    public final a c(int i10) {
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return new c("wght", i10);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i10).toString());
    }
}
