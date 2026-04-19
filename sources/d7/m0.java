package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends v<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9614b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9615c = new v.a(d.b.V_2, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9616a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str) {
        super(null);
        ae.r.f(str, "value");
        this.f9616a = str;
    }

    @Override // d7.v
    public String a() {
        return b();
    }

    public String b() {
        return this.f9616a;
    }
}
