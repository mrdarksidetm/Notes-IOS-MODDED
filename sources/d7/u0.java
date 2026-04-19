package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends v<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9662b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9663c = new v.a(d.b.V_1, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9664a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public u0(long j10) {
        super(null);
        this.f9664a = j10;
    }

    @Override // d7.v
    public String a() {
        return String.valueOf(b().longValue());
    }

    public Long b() {
        return Long.valueOf(this.f9664a);
    }
}
