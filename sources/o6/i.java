package o6;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j6.c f16380a = new j6.c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16381a;

        static {
            int[] iArr = new int[k6.e.values().length];
            try {
                iArr[k6.e.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k6.e.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k6.e.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16381a = iArr;
        }
    }

    public static final boolean a(j6.h hVar) {
        int i10 = a.f16381a[hVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new md.q();
            }
            if ((hVar.q().m() != null || !(hVar.K() instanceof k6.d)) && (!(hVar.M() instanceof l6.b) || !(hVar.K() instanceof k6.l) || !(((l6.b) hVar.M()).getView() instanceof ImageView) || ((l6.b) hVar.M()).getView() != ((k6.l) hVar.K()).getView())) {
                return false;
            }
        }
        return true;
    }

    public static final j6.c b() {
        return f16380a;
    }

    public static final Drawable c(j6.h hVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(hVar.l(), num.intValue());
    }
}
