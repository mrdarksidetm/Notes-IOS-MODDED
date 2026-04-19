package w8;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f22659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22660b;

    public p(Context context) {
        m.k(context);
        Resources resources = context.getResources();
        this.f22659a = resources;
        this.f22660b = resources.getResourcePackageName(t8.n.f21339a);
    }

    public String a(String str) {
        int identifier = this.f22659a.getIdentifier(str, "string", this.f22660b);
        if (identifier == 0) {
            return null;
        }
        return this.f22659a.getString(identifier);
    }
}
