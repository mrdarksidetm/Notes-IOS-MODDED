package bf;

import ae.i0;
import java.lang.annotation.Annotation;
import java.util.List;
import ye.f;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    public static final class a implements ye.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final md.l f5838a;

        a(zd.a<? extends ye.f> aVar) {
            this.f5838a = md.n.b(aVar);
        }

        private final ye.f b() {
            return (ye.f) this.f5838a.getValue();
        }

        @Override // ye.f
        public String a() {
            return b().a();
        }

        @Override // ye.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // ye.f
        public int d(String str) {
            ae.r.f(str, "name");
            return b().d(str);
        }

        @Override // ye.f
        public ye.j e() {
            return b().e();
        }

        @Override // ye.f
        public int f() {
            return b().f();
        }

        @Override // ye.f
        public String g(int i10) {
            return b().g(i10);
        }

        @Override // ye.f
        public List<Annotation> getAnnotations() {
            return f.a.a(this);
        }

        @Override // ye.f
        public List<Annotation> h(int i10) {
            return b().h(i10);
        }

        @Override // ye.f
        public ye.f i(int i10) {
            return b().i(i10);
        }

        @Override // ye.f
        public boolean isInline() {
            return f.a.b(this);
        }

        @Override // ye.f
        public boolean j(int i10) {
            return b().j(i10);
        }
    }

    public static final g d(ze.e eVar) {
        ae.r.f(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + i0.b(eVar.getClass()));
    }

    public static final l e(ze.f fVar) {
        ae.r.f(fVar, "<this>");
        l lVar = fVar instanceof l ? (l) fVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + i0.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ye.f f(zd.a<? extends ye.f> aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ze.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ze.f fVar) {
        e(fVar);
    }
}
