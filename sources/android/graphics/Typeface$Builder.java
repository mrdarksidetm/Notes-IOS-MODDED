package android.graphics;

import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import java.io.File;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Typeface$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ Typeface$Builder(AssetManager assetManager, String str) {
    }

    public /* synthetic */ Typeface$Builder(File file) {
    }

    public /* synthetic */ Typeface$Builder(FileDescriptor fileDescriptor) {
    }

    public native /* synthetic */ Typeface build();

    public native /* synthetic */ Typeface$Builder setFontVariationSettings(FontVariationAxis[] fontVariationAxisArr);

    public native /* synthetic */ Typeface$Builder setItalic(boolean z10);

    public native /* synthetic */ Typeface$Builder setWeight(int i10);
}
