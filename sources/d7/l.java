package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class l extends v<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9605b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9606c = new v.a(d.b.V_2, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9607a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public l(int i10) {
        super(null);
        this.f9607a = i10;
    }

    @Override // d7.v
    public String a() {
        return String.valueOf(b().intValue());
    }

    public Integer b() {
        return Integer.valueOf(this.f9607a);
    }
}
