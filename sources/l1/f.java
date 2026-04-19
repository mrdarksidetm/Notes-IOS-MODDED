package l1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f14506b;

    public f(Bitmap bitmap) {
        this.f14506b = bitmap;
    }

    @Override // l1.v0
    public void a() {
        this.f14506b.prepareToDraw();
    }

    @Override // l1.v0
    public int b() {
        return g.e(this.f14506b.getConfig());
    }

    public final Bitmap c() {
        return this.f14506b;
    }

    @Override // l1.v0
    public int getHeight() {
        return this.f14506b.getHeight();
    }

    @Override // l1.v0
    public int getWidth() {
        return this.f14506b.getWidth();
    }
}
