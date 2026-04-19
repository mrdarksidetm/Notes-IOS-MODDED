package l8;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14790b = new c(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f14791a;

    /* synthetic */ c(Bundle bundle, i iVar) {
        this.f14791a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f14791a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return k.a(this.f14791a, ((c) obj).f14791a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f14791a);
    }
}
