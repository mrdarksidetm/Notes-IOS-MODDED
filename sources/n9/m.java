package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class m extends x8.a implements u8.h {
    public static final Parcelable.Creator<m> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f16056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f16057b;

    public m(Status status, n nVar) {
        this.f16056a = status;
        this.f16057b = nVar;
    }

    @Override // u8.h
    public Status getStatus() {
        return this.f16056a;
    }

    public n u() {
        return this.f16057b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, getStatus(), i10, false);
        x8.c.A(parcel, 2, u(), i10, false);
        x8.c.b(parcel, iA);
    }
}
