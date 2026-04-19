package n8;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16015a;

    private n() {
    }

    public static final n c(o oVar) {
        String strB = oVar.b();
        n nVar = new n();
        if (strB != null) {
            nVar.f16015a = w8.m.e(strB);
        }
        return nVar;
    }

    public final n a(String str) {
        this.f16015a = w8.m.e(str);
        return this;
    }

    public final o b() {
        return new o(this.f16015a);
    }
}
