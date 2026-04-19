package af;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ye.f fVar) {
        super(fVar, null);
        ae.r.f(fVar, "primitive");
        this.f753c = fVar.a() + "Array";
    }

    @Override // ye.f
    public String a() {
        return this.f753c;
    }
}
