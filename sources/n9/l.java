package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends x8.a {
    public static final Parcelable.Creator<l> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<LocationRequest> f16052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f16055d;

    l(List<LocationRequest> list, boolean z10, boolean z11, z zVar) {
        this.f16052a = list;
        this.f16053b = z10;
        this.f16054c = z11;
        this.f16055d = zVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, Collections.unmodifiableList(this.f16052a), false);
        x8.c.g(parcel, 2, this.f16053b);
        x8.c.g(parcel, 3, this.f16054c);
        x8.c.A(parcel, 5, this.f16055d, i10, false);
        x8.c.b(parcel, iA);
    }
}
