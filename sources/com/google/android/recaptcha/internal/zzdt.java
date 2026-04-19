package com.google.android.recaptcha.internal;

import ae.r;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.v;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {
    public static final /* synthetic */ int zza = 0;
    private static final List zzb = zzf(u.p("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    public static final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        r.c(uri);
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private static final boolean zzd(String str) {
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (v.G(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !r.b("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(nd.v.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
