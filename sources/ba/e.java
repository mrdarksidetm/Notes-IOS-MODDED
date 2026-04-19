package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f5573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f5576k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f5583g;

        private a() {
            this.f5582f = false;
        }

        public e a() {
            if (this.f5577a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f5579c = str;
            this.f5580d = z10;
            this.f5581e = str2;
            return this;
        }

        public a c(String str) {
            this.f5583g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f5582f = z10;
            return this;
        }

        public a e(String str) {
            this.f5578b = str;
            return this;
        }

        public a f(String str) {
            this.f5577a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f5566a = aVar.f5577a;
        this.f5567b = aVar.f5578b;
        this.f5568c = null;
        this.f5569d = aVar.f5579c;
        this.f5570e = aVar.f5580d;
        this.f5571f = aVar.f5581e;
        this.f5572g = aVar.f5582f;
        this.f5575j = aVar.f5583g;
        this.f5576k = null;
    }

    e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7, String str8) {
        this.f5566a = str;
        this.f5567b = str2;
        this.f5568c = str3;
        this.f5569d = str4;
        this.f5570e = z10;
        this.f5571f = str5;
        this.f5572g = z11;
        this.f5573h = str6;
        this.f5574i = i10;
        this.f5575j = str7;
        this.f5576k = str8;
    }

    public static a D() {
        return new a();
    }

    public static e H() {
        return new e(new a());
    }

    public String A() {
        return this.f5569d;
    }

    public String B() {
        return this.f5567b;
    }

    public String C() {
        return this.f5566a;
    }

    public final int E() {
        return this.f5574i;
    }

    public final void F(int i10) {
        this.f5574i = i10;
    }

    public final void G(String str) {
        this.f5573h = str;
    }

    public boolean u() {
        return this.f5572g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, C(), false);
        x8.c.C(parcel, 2, B(), false);
        x8.c.C(parcel, 3, this.f5568c, false);
        x8.c.C(parcel, 4, A(), false);
        x8.c.g(parcel, 5, x());
        x8.c.C(parcel, 6, z(), false);
        x8.c.g(parcel, 7, u());
        x8.c.C(parcel, 8, this.f5573h, false);
        x8.c.s(parcel, 9, this.f5574i);
        x8.c.C(parcel, 10, this.f5575j, false);
        x8.c.C(parcel, 11, this.f5576k, false);
        x8.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5570e;
    }

    public String z() {
        return this.f5571f;
    }

    public final String zzc() {
        return this.f5575j;
    }

    public final String zzd() {
        return this.f5568c;
    }

    public final String zze() {
        return this.f5576k;
    }

    public final String zzf() {
        return this.f5573h;
    }
}
