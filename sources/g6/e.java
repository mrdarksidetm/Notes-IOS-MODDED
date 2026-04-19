package g6;

import ae.r;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import j6.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d<Integer, Uri> {
    private final boolean b(int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // g6.d
    public /* bridge */ /* synthetic */ Uri a(Integer num, m mVar) {
        return c(num.intValue(), mVar);
    }

    public Uri c(int i10, m mVar) {
        if (!b(i10, mVar.g())) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + mVar.g().getPackageName() + '/' + i10);
        r.e(uri, "parse(this)");
        return uri;
    }
}
