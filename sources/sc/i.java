package sc;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20504b;

    public i(String str, Object obj) {
        this.f20503a = str;
        this.f20504b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f20504b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f20504b;
    }

    public boolean c(String str) {
        Object obj = this.f20504b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
