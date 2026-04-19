package d0;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
final class w extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f9303b;

    public w(Context context) {
        super(context);
        this.f9302a = w2.a.a(context).G0(w2.h.m(1));
    }

    public final void a(float f10) {
        float f11 = this.f9303b + f10;
        this.f9303b = f11;
        if (Math.abs(f11) > this.f9302a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f9303b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f9303b = 0.0f;
        super.onPull(f10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f9303b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f9303b = 0.0f;
        super.onRelease();
    }
}
