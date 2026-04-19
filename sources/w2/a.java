package w2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(Context context) {
        x2.a aVarB;
        float f10 = context.getResources().getConfiguration().fontScale;
        if (m.a() || (aVarB = x2.b.f22943a.b(f10)) == null) {
            aVarB = new s(f10);
        }
        return new g(context.getResources().getDisplayMetrics().density, f10, aVarB);
    }
}
