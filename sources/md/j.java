package md;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15559e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f15560f = k.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15564d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public j(int i10, int i11, int i12) {
        this.f15561a = i10;
        this.f15562b = i11;
        this.f15563c = i12;
        this.f15564d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new ge.i(0, 255).t(i10) && new ge.i(0, 255).t(i11) && new ge.i(0, 255).t(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + com.amazon.a.a.o.c.a.b.f7490a + i11 + com.amazon.a.a.o.c.a.b.f7490a + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        ae.r.f(jVar, "other");
        return this.f15564d - jVar.f15564d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        return jVar != null && this.f15564d == jVar.f15564d;
    }

    public int hashCode() {
        return this.f15564d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15561a);
        sb2.append(com.amazon.a.a.o.c.a.b.f7490a);
        sb2.append(this.f15562b);
        sb2.append(com.amazon.a.a.o.c.a.b.f7490a);
        sb2.append(this.f15563c);
        return sb2.toString();
    }
}
