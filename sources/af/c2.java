package af;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 implements we.b<md.i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2 f748b = new c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x0<md.i0> f749a = new x0<>("kotlin.Unit", md.i0.f15558a);

    private c2() {
    }

    public void a(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        this.f749a.deserialize(eVar);
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, md.i0 i0Var) {
        ae.r.f(fVar, "encoder");
        ae.r.f(i0Var, "value");
        this.f749a.serialize(fVar, i0Var);
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(ze.e eVar) {
        a(eVar);
        return md.i0.f15558a;
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return this.f749a.getDescriptor();
    }
}
