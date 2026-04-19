package c5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f6543a;

    y(View view) {
        this.f6543a = view.getOverlay();
    }

    @Override // c5.z
    public void a(Drawable drawable) {
        this.f6543a.add(drawable);
    }

    @Override // c5.z
    public void b(Drawable drawable) {
        this.f6543a.remove(drawable);
    }
}
