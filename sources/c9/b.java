package c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f6595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6596b;

    b(int i10, a aVar) {
        this.f6595a = i10;
        this.f6596b = aVar;
    }

    private b(a aVar) {
        this.f6595a = 1;
        this.f6596b = aVar;
    }

    public static b u(a.b bVar) {
        if (bVar instanceof a) {
            return new b((a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f6595a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.A(parcel, 2, this.f6596b, i10, false);
        x8.c.b(parcel, iA);
    }

    public final a.b x() {
        a aVar = this.f6596b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
}
