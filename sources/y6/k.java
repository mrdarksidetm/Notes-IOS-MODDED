package y6;

import ae.r;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f23438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23439c;

    public k(String str, byte[] bArr, String str2) {
        this.f23437a = str;
        this.f23438b = bArr;
        this.f23439c = str2;
    }

    public final byte[] a() {
        return this.f23438b;
    }

    public final String b() {
        return this.f23439c;
    }

    public final String c() {
        return this.f23437a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.deepanshuchaudhary.pick_or_save.SaveFileInfo");
        k kVar = (k) obj;
        return r.b(this.f23437a, kVar.f23437a) && Arrays.equals(this.f23438b, kVar.f23438b) && r.b(this.f23439c, kVar.f23439c);
    }

    public int hashCode() {
        String str = this.f23437a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.f23438b)) * 31;
        String str2 = this.f23439c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SaveFileInfo(filePath=" + this.f23437a + ", fileData=" + Arrays.toString(this.f23438b) + ", fileName=" + this.f23439c + ')';
    }
}
