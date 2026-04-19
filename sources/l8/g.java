package l8;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class g implements a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f14794d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14795a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14797c;

    public g(f fVar) {
        this.f14796b = fVar.f14792a.booleanValue();
        this.f14797c = fVar.f14793b;
    }

    static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f14795a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f14796b);
        bundle.putString("log_session_id", this.f14797c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f14795a;
        return k.b(null, null) && this.f14796b == gVar.f14796b && k.b(this.f14797c, gVar.f14797c);
    }

    public final int hashCode() {
        return k.c(null, Boolean.valueOf(this.f14796b), this.f14797c);
    }
}
