package androidx.compose.foundation.layout;

import a2.r0;

/* JADX INFO: loaded from: classes.dex */
final class FillElement extends r0<g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2433e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.m f2434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2436d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(h0.m.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(h0.m.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(h0.m.Horizontal, f10, "fillMaxWidth");
        }
    }

    public FillElement(h0.m mVar, float f10, String str) {
        this.f2434b = mVar;
        this.f2435c = f10;
        this.f2436d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.f2434b != fillElement.f2434b) {
            return false;
        }
        return (this.f2435c > fillElement.f2435c ? 1 : (this.f2435c == fillElement.f2435c ? 0 : -1)) == 0;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f2434b, this.f2435c);
    }

    @Override // a2.r0
    public int hashCode() {
        return (this.f2434b.hashCode() * 31) + Float.hashCode(this.f2435c);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(g gVar) {
        gVar.a2(this.f2434b);
        gVar.b2(this.f2435c);
    }
}
