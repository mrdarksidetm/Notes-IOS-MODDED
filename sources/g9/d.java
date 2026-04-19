package g9;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f11497b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f11498a = null;

    public static c a(Context context) {
        return f11497b.b(context);
    }

    public final synchronized c b(Context context) {
        if (this.f11498a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f11498a = new c(context);
        }
        return this.f11498a;
    }
}
