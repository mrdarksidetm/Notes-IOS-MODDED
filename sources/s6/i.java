package s6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f20139b;

    public i(String str, String[] strArr) {
        ae.r.f(str, f1.a("5925026D"));
        this.f20138a = str;
        this.f20139b = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return ae.r.b(this.f20138a, iVar.f20138a) && ae.r.b(this.f20139b, iVar.f20139b);
    }

    public int hashCode() {
        int iHashCode = this.f20138a.hashCode() * 31;
        String[] strArr = this.f20139b;
        return iHashCode + (strArr == null ? 0 : Arrays.hashCode(strArr));
    }

    public String toString() {
        return f1.a("67360078AC315B58CC1A5C593430") + this.f20138a + f1.b(f1.c("1B641969A5364A1C")) + Arrays.toString(this.f20139b) + ')';
    }
}
