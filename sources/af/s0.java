package af;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s0 extends p1<String> {
    protected abstract String Z(String str, String str2);

    protected abstract String a0(ye.f fVar, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // af.p1
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String W(ye.f fVar, int i10) {
        ae.r.f(fVar, "<this>");
        return c0(a0(fVar, i10));
    }

    protected final String c0(String str) {
        ae.r.f(str, "nestedName");
        String strV = V();
        if (strV == null) {
            strV = "";
        }
        return Z(strV, str);
    }
}
