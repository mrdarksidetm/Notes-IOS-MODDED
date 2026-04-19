package ya;

import android.net.Uri;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
abstract class g extends d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f23576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23577b;

    g(Uri uri, int i10) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f23576a = uri;
        this.f23577b = i10;
    }

    @Override // ya.d.b
    public final int a() {
        return this.f23577b;
    }

    @Override // ya.d.b
    public final Uri b() {
        return this.f23576a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.b) {
            d.b bVar = (d.b) obj;
            if (this.f23576a.equals(bVar.b()) && this.f23577b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23576a.hashCode() ^ 1000003) * 1000003) ^ this.f23577b;
    }

    public final String toString() {
        return "Pdf{uri=" + this.f23576a.toString() + ", pageCount=" + this.f23577b + "}";
    }
}
