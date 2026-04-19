package a;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import ce.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Bitmap a(Bitmap bitmap, Context context, float f10, boolean z10) {
        r.f(bitmap, "<this>");
        r.f(context, "context");
        if (f10 < 1.0f) {
            return bitmap;
        }
        double dMin = Math.min(f10, 25.0d);
        Bitmap bitmapC = z10 ? c(bitmap) : bitmap;
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapC);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setRadius((float) dMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), bitmap.getConfig());
        r.e(bitmapCreateBitmap, "createBitmap(bitmap.width, bitmap.height, config)");
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        renderScriptCreate.destroy();
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap b(Bitmap bitmap, Context context, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(bitmap, context, f10, z10);
    }

    private static final Bitmap c(Bitmap bitmap) {
        float fMin = Math.min(400.0f / bitmap.getWidth(), 400.0f / bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, c.d(bitmap.getWidth() * fMin), c.d(fMin * bitmap.getHeight()), true);
        r.e(bitmapCreateScaledBitmap, "createScaledBitmap(this, width, height, true)");
        return bitmapCreateScaledBitmap;
    }
}
