package k2;

import ae.j;
import j2.d;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14364e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14365f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f14366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BreakIterator f14369d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public b(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f14366a = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f14369d = wordInstance;
        this.f14367b = Math.max(0, i10 - 50);
        this.f14368c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new d(charSequence, i10, i11));
    }
}
