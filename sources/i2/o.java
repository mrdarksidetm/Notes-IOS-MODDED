package i2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f12400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12402c;

    public o(p pVar, int i10, int i11) {
        this.f12400a = pVar;
        this.f12401b = i10;
        this.f12402c = i11;
    }

    public final int a() {
        return this.f12402c;
    }

    public final p b() {
        return this.f12400a;
    }

    public final int c() {
        return this.f12401b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return ae.r.b(this.f12400a, oVar.f12400a) && this.f12401b == oVar.f12401b && this.f12402c == oVar.f12402c;
    }

    public int hashCode() {
        return (((this.f12400a.hashCode() * 31) + Integer.hashCode(this.f12401b)) * 31) + Integer.hashCode(this.f12402c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f12400a + ", startIndex=" + this.f12401b + ", endIndex=" + this.f12402c + ')';
    }
}
