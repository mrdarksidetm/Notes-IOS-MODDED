package a9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f665a;

    public e(PendingIntent pendingIntent) {
        this.f665a = pendingIntent;
    }

    public PendingIntent u() {
        return this.f665a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, u(), i10, false);
        x8.c.b(parcel, iA);
    }
}
