package o6;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16412a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static zd.a<Long> f16413b = a.f16414a;

    /* synthetic */ class a extends ae.o implements zd.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16414a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private u() {
    }

    public final long a() {
        return f16413b.invoke().longValue();
    }
}
