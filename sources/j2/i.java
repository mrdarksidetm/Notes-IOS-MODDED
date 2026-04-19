package j2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f13845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f13846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f13848d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f13849e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BoringLayout.Metrics f13850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13851g;

    public i(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f13845a = charSequence;
        this.f13846b = textPaint;
        this.f13847c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f13851g) {
            this.f13850f = b.f13823a.c(this.f13845a, this.f13846b, s0.j(this.f13847c));
            this.f13851g = true;
        }
        return this.f13850f;
    }

    public final float b() {
        if (!Float.isNaN(this.f13848d)) {
            return this.f13848d;
        }
        Float fValueOf = a() != null ? Float.valueOf(r0.width) : null;
        if (fValueOf == null) {
            CharSequence charSequence = this.f13845a;
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f13846b)));
        }
        if (k.e(fValueOf.floatValue(), this.f13845a, this.f13846b)) {
            fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
        }
        float fFloatValue = fValueOf.floatValue();
        this.f13848d = fFloatValue;
        return fFloatValue;
    }

    public final float c() {
        if (!Float.isNaN(this.f13849e)) {
            return this.f13849e;
        }
        float fC = k.c(this.f13845a, this.f13846b);
        this.f13849e = fC;
        return fC;
    }
}
