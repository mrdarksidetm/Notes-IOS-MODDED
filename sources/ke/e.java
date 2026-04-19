package ke;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
class e {
    public static final double a(double d10, d dVar, d dVar2) {
        r.f(dVar, "sourceUnit");
        r.f(dVar2, "targetUnit");
        long jConvert = dVar2.b().convert(1L, dVar.b());
        return jConvert > 0 ? d10 * jConvert : d10 / dVar.b().convert(1L, dVar2.b());
    }

    public static final long b(long j10, d dVar, d dVar2) {
        r.f(dVar, "sourceUnit");
        r.f(dVar2, "targetUnit");
        return dVar2.b().convert(j10, dVar.b());
    }

    public static final long c(long j10, d dVar, d dVar2) {
        r.f(dVar, "sourceUnit");
        r.f(dVar2, "targetUnit");
        return dVar2.b().convert(j10, dVar.b());
    }
}
