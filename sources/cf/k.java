package cf;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd.k<char[]> f6954a = new nd.k<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6955b;

    protected final void a(char[] cArr) {
        ae.r.f(cArr, "array");
        synchronized (this) {
            if (this.f6955b + cArr.length < i.f6951a) {
                this.f6955b += cArr.length;
                this.f6954a.addLast(cArr);
            }
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    protected final char[] b(int i10) {
        char[] cArrW;
        synchronized (this) {
            cArrW = this.f6954a.w();
            if (cArrW != null) {
                this.f6955b -= cArrW.length;
            } else {
                cArrW = null;
            }
        }
        return cArrW == null ? new char[i10] : cArrW;
    }
}
