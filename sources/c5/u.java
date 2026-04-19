package c5;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f6541a;

    u(ViewGroup viewGroup) {
        this.f6541a = viewGroup.getOverlay();
    }

    @Override // c5.z
    public void a(Drawable drawable) {
        this.f6541a.add(drawable);
    }

    @Override // c5.z
    public void b(Drawable drawable) {
        this.f6541a.remove(drawable);
    }

    @Override // c5.v
    public void c(View view) {
        this.f6541a.add(view);
    }

    @Override // c5.v
    public void d(View view) {
        this.f6541a.remove(view);
    }
}
