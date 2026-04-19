package ye;

import ae.r;
import ae.s;
import af.b1;
import af.l;
import af.y0;
import ge.o;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.n;
import md.x;
import nd.c0;
import nd.i0;
import nd.p;
import nd.r0;
import nd.v;
import ye.f;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f23989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Annotation> f23991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f23992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f23993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f[] f23994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Annotation>[] f23995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f23996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Integer> f23997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f[] f23998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final md.l f23999l;

    static final class a extends s implements zd.a<Integer> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(b1.a(gVar, gVar.f23998k));
        }
    }

    static final class b extends s implements zd.l<Integer, CharSequence> {
        b() {
            super(1);
        }

        public final CharSequence a(int i10) {
            return g.this.g(i10) + ": " + g.this.i(i10).a();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(String str, j jVar, int i10, List<? extends f> list, ye.a aVar) {
        r.f(str, "serialName");
        r.f(jVar, "kind");
        r.f(list, "typeParameters");
        r.f(aVar, "builder");
        this.f23988a = str;
        this.f23989b = jVar;
        this.f23990c = i10;
        this.f23991d = aVar.c();
        this.f23992e = c0.A0(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f23993f = strArr;
        this.f23994g = y0.b(aVar.e());
        this.f23995h = (List[]) aVar.d().toArray(new List[0]);
        this.f23996i = c0.w0(aVar.g());
        Iterable<i0> iterableO0 = p.O0(strArr);
        ArrayList arrayList = new ArrayList(v.x(iterableO0, 10));
        for (i0 i0Var : iterableO0) {
            arrayList.add(x.a(i0Var.b(), Integer.valueOf(i0Var.a())));
        }
        this.f23997j = r0.r(arrayList);
        this.f23998k = y0.b(list);
        this.f23999l = n.b(new a());
    }

    private final int l() {
        return ((Number) this.f23999l.getValue()).intValue();
    }

    @Override // ye.f
    public String a() {
        return this.f23988a;
    }

    @Override // af.l
    public Set<String> b() {
        return this.f23992e;
    }

    @Override // ye.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // ye.f
    public int d(String str) {
        r.f(str, "name");
        Integer num = this.f23997j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ye.f
    public j e() {
        return this.f23989b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (r.b(a(), fVar.a()) && Arrays.equals(this.f23998k, ((g) obj).f23998k) && f() == fVar.f()) {
                int iF = f();
                for (int i10 = 0; i10 < iF; i10++) {
                    if (r.b(i(i10).a(), fVar.i(i10).a()) && r.b(i(i10).e(), fVar.i(i10).e())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // ye.f
    public int f() {
        return this.f23990c;
    }

    @Override // ye.f
    public String g(int i10) {
        return this.f23993f[i10];
    }

    @Override // ye.f
    public List<Annotation> getAnnotations() {
        return this.f23991d;
    }

    @Override // ye.f
    public List<Annotation> h(int i10) {
        return this.f23995h[i10];
    }

    public int hashCode() {
        return l();
    }

    @Override // ye.f
    public f i(int i10) {
        return this.f23994g[i10];
    }

    @Override // ye.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // ye.f
    public boolean j(int i10) {
        return this.f23996i[i10];
    }

    public String toString() {
        return c0.h0(o.t(0, f()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
