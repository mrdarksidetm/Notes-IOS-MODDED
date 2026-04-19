package k6;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final <T extends View> l<T> a(T t10, boolean z10) {
        return new g(t10, z10);
    }

    public static /* synthetic */ l b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(view, z10);
    }
}
