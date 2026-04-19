package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3156a = (IconCompat) aVar.v(remoteActionCompat.f3156a, 1);
        remoteActionCompat.f3157b = aVar.l(remoteActionCompat.f3157b, 2);
        remoteActionCompat.f3158c = aVar.l(remoteActionCompat.f3158c, 3);
        remoteActionCompat.f3159d = (PendingIntent) aVar.r(remoteActionCompat.f3159d, 4);
        remoteActionCompat.f3160e = aVar.h(remoteActionCompat.f3160e, 5);
        remoteActionCompat.f3161f = aVar.h(remoteActionCompat.f3161f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f3156a, 1);
        aVar.D(remoteActionCompat.f3157b, 2);
        aVar.D(remoteActionCompat.f3158c, 3);
        aVar.H(remoteActionCompat.f3159d, 4);
        aVar.z(remoteActionCompat.f3160e, 5);
        aVar.z(remoteActionCompat.f3161f, 6);
    }
}
