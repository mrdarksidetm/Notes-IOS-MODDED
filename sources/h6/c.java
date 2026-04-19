package h6;

import ae.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.r0;
import o6.j;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f11834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11836d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11837e = true;

        public a(Context context) {
            this.f11833a = context;
            this.f11834b = j.e(context);
        }

        public final c a() {
            h aVar;
            i gVar = this.f11837e ? new g() : new h6.b();
            if (this.f11836d) {
                double d10 = this.f11834b;
                int iC = d10 > 0.0d ? j.c(this.f11833a, d10) : this.f11835c;
                aVar = iC > 0 ? new f(iC, gVar) : new h6.a(gVar);
            } else {
                aVar = new h6.a(gVar);
            }
            return new e(aVar, gVar);
        }
    }

    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f11840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C0288b f11838c = new C0288b(null);

        @Deprecated
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                r.c(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    r.c(string2);
                    String string3 = parcel.readString();
                    r.c(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new b(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX INFO: renamed from: h6.c$b$b, reason: collision with other inner class name */
        private static final class C0288b {
            private C0288b() {
            }

            public /* synthetic */ C0288b(ae.j jVar) {
                this();
            }
        }

        public b(String str, Map<String, String> map) {
            this.f11839a = str;
            this.f11840b = map;
        }

        public /* synthetic */ b(String str, Map map, int i10, ae.j jVar) {
            this(str, (i10 & 2) != 0 ? r0.e() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f11839a;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f11840b;
            }
            return bVar.a(str, map);
        }

        public final b a(String str, Map<String, String> map) {
            return new b(str, map);
        }

        public final Map<String, String> d() {
            return this.f11840b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (r.b(this.f11839a, bVar.f11839a) && r.b(this.f11840b, bVar.f11840b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f11839a.hashCode() * 31) + this.f11840b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f11839a + ", extras=" + this.f11840b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f11839a);
            parcel.writeInt(this.f11840b.size());
            for (Map.Entry<String, String> entry : this.f11840b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }
    }

    /* JADX INFO: renamed from: h6.c$c, reason: collision with other inner class name */
    public static final class C0289c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f11841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Object> f11842b;

        public C0289c(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f11841a = bitmap;
            this.f11842b = map;
        }

        public final Bitmap a() {
            return this.f11841a;
        }

        public final Map<String, Object> b() {
            return this.f11842b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0289c) {
                C0289c c0289c = (C0289c) obj;
                if (r.b(this.f11841a, c0289c.f11841a) && r.b(this.f11842b, c0289c.f11842b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f11841a.hashCode() * 31) + this.f11842b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f11841a + ", extras=" + this.f11842b + ')';
        }
    }

    C0289c a(b bVar);

    void b(int i10);

    void c(b bVar, C0289c c0289c);
}
