package w7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u7.b f22568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22569b;

    public h(u7.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f22568a = bVar;
        this.f22569b = bArr;
    }

    public byte[] a() {
        return this.f22569b;
    }

    public u7.b b() {
        return this.f22568a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f22568a.equals(hVar.f22568a)) {
            return Arrays.equals(this.f22569b, hVar.f22569b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22568a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22569b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f22568a + ", bytes=[...]}";
    }
}
