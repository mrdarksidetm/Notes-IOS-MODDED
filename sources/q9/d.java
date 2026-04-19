package q9;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
