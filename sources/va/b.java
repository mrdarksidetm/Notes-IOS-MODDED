package va;

import com.google.android.gms.internal.mlkit_common.zzy;
import com.google.android.gms.internal.mlkit_common.zzz;
import java.util.EnumMap;
import java.util.Map;
import w8.k;
import wa.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f22328e = new EnumMap(xa.a.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f22329f = new EnumMap(xa.a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xa.a f22331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f22332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22333d;

    public String a() {
        return this.f22333d;
    }

    public String b() {
        String str = this.f22330a;
        if (str != null) {
            return str;
        }
        return (String) f22329f.get(this.f22331b);
    }

    public h c() {
        return this.f22332c;
    }

    public String d() {
        String str = this.f22330a;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f22329f.get(this.f22331b)));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f22330a, bVar.f22330a) && k.b(this.f22331b, bVar.f22331b) && k.b(this.f22332c, bVar.f22332c);
    }

    public int hashCode() {
        return k.c(this.f22330a, this.f22331b, this.f22332c);
    }

    public String toString() {
        zzy zzyVarZzb = zzz.zzb("RemoteModel");
        zzyVarZzb.zza("modelName", this.f22330a);
        zzyVarZzb.zza("baseModel", this.f22331b);
        zzyVarZzb.zza("modelType", this.f22332c);
        return zzyVarZzb.toString();
    }
}
