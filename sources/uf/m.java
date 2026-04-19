package uf;

/* JADX INFO: loaded from: classes2.dex */
public class m extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21808h;

    public m(String str, String str2) {
        this.f21807g = str;
        this.f21808h = str2;
    }

    @Override // uf.s
    protected String l() {
        return "destination=" + this.f21807g + ", title=" + this.f21808h;
    }
}
