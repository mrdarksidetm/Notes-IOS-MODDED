package n8;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16016a;

    public o(String str) {
        this.f16016a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f16016a);
        return bundle;
    }

    public final String b() {
        return this.f16016a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o;
    }

    public final int hashCode() {
        return w8.k.c(o.class);
    }
}
