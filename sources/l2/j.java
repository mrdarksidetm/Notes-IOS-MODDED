package l2;

import ae.r;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f14673k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f14674l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f14679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f14681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14684j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f14675a = f10;
        this.f14676b = i10;
        this.f14677c = f11;
        this.f14678d = i11;
        this.f14679e = f12;
        this.f14680f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f14681g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        r.t("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f14684j) {
            return this.f14683i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f14680f;
    }

    public final int d() {
        if (this.f14684j) {
            return this.f14682h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        float f11;
        int iB;
        int iB2;
        this.f14684j = true;
        float textSize = paint.getTextSize();
        this.f14681g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i12 = this.f14676b;
        if (i12 == 0) {
            f10 = this.f14675a * this.f14679e;
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.f14675a * textSize;
        }
        this.f14682h = k.a(f10);
        int i13 = this.f14678d;
        if (i13 == 0) {
            f11 = this.f14677c * this.f14679e;
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f11 = this.f14677c * textSize;
        }
        this.f14683i = k.a(f11);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f14680f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        iB = -b();
                        fontMetricsInt.ascent = iB;
                    }
                    fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        iB2 = fontMetricsInt.ascent;
                        fontMetricsInt.descent = iB2 + b();
                    }
                    fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        iB = fontMetricsInt.descent - b();
                        fontMetricsInt.ascent = iB;
                    }
                    fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        iB2 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB2;
                        fontMetricsInt.descent = iB2 + b();
                    }
                    fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                    fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
        }
        return d();
    }
}
