package g6;

import ae.r;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import j6.m;
import java.util.List;
import je.v;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d<Uri, Uri> {
    private final boolean b(Uri uri) {
        if (r.b(uri.getScheme(), "android.resource")) {
            String authority = uri.getAuthority();
            if (!(authority == null || v.v(authority)) && uri.getPathSegments().size() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // g6.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, m mVar) throws PackageManager.NameNotFoundException {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + '/' + identifier);
        r.e(uri2, "parse(this)");
        return uri2;
    }
}
