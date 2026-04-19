package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f13857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Layout f13859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f13863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f13864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f13865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint.FontMetricsInt f13866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l2.h[] f13868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f13869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final md.l f13870p;

    static final class a extends ae.s implements zd.a<h> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(r0.this.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public r0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, i iVar) {
        boolean z12;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        this.f13855a = z10;
        this.f13856b = z11;
        this.f13857c = iVar;
        this.f13869o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicJ = s0.j(i11);
        Layout.Alignment alignmentA = y.f13900a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, l2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = iVar.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || iVar.b() > f10 || z14) {
                z12 = true;
                this.f13865k = false;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicJ;
                layoutA = v.f13876a.a(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicJ, alignmentA, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f13865k = true;
                z12 = true;
                layoutA = b.f13823a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicJ;
                z13 = false;
            }
            this.f13859e = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.f13860f = iMin;
            int i18 = iMin - 1;
            this.f13858d = (iMin >= i12 && (layoutA.getEllipsisCount(i18) > 0 || layoutA.getLineEnd(i18) != charSequence.length())) ? z12 : z13;
            long jK = s0.k(this);
            l2.h[] hVarArrI = s0.i(this);
            this.f13868n = hVarArrI;
            long jH = s0.h(this, hVarArrI);
            this.f13861g = Math.max(t0.c(jK), t0.c(jH));
            this.f13862h = Math.max(t0.b(jK), t0.b(jH));
            Paint.FontMetricsInt fontMetricsIntG = s0.g(this, textPaint, textDirectionHeuristic, hVarArrI);
            this.f13867m = fontMetricsIntG != null ? fontMetricsIntG.bottom - ((int) r(i18)) : z13;
            this.f13866l = fontMetricsIntG;
            this.f13863i = l2.d.b(layoutA, i18, null, 2, null);
            this.f13864j = l2.d.d(layoutA, i18, null, 2, null);
            this.f13870p = md.n.a(md.p.f15571c, new a());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, i iVar, int i18, ae.j jVar) {
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        this(charSequence, f10, textPaint, i19, truncateAt2, i20, (i18 & 64) != 0 ? 1.0f : f11, (i18 & 128) != 0 ? 0.0f : f12, (i18 & 256) != 0 ? false : z10, (i18 & 512) != 0 ? true : z11, (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i18 & 2048) != 0 ? 0 : i13, (i18 & 4096) != 0 ? 0 : i14, (i18 & 8192) != 0 ? 0 : i15, (i18 & 16384) != 0 ? 0 : i16, (32768 & i18) != 0 ? 0 : i17, (65536 & i18) != 0 ? null : iArr, (131072 & i18) != 0 ? null : iArr2, (i18 & 262144) != 0 ? new i(charSequence, textPaint, i20) : iVar);
    }

    public static /* synthetic */ float A(r0 r0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return r0Var.z(i10, z10);
    }

    public static /* synthetic */ float C(r0 r0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return r0Var.B(i10, z10);
    }

    private final float f(int i10) {
        if (i10 == this.f13860f - 1) {
            return this.f13863i + this.f13864j;
        }
        return 0.0f;
    }

    private final h i() {
        return (h) this.f13870p.getValue();
    }

    public final float B(int i10, boolean z10) {
        return i().c(i10, false, z10) + f(p(i10));
    }

    public final CharSequence D() {
        return this.f13859e.getText();
    }

    public final boolean E() {
        if (this.f13865k) {
            b bVar = b.f13823a;
            Layout layout = this.f13859e;
            ae.r.d(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return bVar.b((BoringLayout) layout);
        }
        v vVar = v.f13876a;
        Layout layout2 = this.f13859e;
        ae.r.d(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return vVar.c((StaticLayout) layout2, this.f13856b);
    }

    public final boolean F(int i10) {
        return this.f13859e.isRtlCharAt(i10);
    }

    public final void G(Canvas canvas) {
        if (canvas.getClipBounds(this.f13869o)) {
            int i10 = this.f13861g;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            q0 q0Var = s0.f13872a;
            q0Var.a(canvas);
            this.f13859e.draw(q0Var);
            int i11 = this.f13861g;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float fD;
        float fE;
        int length = D().length();
        int i13 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (!(i10 < length)) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (!(i11 > i10)) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (!(i11 <= length)) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int iP = p(i10);
        int iP2 = p(i11 - 1);
        e eVar = new e(this);
        if (iP > iP2) {
            return;
        }
        int i14 = iP;
        int i15 = i12;
        while (true) {
            int iU = u(i14);
            int iO = o(i14);
            int iMin = Math.min(i11, iO);
            float fV = v(i14);
            float fK = k(i14);
            int i16 = y(i14) == i13 ? i13 : 0;
            int i17 = i16 ^ 1;
            for (int iMax = Math.max(i10, iU); iMax < iMin; iMax++) {
                boolean zF = F(iMax);
                if (i16 != 0 && !zF) {
                    fD = eVar.b(iMax);
                    fE = eVar.c(iMax + 1);
                } else if (i16 != 0 && zF) {
                    fE = eVar.d(iMax);
                    fD = eVar.e(iMax + 1);
                } else if (i17 == 0 || !zF) {
                    fD = eVar.d(iMax);
                    fE = eVar.e(iMax + 1);
                } else {
                    fE = eVar.b(iMax);
                    fD = eVar.c(iMax + 1);
                }
                fArr[i15] = fD;
                fArr[i15 + 1] = fV;
                fArr[i15 + 2] = fE;
                fArr[i15 + 3] = fK;
                i15 += 4;
            }
            if (i14 == iP2) {
                return;
            }
            i14++;
            i13 = 1;
        }
    }

    public final RectF b(int i10) {
        float fB;
        float fB2;
        float fZ;
        float fZ2;
        int iP = p(i10);
        float fV = v(iP);
        float fK = k(iP);
        boolean z10 = y(iP) == 1;
        boolean zIsRtlCharAt = this.f13859e.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fZ = B(i10, false);
                fZ2 = B(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fZ = z(i10, false);
                fZ2 = z(i10 + 1, true);
            } else {
                fB = B(i10, false);
                fB2 = B(i10 + 1, true);
            }
            float f10 = fZ;
            fB = fZ2;
            fB2 = f10;
        } else {
            fB = z(i10, false);
            fB2 = z(i10 + 1, true);
        }
        return new RectF(fB, fV, fB2, fK);
    }

    public final boolean c() {
        return this.f13858d;
    }

    public final boolean d() {
        return this.f13856b;
    }

    public final int e() {
        return (this.f13858d ? this.f13859e.getLineBottom(this.f13860f - 1) : this.f13859e.getHeight()) + this.f13861g + this.f13862h + this.f13867m;
    }

    public final boolean g() {
        return this.f13855a;
    }

    public final Layout h() {
        return this.f13859e;
    }

    public final float j(int i10) {
        return this.f13861g + ((i10 != this.f13860f + (-1) || this.f13866l == null) ? this.f13859e.getLineBaseline(i10) : v(i10) - this.f13866l.ascent);
    }

    public final float k(int i10) {
        if (i10 != this.f13860f - 1 || this.f13866l == null) {
            return this.f13861g + this.f13859e.getLineBottom(i10) + (i10 == this.f13860f + (-1) ? this.f13862h : 0);
        }
        return this.f13859e.getLineBottom(i10 - 1) + this.f13866l.bottom;
    }

    public final int l() {
        return this.f13860f;
    }

    public final int m(int i10) {
        return this.f13859e.getEllipsisCount(i10);
    }

    public final int n(int i10) {
        return this.f13859e.getEllipsisStart(i10);
    }

    public final int o(int i10) {
        return this.f13859e.getEllipsisStart(i10) == 0 ? this.f13859e.getLineEnd(i10) : this.f13859e.getText().length();
    }

    public final int p(int i10) {
        return this.f13859e.getLineForOffset(i10);
    }

    public final int q(int i10) {
        return this.f13859e.getLineForVertical(i10 - this.f13861g);
    }

    public final float r(int i10) {
        return k(i10) - v(i10);
    }

    public final float s(int i10) {
        return this.f13859e.getLineLeft(i10) + (i10 == this.f13860f + (-1) ? this.f13863i : 0.0f);
    }

    public final float t(int i10) {
        return this.f13859e.getLineRight(i10) + (i10 == this.f13860f + (-1) ? this.f13864j : 0.0f);
    }

    public final int u(int i10) {
        return this.f13859e.getLineStart(i10);
    }

    public final float v(int i10) {
        return this.f13859e.getLineTop(i10) + (i10 == 0 ? 0 : this.f13861g);
    }

    public final int w(int i10) {
        if (this.f13859e.getEllipsisStart(i10) == 0) {
            return i().d(i10);
        }
        return this.f13859e.getEllipsisStart(i10) + this.f13859e.getLineStart(i10);
    }

    public final int x(int i10, float f10) {
        return this.f13859e.getOffsetForHorizontal(i10, f10 + ((-1) * f(i10)));
    }

    public final int y(int i10) {
        return this.f13859e.getParagraphDirection(i10);
    }

    public final float z(int i10, boolean z10) {
        return i().c(i10, true, z10) + f(p(i10));
    }
}
