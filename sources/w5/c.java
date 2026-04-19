package w5;

import ae.r;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final File a(androidx.activity.a aVar, int i10) throws IOException {
        r.f(aVar, "activity");
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        r.e(str, "format(...)");
        File fileCreateTempFile = File.createTempFile("DOCUMENT_SCAN_" + i10 + '_' + str, ".jpg", aVar.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        r.e(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }
}
