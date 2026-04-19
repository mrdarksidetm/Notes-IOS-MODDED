package cd;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import cd.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6804a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6805a;

        static {
            int[] iArr = new int[b.values().length];
            f6805a = iArr;
            try {
                iArr[b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6805a[b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        IMAGE,
        VIDEO
    }

    c(Context context) {
        this.f6804a = context;
    }

    private void h(String str) {
        this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }

    void a() {
        this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    Map<String, Object> b() {
        Set<String> stringSet;
        HashMap map = new HashMap();
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z11 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
            map.put("pathList", new ArrayList(stringSet));
            z10 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            q.a.C0159a c0159a = new q.a.C0159a();
            c0159a.b(sharedPreferences.getString("flutter_image_picker_error_code", ""));
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                c0159a.c(sharedPreferences.getString("flutter_image_picker_error_message", ""));
            }
            map.put("error", c0159a.a());
        } else {
            z11 = z10;
        }
        if (z11) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                map.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? q.c.VIDEO : q.c.IMAGE);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                map.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                map.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            map.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        return map;
    }

    String c() {
        return this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", "");
    }

    void d(q.g gVar) {
        SharedPreferences.Editor editorEdit = this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (gVar.c() != null) {
            editorEdit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(gVar.c().doubleValue()));
        }
        if (gVar.b() != null) {
            editorEdit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(gVar.b().doubleValue()));
        }
        editorEdit.putInt("flutter_image_picker_image_quality", gVar.d().intValue());
        editorEdit.apply();
    }

    void e(Uri uri) {
        this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    void f(ArrayList<String> arrayList, String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f6804a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            editorEdit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            editorEdit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            editorEdit.putString("flutter_image_picker_error_message", str2);
        }
        editorEdit.apply();
    }

    void g(b bVar) {
        String str;
        int i10 = a.f6805a[bVar.ordinal()];
        if (i10 == 1) {
            str = "image";
        } else if (i10 != 2) {
            return;
        } else {
            str = "video";
        }
        h(str);
    }
}
