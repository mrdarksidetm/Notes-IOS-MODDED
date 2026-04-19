package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2918d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2919e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static g f2920f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f2921c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final g a(Locale locale) {
            if (g.f2920f == null) {
                g.f2920f = new g(locale, null);
            }
            g gVar = g.f2920f;
            ae.r.d(gVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return gVar;
        }
    }

    private g(Locale locale) {
        l(locale);
    }

    public /* synthetic */ g(Locale locale, ae.j jVar) {
        this(locale);
    }

    private final boolean i(int i10) {
        return i10 > 0 && j(i10 + (-1)) && (i10 == d().length() || !j(i10));
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        return j(i10) && (i10 == 0 || !j(i10 - 1));
    }

    private final void l(Locale locale) {
        this.f2921c = BreakIterator.getWordInstance(locale);
    }

    @Override // b2.a
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f2921c;
            if (breakIterator == null) {
                ae.r.t("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f2921c;
        if (breakIterator2 == null) {
            ae.r.t("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
    }

    @Override // b2.a
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f2921c;
            if (breakIterator == null) {
                ae.r.t("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f2921c;
        if (breakIterator2 == null) {
            ae.r.t("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f2921c;
        if (breakIterator == null) {
            ae.r.t("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
