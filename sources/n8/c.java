package n8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x8.a {
    public static final Parcelable.Creator<c> CREATOR = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f15982a;

    public c(PendingIntent pendingIntent) {
        this.f15982a = (PendingIntent) w8.m.k(pendingIntent);
    }

    public PendingIntent u() {
        return this.f15982a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, u(), i10, false);
        x8.c.b(parcel, iA);
    }
}
