package la;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import da.d0;
import da.q;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ma.b<l> f14970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ma.b<pa.i> f14972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f14973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f14974e;

    private f(final Context context, final String str, Set<g> set, ma.b<pa.i> bVar, Executor executor) {
        this((ma.b<l>) new ma.b() { // from class: la.e
            @Override // ma.b
            public final Object get() {
                return f.i(context, str);
            }
        }, set, executor, bVar, context);
    }

    f(ma.b<l> bVar, Set<g> set, Executor executor, ma.b<pa.i> bVar2, Context context) {
        this.f14970a = bVar;
        this.f14973d = set;
        this.f14974e = executor;
        this.f14972c = bVar2;
        this.f14971b = context;
    }

    public static da.c<f> f() {
        final d0 d0VarA = d0.a(y9.a.class, Executor.class);
        return da.c.f(f.class, i.class, j.class).b(q.i(Context.class)).b(q.i(x9.f.class)).b(q.k(g.class)).b(q.j(pa.i.class)).b(q.h(d0VarA)).d(new da.g() { // from class: la.d
            @Override // da.g
            public final Object a(da.d dVar) {
                return f.g(d0VarA, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f g(d0 d0Var, da.d dVar) {
        return new f((Context) dVar.a(Context.class), ((x9.f) dVar.a(x9.f.class)).r(), (Set<g>) dVar.d(g.class), (ma.b<pa.i>) dVar.c(pa.i.class), (Executor) dVar.f(d0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h() {
        String string;
        synchronized (this) {
            l lVar = this.f14970a.get();
            List<m> listC = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < listC.size(); i10++) {
                m mVar = listC.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(DiagnosticsEntry.VERSION_KEY, "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l i(Context context, String str) {
        return new l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j() {
        synchronized (this) {
            this.f14970a.get().g(System.currentTimeMillis(), this.f14972c.get().a());
        }
        return null;
    }

    @Override // la.i
    public Task<String> a() {
        return androidx.core.os.f.a(this.f14971b) ^ true ? Tasks.forResult("") : Tasks.call(this.f14974e, new Callable() { // from class: la.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14965a.h();
            }
        });
    }

    public Task<Void> k() {
        if (this.f14973d.size() > 0 && !(!androidx.core.os.f.a(this.f14971b))) {
            return Tasks.call(this.f14974e, new Callable() { // from class: la.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f14966a.j();
                }
            });
        }
        return Tasks.forResult(null);
    }
}
