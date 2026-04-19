package af;

import java.lang.annotation.Annotation;
import java.util.List;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class x0<T> implements we.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final md.l f858c;

    static final class a extends ae.s implements zd.a<ye.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0<T> f860b;

        /* JADX INFO: renamed from: af.x0$a$a, reason: collision with other inner class name */
        static final class C0021a extends ae.s implements zd.l<ye.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x0<T> f861a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0021a(x0<T> x0Var) {
                super(1);
                this.f861a = x0Var;
            }

            public final void a(ye.a aVar) {
                ae.r.f(aVar, "$this$buildSerialDescriptor");
                aVar.h(((x0) this.f861a).f857b);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(ye.a aVar) {
                a(aVar);
                return md.i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, x0<T> x0Var) {
            super(0);
            this.f859a = str;
            this.f860b = x0Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ye.f invoke() {
            return ye.i.b(this.f859a, k.d.f24014a, new ye.f[0], new C0021a(this.f860b));
        }
    }

    public x0(String str, T t10) {
        ae.r.f(str, "serialName");
        ae.r.f(t10, "objectInstance");
        this.f856a = t10;
        this.f857b = nd.u.m();
        this.f858c = md.n.a(md.p.f15570b, new a(str, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(String str, T t10, Annotation[] annotationArr) {
        this(str, t10);
        ae.r.f(str, "serialName");
        ae.r.f(t10, "objectInstance");
        ae.r.f(annotationArr, "classAnnotations");
        this.f857b = nd.o.c(annotationArr);
    }

    @Override // we.a
    public T deserialize(ze.e eVar) {
        int iZ;
        ae.r.f(eVar, "decoder");
        ye.f descriptor = getDescriptor();
        ze.c cVarC = eVar.c(descriptor);
        if (cVarC.x() || (iZ = cVarC.z(getDescriptor())) == -1) {
            md.i0 i0Var = md.i0.f15558a;
            cVarC.d(descriptor);
            return this.f856a;
        }
        throw new we.g("Unexpected index " + iZ);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return (ye.f) this.f858c.getValue();
    }

    @Override // we.h
    public void serialize(ze.f fVar, T t10) {
        ae.r.f(fVar, "encoder");
        ae.r.f(t10, "value");
        fVar.c(getDescriptor()).d(getDescriptor());
    }
}
