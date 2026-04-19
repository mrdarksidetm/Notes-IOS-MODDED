package na;

import w8.k;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16084a;

    public b(String str) {
        this.f16084a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.b(this.f16084a, ((b) obj).f16084a);
        }
        return false;
    }

    public int hashCode() {
        return k.c(this.f16084a);
    }

    public String toString() {
        return k.d(this).a("token", this.f16084a).toString();
    }
}
