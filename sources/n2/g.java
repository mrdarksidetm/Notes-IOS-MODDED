package n2;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final f a(Context context) {
        return new f(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
