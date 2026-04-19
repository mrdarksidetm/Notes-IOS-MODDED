package xc;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import jc.a;
import kc.c;
import rc.n;
import sc.j;
import sc.l;

/* JADX INFO: loaded from: classes2.dex */
public class a implements jc.a, kc.a, l, n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f23130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PackageManager f23131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f23132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, ResolveInfo> f23133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, j.d> f23134e = new HashMap();

    public a(n nVar) {
        this.f23130a = nVar;
        this.f23131b = nVar.f19376b;
        nVar.b(this);
    }

    private void c() {
        this.f23133d = new HashMap();
        int i10 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : i10 >= 33 ? this.f23131b.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.f23131b.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f23131b).toString();
            this.f23133d.put(str, resolveInfo);
        }
    }

    @Override // rc.n.b
    public void a(String str, String str2, boolean z10, j.d dVar) {
        if (this.f23132c == null) {
            dVar.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map<String, ResolveInfo> map = this.f23133d;
        if (map == null) {
            dVar.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            dVar.error("error", "Text processing activity not found", null);
            return;
        }
        Integer numValueOf = Integer.valueOf(dVar.hashCode());
        this.f23134e.put(numValueOf, dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z10);
        this.f23132c.getActivity().startActivityForResult(intent, numValueOf.intValue());
    }

    @Override // rc.n.b
    public Map<String, String> b() {
        if (this.f23133d == null) {
            c();
        }
        HashMap map = new HashMap();
        for (String str : this.f23133d.keySet()) {
            map.put(str, this.f23133d.get(str).loadLabel(this.f23131b).toString());
        }
        return map;
    }

    @Override // sc.l
    @TargetApi(23)
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f23134e.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        this.f23134e.remove(Integer.valueOf(i10)).success(i11 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // kc.a
    public void onAttachedToActivity(c cVar) {
        this.f23132c = cVar;
        cVar.b(this);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        this.f23132c.d(this);
        this.f23132c = null;
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f23132c.d(this);
        this.f23132c = null;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.f23132c = cVar;
        cVar.b(this);
    }
}
