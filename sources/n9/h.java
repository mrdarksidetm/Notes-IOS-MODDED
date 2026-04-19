package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends x8.a {
    public static final Parcelable.Creator<h> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<zzbe> f16035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16038d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<zzbe> f16039a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16040b = 5;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f16041c = "";

        public a a(f fVar) {
            w8.m.l(fVar, "geofence can't be null.");
            w8.m.b(fVar instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f16039a.add((zzbe) fVar);
            return this;
        }

        public a b(List<f> list) {
            if (list != null && !list.isEmpty()) {
                for (f fVar : list) {
                    if (fVar != null) {
                        a(fVar);
                    }
                }
            }
            return this;
        }

        public h c() {
            w8.m.b(!this.f16039a.isEmpty(), "No geofence has been added to this request.");
            return new h(this.f16039a, this.f16040b, this.f16041c, null);
        }

        public a d(int i10) {
            this.f16040b = i10 & 7;
            return this;
        }
    }

    h(List<zzbe> list, int i10, String str, String str2) {
        this.f16035a = list;
        this.f16036b = i10;
        this.f16037c = str;
        this.f16038d = str2;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f16035a + ", initialTrigger=" + this.f16036b + ", tag=" + this.f16037c + ", attributionTag=" + this.f16038d + "]";
    }

    public int u() {
        return this.f16036b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f16035a, false);
        x8.c.s(parcel, 2, u());
        x8.c.C(parcel, 3, this.f16037c, false);
        x8.c.C(parcel, 4, this.f16038d, false);
        x8.c.b(parcel, iA);
    }
}
