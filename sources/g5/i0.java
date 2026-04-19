package g5;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements WebMessagePayloadBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11467c;

    public i0(String str) {
        this.f11465a = 0;
        this.f11466b = str;
        this.f11467c = null;
    }

    public i0(byte[] bArr) {
        this.f11465a = 1;
        this.f11466b = null;
        this.f11467c = bArr;
    }

    private void a(int i10) {
        if (this.f11465a == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + i10 + ", but type is " + this.f11465a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f11467c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        a(0);
        return this.f11466b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f11465a;
    }
}
