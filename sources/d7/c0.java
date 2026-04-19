package d7;

import a7.d;
import d7.v;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends v<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9552b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v.a f9553c = new v.a(d.b.V_1, null, f7.a.OPTIMAL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9554a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public c0(boolean z10) {
        super(null);
        this.f9554a = z10;
    }

    @Override // d7.v
    public String a() {
        return String.valueOf(b().booleanValue());
    }

    public Boolean b() {
        return Boolean.valueOf(this.f9554a);
    }
}
