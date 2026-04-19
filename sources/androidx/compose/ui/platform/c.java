package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2878d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2879e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static c f2880f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f2881c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final c a(Locale locale) {
            if (c.f2880f == null) {
                c.f2880f = new c(locale, null);
            }
            c cVar = c.f2880f;
            ae.r.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return cVar;
        }
    }

    private c(Locale locale) {
        i(locale);
    }

    public /* synthetic */ c(Locale locale, ae.j jVar) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f2881c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // b2.a
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f2881c;
            if (breakIterator == null) {
                ae.r.t("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f2881c;
                if (breakIterator2 == null) {
                    ae.r.t("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f2881c;
            if (breakIterator3 == null) {
                ae.r.t("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f2881c;
            if (breakIterator == null) {
                ae.r.t("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f2881c;
                if (breakIterator2 == null) {
                    ae.r.t("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f2881c;
            if (breakIterator3 == null) {
                ae.r.t("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f2881c;
        if (breakIterator == null) {
            ae.r.t("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
