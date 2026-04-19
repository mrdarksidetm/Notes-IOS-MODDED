package l8;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f14792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f14793b;

    public f() {
        this.f14792a = Boolean.FALSE;
    }

    public f(g gVar) {
        this.f14792a = Boolean.FALSE;
        g.b(gVar);
        this.f14792a = Boolean.valueOf(gVar.f14796b);
        this.f14793b = gVar.f14797c;
    }

    public final f a(String str) {
        this.f14793b = str;
        return this;
    }
}
