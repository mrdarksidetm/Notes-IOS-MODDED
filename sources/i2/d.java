package i2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b<a0>> f12330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b<s>> f12331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<? extends Object>> f12332d;

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuilder f12333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<C0297a<a0>> f12334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<C0297a<s>> f12335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<C0297a<? extends Object>> f12336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<C0297a<? extends Object>> f12337e;

        /* JADX INFO: renamed from: i2.d$a$a, reason: collision with other inner class name */
        private static final class C0297a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f12338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f12339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f12340c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f12341d;

            public C0297a(T t10, int i10, int i11, String str) {
                this.f12338a = t10;
                this.f12339b = i10;
                this.f12340c = i11;
                this.f12341d = str;
            }

            public /* synthetic */ C0297a(Object obj, int i10, int i11, String str, int i12, ae.j jVar) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }

            public final void a(int i10) {
                this.f12340c = i10;
            }

            public final b<T> b(int i10) {
                int i11 = this.f12340c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new b<>(this.f12338a, this.f12339b, i10, this.f12341d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0297a)) {
                    return false;
                }
                C0297a c0297a = (C0297a) obj;
                return ae.r.b(this.f12338a, c0297a.f12338a) && this.f12339b == c0297a.f12339b && this.f12340c == c0297a.f12340c && ae.r.b(this.f12341d, c0297a.f12341d);
            }

            public int hashCode() {
                T t10 = this.f12338a;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f12339b)) * 31) + Integer.hashCode(this.f12340c)) * 31) + this.f12341d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f12338a + ", start=" + this.f12339b + ", end=" + this.f12340c + ", tag=" + this.f12341d + ')';
            }
        }

        public a(int i10) {
            this.f12333a = new StringBuilder(i10);
            this.f12334b = new ArrayList();
            this.f12335c = new ArrayList();
            this.f12336d = new ArrayList();
            this.f12337e = new ArrayList();
        }

        public /* synthetic */ a(int i10, int i11, ae.j jVar) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public final void a(s sVar, int i10, int i11) {
            this.f12335c.add(new C0297a<>(sVar, i10, i11, null, 8, null));
        }

        public final void b(a0 a0Var, int i10, int i11) {
            this.f12334b.add(new C0297a<>(a0Var, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a append(char c10) {
            this.f12333a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof d) {
                f((d) charSequence);
            } else {
                this.f12333a.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof d) {
                g((d) charSequence, i10, i11);
            } else {
                this.f12333a.append(charSequence, i10, i11);
            }
            return this;
        }

        public final void f(d dVar) {
            int length = this.f12333a.length();
            this.f12333a.append(dVar.j());
            List<b<a0>> listG = dVar.g();
            if (listG != null) {
                int size = listG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b<a0> bVar = listG.get(i10);
                    b(bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List<b<s>> listE = dVar.e();
            if (listE != null) {
                int size2 = listE.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b<s> bVar2 = listE.get(i11);
                    a(bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List<b<? extends Object>> listB = dVar.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    b<? extends Object> bVar3 = listB.get(i12);
                    this.f12336d.add(new C0297a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void g(d dVar, int i10, int i11) {
            int length = this.f12333a.length();
            this.f12333a.append((CharSequence) dVar.j(), i10, i11);
            List listJ = e.j(dVar, i10, i11);
            if (listJ != null) {
                int size = listJ.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = (b) listJ.get(i12);
                    b((a0) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List listI = e.i(dVar, i10, i11);
            if (listI != null) {
                int size2 = listI.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    b bVar2 = (b) listI.get(i13);
                    a((s) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List listH = e.h(dVar, i10, i11);
            if (listH != null) {
                int size3 = listH.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    b bVar3 = (b) listH.get(i14);
                    this.f12336d.add(new C0297a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void h(String str) {
            this.f12333a.append(str);
        }

        public final void i() {
            if (!(!this.f12337e.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            this.f12337e.remove(r0.size() - 1).a(this.f12333a.length());
        }

        public final int j(String str, String str2) {
            C0297a<? extends Object> c0297a = new C0297a<>(str2, this.f12333a.length(), 0, str, 4, null);
            this.f12337e.add(c0297a);
            this.f12336d.add(c0297a);
            return this.f12337e.size() - 1;
        }

        public final int k(a0 a0Var) {
            C0297a<a0> c0297a = new C0297a<>(a0Var, this.f12333a.length(), 0, null, 12, null);
            this.f12337e.add(c0297a);
            this.f12334b.add(c0297a);
            return this.f12337e.size() - 1;
        }

        public final d l() {
            String string = this.f12333a.toString();
            List<C0297a<a0>> list = this.f12334b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.f12333a.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C0297a<s>> list2 = this.f12335c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).b(this.f12333a.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<C0297a<? extends Object>> list3 = this.f12336d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(list3.get(i12).b(this.f12333a.length()));
            }
            return new d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f12342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f12345d;

        public b(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }

        public b(T t10, int i10, int i11, String str) {
            this.f12342a = t10;
            this.f12343b = i10;
            this.f12344c = i11;
            this.f12345d = str;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.f12342a;
        }

        public final int b() {
            return this.f12343b;
        }

        public final int c() {
            return this.f12344c;
        }

        public final int d() {
            return this.f12344c;
        }

        public final T e() {
            return this.f12342a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return ae.r.b(this.f12342a, bVar.f12342a) && this.f12343b == bVar.f12343b && this.f12344c == bVar.f12344c && ae.r.b(this.f12345d, bVar.f12345d);
        }

        public final int f() {
            return this.f12343b;
        }

        public final String g() {
            return this.f12345d;
        }

        public int hashCode() {
            T t10 = this.f12342a;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f12343b)) * 31) + Integer.hashCode(this.f12344c)) * 31) + this.f12345d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f12342a + ", start=" + this.f12343b + ", end=" + this.f12344c + ", tag=" + this.f12345d + ')';
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return pd.b.a(Integer.valueOf(((b) t10).f()), Integer.valueOf(((b) t11).f()));
        }
    }

    public d(String str, List<b<a0>> list, List<b<s>> list2) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
    }

    public /* synthetic */ d(String str, List list, List list2, int i10, ae.j jVar) {
        this(str, (i10 & 2) != 0 ? nd.u.m() : list, (i10 & 4) != 0 ? nd.u.m() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, List<b<a0>> list, List<b<s>> list2, List<? extends b<? extends Object>> list3) {
        List listU0;
        this.f12329a = str;
        this.f12330b = list;
        this.f12331c = list2;
        this.f12332d = list3;
        if (list2 == null || (listU0 = nd.c0.u0(list2, new c())) == null) {
            return;
        }
        int size = listU0.size();
        int iD = -1;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) listU0.get(i10);
            if (!(bVar.f() >= iD)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (!(bVar.d() <= this.f12329a.length())) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
            }
            iD = bVar.d();
        }
    }

    public /* synthetic */ d(String str, List list, List list2, List list3, int i10, ae.j jVar) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public char a(int i10) {
        return this.f12329a.charAt(i10);
    }

    public final List<b<? extends Object>> b() {
        return this.f12332d;
    }

    public int c() {
        return this.f12329a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List<b<s>> d() {
        List<b<s>> list = this.f12331c;
        return list == null ? nd.u.m() : list;
    }

    public final List<b<s>> e() {
        return this.f12331c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return ae.r.b(this.f12329a, dVar.f12329a) && ae.r.b(this.f12330b, dVar.f12330b) && ae.r.b(this.f12331c, dVar.f12331c) && ae.r.b(this.f12332d, dVar.f12332d);
    }

    public final List<b<a0>> f() {
        List<b<a0>> list = this.f12330b;
        return list == null ? nd.u.m() : list;
    }

    public final List<b<a0>> g() {
        return this.f12330b;
    }

    public final List<b<String>> h(int i10, int i11) {
        List listM;
        List<b<? extends Object>> list = this.f12332d;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof String) && e.k(i10, i11, bVar2.f(), bVar2.d())) {
                    listM.add(bVar);
                }
            }
        } else {
            listM = nd.u.m();
        }
        ae.r.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listM;
    }

    public int hashCode() {
        int iHashCode = this.f12329a.hashCode() * 31;
        List<b<a0>> list = this.f12330b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<b<s>> list2 = this.f12331c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<b<? extends Object>> list3 = this.f12332d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List<b<String>> i(String str, int i10, int i11) {
        List listM;
        List<b<? extends Object>> list = this.f12332d;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof String) && ae.r.b(str, bVar2.g()) && e.k(i10, i11, bVar2.f(), bVar2.d())) {
                    listM.add(bVar);
                }
            }
        } else {
            listM = nd.u.m();
        }
        ae.r.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listM;
    }

    public final String j() {
        return this.f12329a;
    }

    public final List<b<i0>> k(int i10, int i11) {
        List listM;
        List<b<? extends Object>> list = this.f12332d;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof i0) && e.k(i10, i11, bVar2.f(), bVar2.d())) {
                    listM.add(bVar);
                }
            }
        } else {
            listM = nd.u.m();
        }
        ae.r.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    public final List<b<j0>> l(int i10, int i11) {
        List listM;
        List<b<? extends Object>> list = this.f12332d;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof j0) && e.k(i10, i11, bVar2.f(), bVar2.d())) {
                    listM.add(bVar);
                }
            }
        } else {
            listM = nd.u.m();
        }
        ae.r.d(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(String str, int i10, int i11) {
        List<b<? extends Object>> list = this.f12332d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b<? extends Object> bVar = list.get(i12);
            if ((bVar.e() instanceof String) && ae.r.b(str, bVar.g()) && e.k(i10, i11, bVar.f(), bVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d subSequence(int i10, int i11) {
        if (i10 <= i11) {
            if (i10 == 0 && i11 == this.f12329a.length()) {
                return this;
            }
            String strSubstring = this.f12329a.substring(i10, i11);
            ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new d(strSubstring, e.g(this.f12330b, i10, i11), e.g(this.f12331c, i10, i11), e.g(this.f12332d, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    public final d o(long j10) {
        return subSequence(e0.j(j10), e0.i(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f12329a;
    }
}
