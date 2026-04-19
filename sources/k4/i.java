package k4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    @Deprecated
    public androidx.fragment.app.n b(Context context, String str, Bundle bundle) {
        return androidx.fragment.app.n.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
