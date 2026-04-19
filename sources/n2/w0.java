package n2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f15904a = new w0();

    private w0() {
    }

    private final FontVariationAxis[] d(h0.d dVar, Context context) {
        w2.d dVarA;
        if (context != null) {
            dVarA = w2.a.a(context);
        } else {
            if (dVar.a()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            dVarA = w2.f.a(1.0f, 1.0f);
        }
        List<h0.a> listB = dVar.b();
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0.a aVar = listB.get(i10);
            arrayList.add(new FontVariationAxis(aVar.c(), aVar.b(dVarA)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    public final Typeface a(AssetManager assetManager, String str, Context context, h0.d dVar) {
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(assetManager, str).setFontVariationSettings(d(dVar, context)).build();
    }

    public final Typeface b(File file, Context context, h0.d dVar) {
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(file).setFontVariationSettings(d(dVar, context)).build();
    }

    public final Typeface c(ParcelFileDescriptor parcelFileDescriptor, Context context, h0.d dVar) {
        if (context == null) {
            return null;
        }
        return new Typeface$Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(dVar, context)).build();
    }
}
