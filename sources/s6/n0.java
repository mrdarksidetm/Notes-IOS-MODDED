package s6;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f20229d = null;

    public n0(boolean z10, boolean z11, boolean z12) {
        this.f20226a = z10;
        this.f20227b = z11;
        this.f20228c = z12;
    }

    public Long a() {
        return this.f20229d;
    }

    public void b(long j10) {
        this.f20229d = Long.valueOf(j10);
    }

    public boolean c() {
        return f1.a("55251C61AA").contains(f1.b(f1.c("51310364"))) ? (this.f20226a && this.f20227b) ? false : true : !this.f20226a;
    }

    public boolean d() {
        return (this.f20226a && this.f20227b && this.f20228c) ? false : true;
    }
}
