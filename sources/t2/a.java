package t2;

import ae.r;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import l1.g1;
import l1.m;
import l1.v1;
import l1.w1;
import n1.g;
import n1.j;
import n1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f21211a;

    public a(g gVar) {
        this.f21211a = gVar;
    }

    private final Paint.Cap a(int i10) {
        v1.a aVar = v1.f14620a;
        if (!v1.e(i10, aVar.a())) {
            if (v1.e(i10, aVar.b())) {
                return Paint.Cap.ROUND;
            }
            if (v1.e(i10, aVar.c())) {
                return Paint.Cap.SQUARE;
            }
        }
        return Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        w1.a aVar = w1.f14633a;
        if (!w1.e(i10, aVar.b())) {
            if (w1.e(i10, aVar.c())) {
                return Paint.Join.ROUND;
            }
            if (w1.e(i10, aVar.a())) {
                return Paint.Join.BEVEL;
            }
        }
        return Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.f21211a;
            if (r.b(gVar, j.f15736a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gVar instanceof k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((k) this.f21211a).f());
                textPaint.setStrokeMiter(((k) this.f21211a).d());
                textPaint.setStrokeJoin(b(((k) this.f21211a).c()));
                textPaint.setStrokeCap(a(((k) this.f21211a).b()));
                g1 g1VarE = ((k) this.f21211a).e();
                textPaint.setPathEffect(g1VarE != null ? m.a(g1VarE) : null);
            }
        }
    }
}
