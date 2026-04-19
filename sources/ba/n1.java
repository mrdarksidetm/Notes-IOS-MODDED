package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.internal.p002firebaseauthapi.zzao;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends x8.a {
    public static final Parcelable.Creator<n1> CREATOR = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5615c;

    n1(String str, String str2, String str3) {
        this.f5613a = str;
        this.f5614b = str2;
        this.f5615c = str3;
    }

    public static final n1 u(JSONObject jSONObject) {
        return new n1(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static zzal<n1> x(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzal.zza(new ArrayList());
        }
        zzao zzaoVarZzg = zzal.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzaoVarZzg.zza(new n1(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzaoVarZzg.zza();
    }

    public static final JSONObject z(n1 n1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", n1Var.f5613a);
        jSONObject.put("name", n1Var.f5614b);
        jSONObject.put("displayName", n1Var.f5615c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5613a, false);
        x8.c.C(parcel, 2, this.f5614b, false);
        x8.c.C(parcel, 3, this.f5615c, false);
        x8.c.b(parcel, iA);
    }
}
