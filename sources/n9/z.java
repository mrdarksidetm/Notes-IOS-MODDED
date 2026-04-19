package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class z extends x8.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16079c;

    z(String str, String str2, String str3) {
        this.f16079c = str;
        this.f16077a = str2;
        this.f16078b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f16077a, false);
        x8.c.C(parcel, 2, this.f16078b, false);
        x8.c.C(parcel, 5, this.f16079c, false);
        x8.c.b(parcel, iA);
    }
}
