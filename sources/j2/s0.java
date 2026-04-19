package j2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q0 f13872a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f13873b = a(0, 0);

    public static final long a(int i10, int i11) {
        return t0.a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(r0 r0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, l2.h[] hVarArr) {
        int iL = r0Var.l() - 1;
        if (r0Var.h().getLineStart(iL) != r0Var.h().getLineEnd(iL)) {
            return null;
        }
        if (!(true ^ (hVarArr.length == 0))) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        l2.h hVar = (l2.h) nd.p.L(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iL == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = v.f13876a.a(spannableString, textPaint, a.e.API_PRIORITY_OTHER, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? f.f13832a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? f.f13832a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? a.e.API_PRIORITY_OTHER : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : r0Var.g(), (2072512 & 16384) != 0 ? true : r0Var.d(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(r0 r0Var, l2.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (l2.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f13873b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2.h[] i(r0 r0Var) {
        if (!(r0Var.D() instanceof Spanned)) {
            return new l2.h[0];
        }
        CharSequence charSequenceD = r0Var.D();
        ae.r.d(charSequenceD, "null cannot be cast to non-null type android.text.Spanned");
        l2.h[] hVarArr = (l2.h[]) ((Spanned) charSequenceD).getSpans(0, r0Var.D().length(), l2.h.class);
        return hVarArr.length == 0 ? new l2.h[0] : hVarArr;
    }

    public static final TextDirectionHeuristic j(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (i10 == 4) {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (i10 == 5) {
                return TextDirectionHeuristics.LOCALE;
            }
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(r0 r0Var) {
        if (r0Var.g() || r0Var.E()) {
            return f13873b;
        }
        TextPaint paint = r0Var.h().getPaint();
        CharSequence text = r0Var.h().getText();
        Rect rectC = n.c(paint, text, r0Var.h().getLineStart(0), r0Var.h().getLineEnd(0));
        int lineAscent = r0Var.h().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : r0Var.h().getTopPadding();
        if (r0Var.l() != 1) {
            int iL = r0Var.l() - 1;
            rectC = n.c(paint, text, r0Var.h().getLineStart(iL), r0Var.h().getLineEnd(iL));
        }
        int lineDescent = r0Var.h().getLineDescent(r0Var.l() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : r0Var.h().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f13873b : a(topPadding, bottomPadding);
    }

    public static final boolean l(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
