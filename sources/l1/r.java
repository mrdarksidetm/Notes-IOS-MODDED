package l1;

import android.graphics.Shader;
import android.os.Build;
import l1.x1;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final Shader.TileMode a(int i10) {
        x1.a aVar = x1.f14638a;
        if (!x1.f(i10, aVar.a())) {
            if (x1.f(i10, aVar.d())) {
                return Shader.TileMode.REPEAT;
            }
            if (x1.f(i10, aVar.c())) {
                return Shader.TileMode.MIRROR;
            }
            if (x1.f(i10, aVar.b()) && Build.VERSION.SDK_INT >= 31) {
                return y1.f14652a.b();
            }
        }
        return Shader.TileMode.CLAMP;
    }
}
