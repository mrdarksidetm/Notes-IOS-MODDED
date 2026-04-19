package j2;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f13900a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Layout.Alignment f13901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Layout.Alignment f13902c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (ae.r.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (ae.r.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f13901b = alignment;
        f13902c = alignment2;
    }

    private y() {
    }

    public final Layout.Alignment a(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i10 == 2) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i10 == 3) {
                return f13901b;
            }
            if (i10 == 4) {
                return f13902c;
            }
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
