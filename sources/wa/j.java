package wa;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final da.c<?> f22725b = da.c.e(j.class).b(da.q.i(f.class)).b(da.q.i(Context.class)).d(new da.g() { // from class: wa.v
        @Override // da.g
        public final Object a(da.d dVar) {
            return new j((Context) dVar.a(Context.class));
        }
    }).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f22726a;

    public j(Context context) {
        this.f22726a = context;
    }

    public synchronized String a() {
        String string = e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        e().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public synchronized long b(va.b bVar) {
        return e().getLong(String.format("downloading_begin_time_%s", bVar.d()), 0L);
    }

    public synchronized long c(va.b bVar) {
        return e().getLong(String.format("model_first_use_time_%s", bVar.d()), 0L);
    }

    public synchronized void d(va.b bVar, long j10) {
        e().edit().putLong(String.format("model_first_use_time_%s", bVar.d()), j10).apply();
    }

    protected final SharedPreferences e() {
        return this.f22726a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
