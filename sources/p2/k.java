package p2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f18158f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k f18159g = new k(false, 0, false, 0, 0, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18164e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final k a() {
            return k.f18159g;
        }
    }

    private k(boolean z10, int i10, boolean z11, int i11, int i12, y yVar) {
        this.f18160a = z10;
        this.f18161b = i10;
        this.f18162c = z11;
        this.f18163d = i11;
        this.f18164e = i12;
    }

    public /* synthetic */ k(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, int i13, ae.j jVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? p.f18169a.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? q.f18174a.h() : i11, (i13 & 16) != 0 ? j.f18147b.a() : i12, (i13 & 32) != 0 ? null : yVar, null);
    }

    public /* synthetic */ k(boolean z10, int i10, boolean z11, int i11, int i12, y yVar, ae.j jVar) {
        this(z10, i10, z11, i11, i12, yVar);
    }

    public final boolean b() {
        return this.f18162c;
    }

    public final int c() {
        return this.f18161b;
    }

    public final int d() {
        return this.f18164e;
    }

    public final int e() {
        return this.f18163d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f18160a != kVar.f18160a || !p.f(this.f18161b, kVar.f18161b) || this.f18162c != kVar.f18162c || !q.k(this.f18163d, kVar.f18163d) || !j.l(this.f18164e, kVar.f18164e)) {
            return false;
        }
        kVar.getClass();
        return ae.r.b(null, null);
    }

    public final y f() {
        return null;
    }

    public final boolean g() {
        return this.f18160a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f18160a) * 31) + p.g(this.f18161b)) * 31) + Boolean.hashCode(this.f18162c)) * 31) + q.l(this.f18163d)) * 31) + j.m(this.f18164e)) * 31) + 0;
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f18160a + ", capitalization=" + ((Object) p.h(this.f18161b)) + ", autoCorrect=" + this.f18162c + ", keyboardType=" + ((Object) q.m(this.f18163d)) + ", imeAction=" + ((Object) j.n(this.f18164e)) + ", platformImeOptions=" + ((Object) null) + ')';
    }
}
