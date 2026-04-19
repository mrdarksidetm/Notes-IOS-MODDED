package f6;

import ae.r;
import android.net.Uri;
import j6.m;
import o6.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b<Uri> {
    @Override // f6.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Uri uri, m mVar) {
        if (!r.b(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(j.l(mVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
