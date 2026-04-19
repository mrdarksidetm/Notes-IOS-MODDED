package t8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class y extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f21347b;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f21347b = bArr;
    }

    @Override // t8.x
    final byte[] V() {
        return this.f21347b;
    }
}
