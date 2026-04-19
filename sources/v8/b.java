package v8;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<O extends a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f22223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.d f22224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22225d;

    private b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f22223b = aVar;
        this.f22224c = dVar;
        this.f22225d = str;
        this.f22222a = w8.k.c(aVar, dVar, str);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f22223b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w8.k.b(this.f22223b, bVar.f22223b) && w8.k.b(this.f22224c, bVar.f22224c) && w8.k.b(this.f22225d, bVar.f22225d);
    }

    public final int hashCode() {
        return this.f22222a;
    }
}
