package r8;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19215a = 1;

    public b a(Object obj) {
        this.f19215a = (this.f19215a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f19215a;
    }

    public final b c(boolean z10) {
        this.f19215a = (this.f19215a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
