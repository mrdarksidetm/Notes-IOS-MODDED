package android.graphics;

import android.util.Size;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageDecoder implements AutoCloseable {

    public /* synthetic */ class ImageInfo {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ Size getSize();
    }

    public /* synthetic */ interface OnHeaderDecodedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ Source createSource(ByteBuffer byteBuffer);

    public static native /* synthetic */ Bitmap decodeBitmap(Source source, OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    public native /* synthetic */ void setAllocator(int i10);

    public native /* synthetic */ void setTargetColorSpace(ColorSpace colorSpace);
}
