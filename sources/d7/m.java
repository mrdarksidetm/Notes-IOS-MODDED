package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class m extends v<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9611b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9612c = new v.a(d.b.V_1, null, f7.a.UNIQUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9613a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(null);
        ae.r.f(str, "value");
        this.f9613a = str;
    }

    @Override // d7.v
    public String a() {
        return b();
    }

    public String b() {
        return this.f9613a;
    }
}
