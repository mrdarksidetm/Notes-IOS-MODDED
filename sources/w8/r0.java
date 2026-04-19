package w8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f22663f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f22666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22668e;

    public r0(ComponentName componentName, int i10) {
        this.f22664a = null;
        this.f22665b = null;
        m.k(componentName);
        this.f22666c = componentName;
        this.f22667d = 4225;
        this.f22668e = false;
    }

    public r0(String str, String str2, int i10, boolean z10) {
        m.e(str);
        this.f22664a = str;
        m.e(str2);
        this.f22665b = str2;
        this.f22666c = null;
        this.f22667d = 4225;
        this.f22668e = z10;
    }

    public final ComponentName a() {
        return this.f22666c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f22664a == null) {
            return new Intent().setComponent(this.f22666c);
        }
        if (this.f22668e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f22664a);
            try {
                bundleCall = context.getContentResolver().call(f22663f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f22664a)));
            }
        }
        return intent == null ? new Intent(this.f22664a).setPackage(this.f22665b) : intent;
    }

    public final String c() {
        return this.f22665b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k.b(this.f22664a, r0Var.f22664a) && k.b(this.f22665b, r0Var.f22665b) && k.b(this.f22666c, r0Var.f22666c) && this.f22668e == r0Var.f22668e;
    }

    public final int hashCode() {
        return k.c(this.f22664a, this.f22665b, this.f22666c, 4225, Boolean.valueOf(this.f22668e));
    }

    public final String toString() {
        String str = this.f22664a;
        if (str != null) {
            return str;
        }
        m.k(this.f22666c);
        return this.f22666c.flattenToString();
    }
}
