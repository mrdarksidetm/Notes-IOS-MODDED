package af;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ye.f;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public class a1 implements ye.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0<?> f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Annotation>[] f731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Annotation> f732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Integer> f734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final md.l f735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final md.l f736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final md.l f737l;

    static final class a extends ae.s implements zd.a<Integer> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            a1 a1Var = a1.this;
            return Integer.valueOf(b1.a(a1Var, a1Var.p()));
        }
    }

    static final class b extends ae.s implements zd.a<we.b<?>[]> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final we.b<?>[] invoke() {
            we.b<?>[] bVarArrChildSerializers;
            c0 c0Var = a1.this.f727b;
            return (c0Var == null || (bVarArrChildSerializers = c0Var.childSerializers()) == null) ? c1.f747a : bVarArrChildSerializers;
        }
    }

    static final class c extends ae.s implements zd.l<Integer, CharSequence> {
        c() {
            super(1);
        }

        public final CharSequence a(int i10) {
            return a1.this.g(i10) + ": " + a1.this.i(i10).a();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    static final class d extends ae.s implements zd.a<ye.f[]> {
        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ye.f[] invoke() {
            ArrayList arrayList;
            we.b<?>[] bVarArrTypeParametersSerializers;
            c0 c0Var = a1.this.f727b;
            if (c0Var == null || (bVarArrTypeParametersSerializers = c0Var.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                for (we.b<?> bVar : bVarArrTypeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return y0.b(arrayList);
        }
    }

    public a1(String str, c0<?> c0Var, int i10) {
        ae.r.f(str, "serialName");
        this.f726a = str;
        this.f727b = c0Var;
        this.f728c = i10;
        this.f729d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f730e = strArr;
        int i12 = this.f728c;
        this.f731f = new List[i12];
        this.f733h = new boolean[i12];
        this.f734i = nd.r0.e();
        md.p pVar = md.p.f15570b;
        this.f735j = md.n.a(pVar, new b());
        this.f736k = md.n.a(pVar, new d());
        this.f737l = md.n.a(pVar, new a());
    }

    public /* synthetic */ a1(String str, c0 c0Var, int i10, int i11, ae.j jVar) {
        this(str, (i11 & 2) != 0 ? null : c0Var, i10);
    }

    public static /* synthetic */ void m(a1 a1Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        a1Var.l(str, z10);
    }

    private final Map<String, Integer> n() {
        HashMap map = new HashMap();
        int length = this.f730e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f730e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    private final we.b<?>[] o() {
        return (we.b[]) this.f735j.getValue();
    }

    private final int q() {
        return ((Number) this.f737l.getValue()).intValue();
    }

    @Override // ye.f
    public String a() {
        return this.f726a;
    }

    @Override // af.l
    public Set<String> b() {
        return this.f734i.keySet();
    }

    @Override // ye.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // ye.f
    public int d(String str) {
        ae.r.f(str, "name");
        Integer num = this.f734i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ye.f
    public ye.j e() {
        return k.a.f24011a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            ye.f fVar = (ye.f) obj;
            if (ae.r.b(a(), fVar.a()) && Arrays.equals(p(), ((a1) obj).p()) && f() == fVar.f()) {
                int iF = f();
                for (int i10 = 0; i10 < iF; i10++) {
                    if (ae.r.b(i(i10).a(), fVar.i(i10).a()) && ae.r.b(i(i10).e(), fVar.i(i10).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // ye.f
    public final int f() {
        return this.f728c;
    }

    @Override // ye.f
    public String g(int i10) {
        return this.f730e[i10];
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f732g;
        return list == null ? nd.u.m() : list;
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        List<Annotation> list = this.f731f[i10];
        return list == null ? nd.u.m() : list;
    }

    public int hashCode() {
        return q();
    }

    @Override // ye.f
    public ye.f i(int i10) {
        return o()[i10].getDescriptor();
    }

    @Override // ye.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // ye.f
    public boolean j(int i10) {
        return this.f733h[i10];
    }

    public final void l(String str, boolean z10) {
        ae.r.f(str, "name");
        String[] strArr = this.f730e;
        int i10 = this.f729d + 1;
        this.f729d = i10;
        strArr[i10] = str;
        this.f733h[i10] = z10;
        this.f731f[i10] = null;
        if (i10 == this.f728c - 1) {
            this.f734i = n();
        }
    }

    public final ye.f[] p() {
        return (ye.f[]) this.f736k.getValue();
    }

    public final void r(Annotation annotation) {
        ae.r.f(annotation, "annotation");
        List<Annotation> arrayList = this.f731f[this.f729d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f731f[this.f729d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void s(Annotation annotation) {
        ae.r.f(annotation, "a");
        if (this.f732g == null) {
            this.f732g = new ArrayList(1);
        }
        List<Annotation> list = this.f732g;
        ae.r.c(list);
        list.add(annotation);
    }

    public String toString() {
        return nd.c0.h0(ge.o.t(0, this.f728c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }
}
