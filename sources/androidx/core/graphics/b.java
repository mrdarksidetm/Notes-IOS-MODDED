package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import n3.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<d<Rect, Rect>> f3312a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
