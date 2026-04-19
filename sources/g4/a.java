package g4;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.m;
import n3.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f11445b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f11444a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f11446c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f11447d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11448e = 1.0f;

    a(m mVar) {
        g.i(mVar, "rasterizer cannot be null");
        this.f11445b = mVar;
    }

    public final m a() {
        return this.f11445b;
    }

    final int b() {
        return this.f11446c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f11444a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f11444a;
        this.f11448e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f11445b.e();
        this.f11447d = (short) (this.f11445b.e() * this.f11448e);
        short sI = (short) (this.f11445b.i() * this.f11448e);
        this.f11446c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f11444a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
