package j2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f13879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f13882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextDirectionHeuristic f13884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Layout.Alignment f13885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextUtils.TruncateAt f13887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f13889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f13890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f13892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f13893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f13894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f13895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f13896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f13897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f13898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f13899u;

    public x(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f13879a = charSequence;
        this.f13880b = i10;
        this.f13881c = i11;
        this.f13882d = textPaint;
        this.f13883e = i12;
        this.f13884f = textDirectionHeuristic;
        this.f13885g = alignment;
        this.f13886h = i13;
        this.f13887i = truncateAt;
        this.f13888j = i14;
        this.f13889k = f10;
        this.f13890l = f11;
        this.f13891m = i15;
        this.f13892n = z10;
        this.f13893o = z11;
        this.f13894p = i16;
        this.f13895q = i17;
        this.f13896r = i18;
        this.f13897s = i19;
        this.f13898t = iArr;
        this.f13899u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (!(f10 >= 0.0f)) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }

    public final Layout.Alignment a() {
        return this.f13885g;
    }

    public final int b() {
        return this.f13894p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f13887i;
    }

    public final int d() {
        return this.f13888j;
    }

    public final int e() {
        return this.f13881c;
    }

    public final int f() {
        return this.f13897s;
    }

    public final boolean g() {
        return this.f13892n;
    }

    public final int h() {
        return this.f13891m;
    }

    public final int[] i() {
        return this.f13898t;
    }

    public final int j() {
        return this.f13895q;
    }

    public final int k() {
        return this.f13896r;
    }

    public final float l() {
        return this.f13890l;
    }

    public final float m() {
        return this.f13889k;
    }

    public final int n() {
        return this.f13886h;
    }

    public final TextPaint o() {
        return this.f13882d;
    }

    public final int[] p() {
        return this.f13899u;
    }

    public final int q() {
        return this.f13880b;
    }

    public final CharSequence r() {
        return this.f13879a;
    }

    public final TextDirectionHeuristic s() {
        return this.f13884f;
    }

    public final boolean t() {
        return this.f13893o;
    }

    public final int u() {
        return this.f13883e;
    }
}
