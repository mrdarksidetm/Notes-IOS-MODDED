package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0227a f9537b = new C0227a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9538c = new v.a(d.b.V_2, null, f7.a.STABLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9539a;

    /* JADX INFO: renamed from: d7.a$a, reason: collision with other inner class name */
    public static final class C0227a {
        private C0227a() {
        }

        public /* synthetic */ C0227a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(null);
        ae.r.f(str, "value");
        this.f9539a = str;
    }

    @Override // d7.v
    public String a() {
        return b();
    }

    public String b() {
        return this.f9539a;
    }
}
