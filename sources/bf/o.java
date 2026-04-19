package bf;

import cf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.f f5840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, boolean z10, ye.f fVar) {
        super(null);
        ae.r.f(obj, "body");
        this.f5839a = z10;
        this.f5840b = fVar;
        this.f5841c = obj.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ o(Object obj, boolean z10, ye.f fVar, int i10, ae.j jVar) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    @Override // bf.w
    public String a() {
        return this.f5841c;
    }

    @Override // bf.w
    public boolean d() {
        return this.f5839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return d() == oVar.d() && ae.r.b(a(), oVar.a());
    }

    public final ye.f f() {
        return this.f5840b;
    }

    public int hashCode() {
        return (Boolean.hashCode(d()) * 31) + a().hashCode();
    }

    @Override // bf.w
    public String toString() {
        if (!d()) {
            return a();
        }
        StringBuilder sb2 = new StringBuilder();
        z0.c(sb2, a());
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
