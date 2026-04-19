package p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x8.a implements u8.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18293b;

    public h(List list, String str) {
        this.f18292a = list;
        this.f18293b = str;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.f18293b != null ? Status.f8385f : Status.f8389j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f18292a;
        int iA = x8.c.a(parcel);
        x8.c.E(parcel, 1, list, false);
        x8.c.C(parcel, 2, this.f18293b, false);
        x8.c.b(parcel, iA);
    }
}
