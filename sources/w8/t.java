package w8;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class t implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f22669b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22670a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22671a;

        /* synthetic */ a(w wVar) {
        }

        public t a() {
            return new t(this.f22671a, null);
        }

        public a b(String str) {
            this.f22671a = str;
            return this;
        }
    }

    /* synthetic */ t(String str, x xVar) {
        this.f22670a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f22670a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return k.b(this.f22670a, ((t) obj).f22670a);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.f22670a);
    }
}
