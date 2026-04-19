package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class f {

    static class a {
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
