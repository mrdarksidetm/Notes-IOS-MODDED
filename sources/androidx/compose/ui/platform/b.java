package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f2877b = new int[2];

    protected final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f2877b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    protected final String d() {
        String str = this.f2876a;
        if (str != null) {
            return str;
        }
        ae.r.t("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f2876a = str;
    }
}
