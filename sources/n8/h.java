package n8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h extends x8.a {
    public static final Parcelable.Creator<h> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f15996a;

    public h(PendingIntent pendingIntent) {
        this.f15996a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return w8.k.b(this.f15996a, ((h) obj).f15996a);
        }
        return false;
    }

    public int hashCode() {
        return w8.k.c(this.f15996a);
    }

    public PendingIntent u() {
        return this.f15996a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, u(), i10, false);
        x8.c.b(parcel, iA);
    }
}
