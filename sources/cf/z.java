package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends ze.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final df.c f7021b;

    public z(a aVar, bf.a aVar2) {
        ae.r.f(aVar, "lexer");
        ae.r.f(aVar2, "json");
        this.f7020a = aVar;
        this.f7021b = aVar2.a();
    }

    @Override // ze.a, ze.e
    public byte A() {
        a aVar = this.f7020a;
        String strS = aVar.s();
        try {
            return je.c0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.a, ze.e
    public short C() {
        a aVar = this.f7020a;
        String strS = aVar.s();
        try {
            return je.c0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.c
    public df.c a() {
        return this.f7021b;
    }

    @Override // ze.a, ze.e
    public int q() {
        a aVar = this.f7020a;
        String strS = aVar.s();
        try {
            return je.c0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.a, ze.e
    public long u() {
        a aVar = this.f7020a;
        String strS = aVar.s();
        try {
            return je.c0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new md.i();
        }
    }

    @Override // ze.c
    public int z(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
