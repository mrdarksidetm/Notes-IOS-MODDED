package c5;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l0 f6399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f6400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f6401c;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(a0.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            a0.g(view, f10.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return androidx.core.view.h.o(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            androidx.core.view.h.c0(view, rect);
        }
    }

    static {
        f6399a = Build.VERSION.SDK_INT >= 29 ? new k0() : new j0();
        f6400b = new a(Float.class, "translationAlpha");
        f6401c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f6399a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f6399a.b(view);
    }

    static o0 d(View view) {
        return new n0(view);
    }

    static void e(View view) {
        f6399a.c(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f6399a.d(view, i10, i11, i12, i13);
    }

    static void g(View view, float f10) {
        f6399a.e(view, f10);
    }

    static void h(View view, int i10) {
        f6399a.f(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f6399a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f6399a.h(view, matrix);
    }
}
