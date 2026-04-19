package m9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f15531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f15533c;

    public e(b bVar, String str, String str2) {
        this.f15531a = (b) m.k(bVar);
        this.f15533c = str;
        this.f15532b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f15533c;
        if (str == null) {
            if (eVar.f15533c != null) {
                return false;
            }
        } else if (!str.equals(eVar.f15533c)) {
            return false;
        }
        if (!this.f15531a.equals(eVar.f15531a)) {
            return false;
        }
        String str2 = this.f15532b;
        String str3 = eVar.f15532b;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f15533c;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f15531a.hashCode();
        String str2 = this.f15532b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f15531a.u(), 11));
            if (this.f15531a.x() != c.UNKNOWN) {
                jSONObject.put(DiagnosticsEntry.VERSION_KEY, this.f15531a.x().toString());
            }
            if (this.f15531a.z() != null) {
                jSONObject.put("transports", this.f15531a.z().toString());
            }
            String str = this.f15533c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f15532b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String u() {
        return this.f15532b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 2, z(), i10, false);
        x8.c.C(parcel, 3, x(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f15533c;
    }

    public b z() {
        return this.f15531a;
    }
}
