package af;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 extends o1<String> {
    protected abstract String Z(String str, String str2);

    protected String a0(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return fVar.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.o1
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(ye.f fVar, int i10) {
        ae.r.f(fVar, "<this>");
        return c0(a0(fVar, i10));
    }

    protected final String c0(String str) {
        ae.r.f(str, "nestedName");
        String strU = U();
        if (strU == null) {
            strU = "";
        }
        return Z(strU, str);
    }
}
