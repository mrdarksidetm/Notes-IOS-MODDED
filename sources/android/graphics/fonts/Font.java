package android.graphics.fonts;

import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Font {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(Resources resources, int i10) {
        }

        public /* synthetic */ Builder(ParcelFileDescriptor parcelFileDescriptor) {
        }

        public native /* synthetic */ Font build() throws IOException;

        public native /* synthetic */ Builder setFontVariationSettings(String str);

        public native /* synthetic */ Builder setSlant(int i10);

        public native /* synthetic */ Builder setTtcIndex(int i10);

        public native /* synthetic */ Builder setWeight(int i10);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ FontStyle getStyle();
}
