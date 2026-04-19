package pd;

import ae.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    public static float c(float f10, float... fArr) {
        r.f(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    public static float d(float f10, float... fArr) {
        r.f(fArr, "other");
        for (float f11 : fArr) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}
