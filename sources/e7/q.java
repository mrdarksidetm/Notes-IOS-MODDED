package e7;

/* JADX INFO: loaded from: classes.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f10682a;

    static final class a extends ae.s implements zd.a<r> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return !q.this.f10682a.d() ? r.NOT_SUPPORTED : !q.this.f10682a.c() ? r.SUPPORTED : r.ENABLED;
        }
    }

    public q(androidx.core.hardware.fingerprint.a aVar) {
        ae.r.f(aVar, "fingerprintManager");
        this.f10682a = aVar;
    }

    @Override // e7.p
    public r getStatus() {
        return (r) g7.a.a(new a(), r.UNKNOWN);
    }
}
