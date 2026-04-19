package l2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f14666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14667g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14668h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14669i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14670j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14672l;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11) {
        this.f14661a = f10;
        this.f14662b = i10;
        this.f14663c = i11;
        this.f14664d = z10;
        this.f14665e = z11;
        this.f14666f = f11;
        boolean z12 = true;
        if (!(0.0f <= f11 && f11 <= 1.0f)) {
            if (!(f11 == -1.0f)) {
                z12 = false;
            }
        }
        if (!z12) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f14661a);
        int iA = iCeil - i.a(fontMetricsInt);
        float fAbs = this.f14666f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) Math.ceil(iA <= 0 ? iA * fAbs : iA * (1.0f - fAbs));
        int i10 = fontMetricsInt.descent;
        int i11 = iCeil2 + i10;
        this.f14669i = i11;
        int i12 = i11 - iCeil;
        this.f14668h = i12;
        if (this.f14664d) {
            i12 = fontMetricsInt.ascent;
        }
        this.f14667g = i12;
        if (this.f14665e) {
            i11 = i10;
        }
        this.f14670j = i11;
        this.f14671k = fontMetricsInt.ascent - i12;
        this.f14672l = i11 - i10;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f14661a, i10, i11, z10, this.f14665e, this.f14666f);
    }

    public final int c() {
        return this.f14671k;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f14662b;
        boolean z11 = i11 == this.f14663c;
        if (z10 && z11 && this.f14664d && this.f14665e) {
            return;
        }
        if (this.f14667g == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f14667g : this.f14668h;
        fontMetricsInt.descent = z11 ? this.f14670j : this.f14669i;
    }

    public final int d() {
        return this.f14672l;
    }

    public final boolean e() {
        return this.f14665e;
    }
}
