package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f16390a = new l();

    private l() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, k6.i iVar, k6.h hVar) {
        if (z10) {
            return true;
        }
        return a6.f.c(bitmap.getWidth(), bitmap.getHeight(), k6.b.a(iVar) ? bitmap.getWidth() : j.B(iVar.b(), hVar), k6.b.a(iVar) ? bitmap.getHeight() : j.B(iVar.a(), hVar), hVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, k6.i iVar, k6.h hVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iQ = j.q(drawableMutate);
        if (iQ <= 0) {
            iQ = 512;
        }
        int iJ = j.j(drawableMutate);
        int i10 = iJ > 0 ? iJ : 512;
        double dC = a6.f.c(iQ, i10, k6.b.a(iVar) ? iQ : j.B(iVar.b(), hVar), k6.b.a(iVar) ? i10 : j.B(iVar.a(), hVar), hVar);
        int iC = ce.c.c(((double) iQ) * dC);
        int iC2 = ce.c.c(dC * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, a.e(config));
        ae.r.e(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iC, iC2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }
}
