package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class n implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3873a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f3874b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof m3.b;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.n.b
        boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof m3.b);
        }
    }

    n(Spannable spannable) {
        this.f3874b = spannable;
    }

    n(CharSequence charSequence) {
        this.f3874b = new SpannableString(charSequence);
    }

    private void a() {
        Spannable spannable = this.f3874b;
        if (!this.f3873a && c().a(spannable)) {
            this.f3874b = new SpannableString(spannable);
        }
        this.f3873a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f3874b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f3874b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f3874b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f3874b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3874b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3874b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3874b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f3874b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3874b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3874b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f3874b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3874b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f3874b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3874b.toString();
    }
}
