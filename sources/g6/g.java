package g6;

import ae.r;
import android.net.Uri;
import j6.m;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d<String, Uri> {
    @Override // g6.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a(String str, m mVar) {
        Uri uri = Uri.parse(str);
        r.e(uri, "parse(this)");
        return uri;
    }
}
