package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import h3.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0077a {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void b(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void c(Drawable drawable, float f10, float f11) {
        C0077a.e(drawable, f10, f11);
    }

    public static void d(Drawable drawable, int i10, int i11, int i12, int i13) {
        C0077a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean e(Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void f(Drawable drawable, int i10) {
        C0077a.g(drawable, i10);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList) {
        C0077a.h(drawable, colorStateList);
    }

    public static void h(Drawable drawable, PorterDuff.Mode mode) {
        C0077a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T i(Drawable drawable) {
        return drawable instanceof h ? (T) ((h) drawable).b() : drawable;
    }

    public static Drawable j(Drawable drawable) {
        return drawable;
    }
}
