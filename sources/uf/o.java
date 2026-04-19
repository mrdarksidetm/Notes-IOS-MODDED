package uf;

/* JADX INFO: loaded from: classes2.dex */
public class o extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21811h;

    public o() {
    }

    public o(String str, String str2) {
        this.f21810g = str;
        this.f21811h = str2;
    }

    @Override // uf.s
    protected String l() {
        return "destination=" + this.f21810g + ", title=" + this.f21811h;
    }

    public String n() {
        return this.f21810g;
    }
}
