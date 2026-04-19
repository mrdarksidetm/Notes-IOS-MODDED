package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2903c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static f f2904d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final f a() {
            if (f.f2904d == null) {
                f.f2904d = new f(null);
            }
            f fVar = f.f2904d;
            ae.r.d(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return fVar;
        }
    }

    private f() {
    }

    public /* synthetic */ f(ae.j jVar) {
        this();
    }

    private final boolean i(int i10) {
        return i10 > 0 && d().charAt(i10 + (-1)) != '\n' && (i10 == d().length() || d().charAt(i10) == '\n');
    }

    private final boolean j(int i10) {
        return d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n');
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
        while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
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
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }
}
