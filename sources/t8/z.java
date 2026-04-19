package t8;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class z extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f21348c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f21349b;

    z(byte[] bArr) {
        super(bArr);
        this.f21349b = f21348c;
    }

    @Override // t8.x
    final byte[] V() {
        byte[] bArrW;
        synchronized (this) {
            bArrW = (byte[]) this.f21349b.get();
            if (bArrW == null) {
                bArrW = W();
                this.f21349b = new WeakReference(bArrW);
            }
        }
        return bArrW;
    }

    protected abstract byte[] W();
}
