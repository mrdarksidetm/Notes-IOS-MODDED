package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class q0 extends j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f1847b;

    public q0(Context context, Resources resources) {
        super(resources);
        this.f1847b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = this.f1847b.get();
        if (drawableA != null && context != null) {
            i0.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
