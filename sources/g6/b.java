package g6;

import ae.r;
import android.net.Uri;
import j6.m;
import java.io.File;
import je.w;
import o6.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d<Uri, File> {
    private final boolean b(Uri uri) {
        if (!j.r(uri)) {
            String scheme = uri.getScheme();
            if (scheme == null || r.b(scheme, "file")) {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (w.H0(path, '/', false, 2, null) && j.i(uri) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g6.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        if (!r.b(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
