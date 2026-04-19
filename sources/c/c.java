package c;

import ae.r;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ParcelFileDescriptor b(File file, String str) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        file2.createNewFile();
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file2, 805306368);
        r.e(parcelFileDescriptorOpen, "open(...)");
        return parcelFileDescriptorOpen;
    }
}
