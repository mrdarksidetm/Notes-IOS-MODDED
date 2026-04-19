package j0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f13612a;

    public interface a {
        void cancel();
    }

    public interface b {
        a a(int i10, long j10);
    }

    public final a a(int i10, long j10) {
        a aVarA;
        b bVar = this.f13612a;
        return (bVar == null || (aVarA = bVar.a(i10, j10)) == null) ? c.f13613a : aVarA;
    }

    public final void b(b bVar) {
        this.f13612a = bVar;
    }
}
