package i2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f12428a;

    public y(x xVar, w wVar) {
        this.f12428a = wVar;
    }

    public y(boolean z10) {
        this(null, new w(z10));
    }

    public final w a() {
        return this.f12428a;
    }

    public final x b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!ae.r.b(this.f12428a, yVar.f12428a)) {
            return false;
        }
        yVar.getClass();
        return ae.r.b(null, null);
    }

    public int hashCode() {
        w wVar = this.f12428a;
        return 0 + (wVar != null ? wVar.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.f12428a + ')';
    }
}
