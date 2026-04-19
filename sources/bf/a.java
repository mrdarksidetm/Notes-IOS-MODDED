package bf;

import cf.a1;
import cf.b1;
import cf.c1;
import cf.j0;
import cf.k0;
import cf.v0;
import cf.y0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements we.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0138a f5793d = new C0138a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f5794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final df.c f5795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cf.y f5796c;

    /* JADX INFO: renamed from: bf.a$a, reason: collision with other inner class name */
    public static final class C0138a extends a {
        private C0138a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), df.d.a(), null);
        }

        public /* synthetic */ C0138a(ae.j jVar) {
            this();
        }
    }

    private a(f fVar, df.c cVar) {
        this.f5794a = fVar;
        this.f5795b = cVar;
        this.f5796c = new cf.y();
    }

    public /* synthetic */ a(f fVar, df.c cVar, ae.j jVar) {
        this(fVar, cVar);
    }

    @Override // we.f
    public df.c a() {
        return this.f5795b;
    }

    @Override // we.i
    public final <T> String b(we.h<? super T> hVar, T t10) {
        ae.r.f(hVar, "serializer");
        k0 k0Var = new k0();
        try {
            j0.a(this, k0Var, hVar, t10);
            return k0Var.toString();
        } finally {
            k0Var.g();
        }
    }

    public final <T> T c(we.a<? extends T> aVar, h hVar) {
        ae.r.f(aVar, "deserializer");
        ae.r.f(hVar, "element");
        return (T) a1.a(this, hVar, aVar);
    }

    public final <T> T d(we.a<? extends T> aVar, String str) {
        ae.r.f(aVar, "deserializer");
        ae.r.f(str, "string");
        y0 y0Var = new y0(str);
        T t10 = (T) new v0(this, c1.OBJ, y0Var, aVar.getDescriptor(), null).v(aVar);
        y0Var.w();
        return t10;
    }

    public final <T> h e(we.h<? super T> hVar, T t10) {
        ae.r.f(hVar, "serializer");
        return b1.c(this, t10, hVar);
    }

    public final f f() {
        return this.f5794a;
    }

    public final cf.y g() {
        return this.f5796c;
    }
}
