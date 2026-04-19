package n8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class j extends x8.a {
    public static final Parcelable.Creator<j> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f16003a;

    public j(PendingIntent pendingIntent) {
        this.f16003a = (PendingIntent) w8.m.k(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return w8.k.b(this.f16003a, ((j) obj).f16003a);
        }
        return false;
    }

    public int hashCode() {
        return w8.k.c(this.f16003a);
    }

    public PendingIntent u() {
        return this.f16003a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, u(), i10, false);
        x8.c.b(parcel, iA);
    }
}
