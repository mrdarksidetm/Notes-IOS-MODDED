package i2;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12424c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w f12425d = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12427b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public w() {
        this(g.f12362b.a(), false, null);
    }

    private w(int i10, boolean z10) {
        this.f12426a = z10;
        this.f12427b = i10;
    }

    public /* synthetic */ w(int i10, boolean z10, ae.j jVar) {
        this(i10, z10);
    }

    public w(boolean z10) {
        this.f12426a = z10;
        this.f12427b = g.f12362b.a();
    }

    public final int a() {
        return this.f12427b;
    }

    public final boolean b() {
        return this.f12426a;
    }

    public final w c(w wVar) {
        return wVar == null ? this : wVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f12426a == wVar.f12426a && g.f(this.f12427b, wVar.f12427b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f12426a) * 31) + g.g(this.f12427b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f12426a + ", emojiSupportMatch=" + ((Object) g.h(this.f12427b)) + ')';
    }
}
