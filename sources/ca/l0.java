package ca;

import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static ba.j0 a(zzags zzagsVar) {
        if (zzagsVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagsVar.zze())) {
            return new ba.r0(zzagsVar.zzd(), zzagsVar.zzc(), zzagsVar.zza(), w8.m.e(zzagsVar.zze()));
        }
        if (zzagsVar.zzb() != null) {
            return new ba.x0(zzagsVar.zzd(), zzagsVar.zzc(), zzagsVar.zza(), (zzahp) w8.m.l(zzagsVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<ba.j0> b(List<zzags> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzags> it = list.iterator();
        while (it.hasNext()) {
            ba.j0 j0VarA = a(it.next());
            if (j0VarA != null) {
                arrayList.add(j0VarA);
            }
        }
        return arrayList;
    }
}
