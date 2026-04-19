package p9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x8.a implements u8.h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f18289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f18291c;

    public b() {
        this(2, 0, null);
    }

    b(int i10, int i11, Intent intent) {
        this.f18289a = i10;
        this.f18290b = i11;
        this.f18291c = intent;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.f18290b == 0 ? Status.f8385f : Status.f8389j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f18289a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.s(parcel, 2, this.f18290b);
        x8.c.A(parcel, 3, this.f18291c, i10, false);
        x8.c.b(parcel, iA);
    }
}
