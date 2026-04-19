package t8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f21307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f21309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21306e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new r();

    public b(int i10) {
        this(i10, null, null);
    }

    b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f21307a = i10;
        this.f21308b = i11;
        this.f21309c = pendingIntent;
        this.f21310d = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    static String C(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean A() {
        return (this.f21308b == 0 || this.f21309c == null) ? false : true;
    }

    public boolean B() {
        return this.f21308b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21308b == bVar.f21308b && w8.k.b(this.f21309c, bVar.f21309c) && w8.k.b(this.f21310d, bVar.f21310d);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(this.f21308b), this.f21309c, this.f21310d);
    }

    public String toString() {
        k.a aVarD = w8.k.d(this);
        aVarD.a("statusCode", C(this.f21308b));
        aVarD.a("resolution", this.f21309c);
        aVarD.a("message", this.f21310d);
        return aVarD.toString();
    }

    public int u() {
        return this.f21308b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21307a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.s(parcel, 2, u());
        x8.c.A(parcel, 3, z(), i10, false);
        x8.c.C(parcel, 4, x(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f21310d;
    }

    public PendingIntent z() {
        return this.f21309c;
    }
}
