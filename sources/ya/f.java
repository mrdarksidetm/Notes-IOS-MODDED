package ya;

import android.net.Uri;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
abstract class f extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f23575a;

    f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null imageUri");
        }
        this.f23575a = uri;
    }

    @Override // ya.d.a
    public final Uri a() {
        return this.f23575a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.a) {
            return this.f23575a.equals(((d.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23575a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Page{imageUri=" + this.f23575a.toString() + "}";
    }
}
