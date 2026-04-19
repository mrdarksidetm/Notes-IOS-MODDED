package n9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends x8.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f16033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16034c;

    g0(List<String> list, PendingIntent pendingIntent, String str) {
        this.f16032a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f16033b = pendingIntent;
        this.f16034c = str;
    }

    public static g0 u(List<String> list) {
        w8.m.l(list, "geofence can't be null.");
        w8.m.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new g0(list, null, "");
    }

    public static g0 x(PendingIntent pendingIntent) {
        w8.m.l(pendingIntent, "PendingIntent can not be null.");
        return new g0(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.E(parcel, 1, this.f16032a, false);
        x8.c.A(parcel, 2, this.f16033b, i10, false);
        x8.c.C(parcel, 3, this.f16034c, false);
        x8.c.b(parcel, iA);
    }
}
