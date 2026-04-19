package rc;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sc.a;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.a<Object> f19256a;

    public interface a {
        void a(boolean z10);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyEvent f19257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Character f19258b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f19257a = keyEvent;
            this.f19258b = ch;
        }
    }

    public e(sc.b bVar) {
        this.f19256a = new sc.a<>(bVar, "flutter/keyevent", sc.e.f20501a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: rc.d
            @Override // sc.a.e
            public final void a(Object obj) throws JSONException {
                e.d(aVar, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z10) {
        HashMap map = new HashMap();
        map.put("type", z10 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(bVar.f19257a.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(bVar.f19257a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(bVar.f19257a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(bVar.f19257a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(bVar.f19257a.getScanCode()));
        map.put("metaState", Integer.valueOf(bVar.f19257a.getMetaState()));
        Character ch = bVar.f19258b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f19257a.getSource()));
        map.put("deviceId", Integer.valueOf(bVar.f19257a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(bVar.f19257a.getRepeatCount()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) throws JSONException {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                cc.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e10);
            }
        }
        aVar.a(z10);
    }

    public void e(b bVar, boolean z10, a aVar) {
        this.f19256a.d(c(bVar, z10), b(aVar));
    }
}
