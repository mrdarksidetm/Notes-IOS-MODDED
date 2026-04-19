package l7;

import android.content.Context;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f14774b = Arrays.asList("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f14775a;

    public b(String str) {
        this.f14775a = new androidx.exifinterface.media.a(str);
    }

    public b(byte[] bArr) {
        this.f14775a = new androidx.exifinterface.media.a(new ByteArrayInputStream(bArr));
    }

    private static void a(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2) throws Throwable {
        Iterator<String> it = f14774b.iterator();
        while (it.hasNext()) {
            b(aVar, aVar2, it.next());
        }
        try {
            aVar2.T();
        } catch (IOException unused) {
        }
    }

    private static void b(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2, String str) {
        if (aVar.d(str) != null) {
            aVar2.X(str, aVar.d(str));
        }
    }

    public ByteArrayOutputStream c(Context context, ByteArrayOutputStream byteArrayOutputStream) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        FileOutputStream fileOutputStream;
        try {
            String string = UUID.randomUUID().toString();
            File file = new File(context.getCacheDir(), string + ".jpg");
            fileOutputStream = new FileOutputStream(file);
            try {
                lf.a.e(byteArrayOutputStream.toByteArray(), fileOutputStream);
                fileOutputStream.close();
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(file.getAbsolutePath());
                a(this.f14775a, aVar);
                aVar.T();
                fileOutputStream.close();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                fileInputStream = new FileInputStream(file);
                try {
                    lf.a.a(fileInputStream, byteArrayOutputStream2);
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e10);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return byteArrayOutputStream;
                }
            } catch (Exception e14) {
                fileInputStream = null;
                e10 = e14;
            }
        } catch (Exception e15) {
            fileInputStream = null;
            e10 = e15;
            fileOutputStream = null;
        }
    }
}
