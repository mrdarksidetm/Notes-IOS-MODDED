package ge;

import ae.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class n {
    public static final void a(boolean z10, Number number) {
        r.f(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + com.amazon.a.a.o.c.a.b.f7490a);
    }

    public static e<Float> b(float f10, float f11) {
        return new d(f10, f11);
    }
}
