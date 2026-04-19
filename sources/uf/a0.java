package uf;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21795g;

    public a0() {
    }

    public a0(String str) {
        this.f21795g = str;
    }

    @Override // uf.s
    protected String l() {
        return "literal=" + this.f21795g;
    }

    public String n() {
        return this.f21795g;
    }

    public void o(String str) {
        this.f21795g = str;
    }
}
