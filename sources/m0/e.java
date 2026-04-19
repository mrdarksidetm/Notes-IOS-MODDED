package m0;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final void a(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
    }
}
