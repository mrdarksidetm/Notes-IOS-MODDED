package l1;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static final RectF a(k1.h hVar) {
        return new RectF(hVar.f(), hVar.i(), hVar.g(), hVar.c());
    }

    public static final k1.h b(Rect rect) {
        return new k1.h(rect.left, rect.top, rect.right, rect.bottom);
    }
}
