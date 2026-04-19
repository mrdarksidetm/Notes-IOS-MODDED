package m3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class b implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f15308d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f15309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f15310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f15311c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f15312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f15313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f15314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f15315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f15316e;

        /* JADX INFO: renamed from: m3.b$a$a, reason: collision with other inner class name */
        public static class C0349a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f15317a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f15319c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f15320d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f15318b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0349a(TextPaint textPaint) {
                this.f15317a = textPaint;
            }

            public a a() {
                return new a(this.f15317a, this.f15318b, this.f15319c, this.f15320d);
            }

            public C0349a b(int i10) {
                this.f15319c = i10;
                return this;
            }

            public C0349a c(int i10) {
                this.f15320d = i10;
                return this;
            }

            public C0349a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f15318b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f15312a = params.getTextPaint();
            this.f15313b = params.getTextDirection();
            this.f15314c = params.getBreakStrategy();
            this.f15315d = params.getHyphenationFrequency();
            this.f15316e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f15316e = Build.VERSION.SDK_INT >= 29 ? new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(TextPaint textPaint2) {
                }

                public native /* synthetic */ Params build();

                public native /* synthetic */ Builder setBreakStrategy(int i12);

                public native /* synthetic */ Builder setHyphenationFrequency(int i12);

                public native /* synthetic */ Builder setTextDirection(TextDirectionHeuristic textDirectionHeuristic2);
            }.setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f15312a = textPaint2;
            this.f15313b = textDirectionHeuristic;
            this.f15314c = i10;
            this.f15315d = i11;
        }

        public boolean a(a aVar) {
            if (this.f15314c == aVar.b() && this.f15315d == aVar.c() && this.f15312a.getTextSize() == aVar.e().getTextSize() && this.f15312a.getTextScaleX() == aVar.e().getTextScaleX() && this.f15312a.getTextSkewX() == aVar.e().getTextSkewX() && this.f15312a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f15312a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f15312a.getFlags() == aVar.e().getFlags() && this.f15312a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f15312a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f15312a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f15314c;
        }

        public int c() {
            return this.f15315d;
        }

        public TextDirectionHeuristic d() {
            return this.f15313b;
        }

        public TextPaint e() {
            return this.f15312a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f15313b == aVar.d();
        }

        public int hashCode() {
            return n3.c.b(Float.valueOf(this.f15312a.getTextSize()), Float.valueOf(this.f15312a.getTextScaleX()), Float.valueOf(this.f15312a.getTextSkewX()), Float.valueOf(this.f15312a.getLetterSpacing()), Integer.valueOf(this.f15312a.getFlags()), this.f15312a.getTextLocales(), this.f15312a.getTypeface(), Boolean.valueOf(this.f15312a.isElegantTextHeight()), this.f15313b, Integer.valueOf(this.f15314c), Integer.valueOf(this.f15315d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f15312a.getTextSize());
            sb2.append(", textScaleX=" + this.f15312a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f15312a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f15312a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f15312a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f15312a.getTextLocales());
            sb2.append(", typeface=" + this.f15312a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f15312a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f15313b);
            sb2.append(", breakStrategy=" + this.f15314c);
            sb2.append(", hyphenationFrequency=" + this.f15315d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f15310b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f15309a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f15309a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f15309a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f15309a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f15309a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f15311c.getSpans(i10, i11, cls) : (T[]) this.f15309a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f15309a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f15309a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15311c.removeSpan(obj);
        } else {
            this.f15309a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15311c.setSpan(obj, i10, i11, i12);
        } else {
            this.f15309a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f15309a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f15309a.toString();
    }
}
