package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {
    public static final <T> T a(bf.a aVar, bf.h hVar, we.a<? extends T> aVar2) {
        ze.e h0Var;
        ae.r.f(aVar, "<this>");
        ae.r.f(hVar, "element");
        ae.r.f(aVar2, "deserializer");
        if (hVar instanceof bf.u) {
            h0Var = new l0(aVar, (bf.u) hVar, null, null, 12, null);
        } else if (hVar instanceof bf.b) {
            h0Var = new n0(aVar, (bf.b) hVar);
        } else {
            if (!(hVar instanceof bf.o ? true : ae.r.b(hVar, bf.s.INSTANCE))) {
                throw new md.q();
            }
            h0Var = new h0(aVar, (bf.w) hVar);
        }
        return (T) h0Var.v(aVar2);
    }

    public static final <T> T b(bf.a aVar, String str, bf.u uVar, we.a<? extends T> aVar2) {
        ae.r.f(aVar, "<this>");
        ae.r.f(str, "discriminator");
        ae.r.f(uVar, "element");
        ae.r.f(aVar2, "deserializer");
        return (T) new l0(aVar, uVar, str, aVar2.getDescriptor()).v(aVar2);
    }
}
