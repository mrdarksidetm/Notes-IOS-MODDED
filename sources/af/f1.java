package af;

import af.d1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1<Element, Array, Builder extends d1<Array>> extends p<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.f f758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(we.b<Element> bVar) {
        super(bVar, null);
        ae.r.f(bVar, "primitiveSerializer");
        this.f758b = new e1(bVar.getDescriptor());
    }

    @Override // af.a
    protected final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // af.a, we.a
    public final Array deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return f(eVar, null);
    }

    @Override // af.p, we.b, we.h, we.a
    public final ye.f getDescriptor() {
        return this.f758b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder a() {
        return k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(Builder builder) {
        ae.r.f(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(Builder builder, int i10) {
        ae.r.f(builder, "<this>");
        builder.b(i10);
    }

    protected abstract Array r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(Builder builder, int i10, Element element) {
        ae.r.f(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // af.p, we.h
    public final void serialize(ze.f fVar, Array array) {
        ae.r.f(fVar, "encoder");
        int iE = e(array);
        ye.f fVar2 = this.f758b;
        ze.d dVarP = fVar.p(fVar2, iE);
        u(dVarP, array, iE);
        dVarP.d(fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Array l(Builder builder) {
        ae.r.f(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(ze.d dVar, Array array, int i10);
}
