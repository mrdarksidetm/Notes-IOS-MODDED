package y6;

import ae.r;
import android.app.Activity;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jc.a;
import nd.c0;
import nd.u;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements jc.a, kc.a, j.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23428e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sc.j f23429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f23430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.b f23431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kc.c f23432d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private final boolean a() {
        g gVar;
        Log.d("PickOrSavePlugin", "createPickOrSave - IN");
        kc.c cVar = this.f23432d;
        if (cVar != null) {
            r.c(cVar);
            Activity activity = cVar.getActivity();
            r.e(activity, "getActivity(...)");
            gVar = new g(activity);
            kc.c cVar2 = this.f23432d;
            r.c(cVar2);
            cVar2.b(gVar);
        } else {
            gVar = null;
        }
        this.f23430b = gVar;
        Log.d("PickOrSavePlugin", "createPickOrSave - OUT");
        return gVar != null;
    }

    private final void b(kc.c cVar) {
        Log.d("PickOrSavePlugin", "doOnAttachedToActivity - IN");
        this.f23432d = cVar;
        Log.d("PickOrSavePlugin", "doOnAttachedToActivity - OUT");
    }

    private final void c(sc.b bVar) {
        Log.d("PickOrSavePlugin", "doOnAttachedToEngine - IN");
        sc.j jVar = new sc.j(bVar, "pick_or_save");
        this.f23429a = jVar;
        jVar.e(this);
        Log.d("PickOrSavePlugin", "doOnAttachedToEngine - OUT");
    }

    private final void d() {
        Log.d("PickOrSavePlugin", "doOnDetachedFromActivity - IN");
        g gVar = this.f23430b;
        if (gVar != null) {
            kc.c cVar = this.f23432d;
            if (cVar != null) {
                r.c(gVar);
                cVar.d(gVar);
            }
            this.f23430b = null;
        }
        this.f23432d = null;
        Log.d("PickOrSavePlugin", "doOnDetachedFromActivity - OUT");
    }

    private final void e() {
        Log.d("PickOrSavePlugin", "doOnDetachedFromEngine - IN");
        if (this.f23431c == null) {
            Log.w("PickOrSavePlugin", "doOnDetachedFromEngine - already detached");
        }
        this.f23431c = null;
        sc.j jVar = this.f23429a;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
        Log.d("PickOrSavePlugin", "doOnDetachedFromEngine - OUT");
    }

    private final b f(sc.i iVar, String str) {
        if (!iVar.c(str)) {
            return null;
        }
        String str2 = (String) iVar.a(str);
        if (str2 == null) {
            str2 = null;
        }
        if (r.b(str2, "CancelType.filesSaving")) {
            return b.f23367a;
        }
        String str3 = (String) iVar.a(str);
        if (str3 == null) {
            str3 = null;
        }
        if (r.b(str3, "CancelType.directoryDocumentsPicker")) {
            return b.f23368b;
        }
        return null;
    }

    private final List<k> g(sc.i iVar, String str) {
        if (!iVar.c(str)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) iVar.a(str);
        List<Map> listC0 = arrayList != null ? c0.C0(arrayList) : null;
        ArrayList arrayList2 = new ArrayList();
        if (listC0 != null) {
            for (Map map : listC0) {
                arrayList2.add(new k((String) map.get("filePath"), (byte[]) map.get("fileData"), (String) map.get("fileName")));
            }
        }
        return arrayList2;
    }

    private final List<String> h(sc.i iVar, String str) {
        ArrayList arrayList;
        if (!iVar.c(str) || (arrayList = (ArrayList) iVar.a(str)) == null) {
            return null;
        }
        return c0.C0(arrayList);
    }

    private final j i(sc.i iVar) {
        if (!iVar.c("pickerType")) {
            return null;
        }
        String str = (String) iVar.a("pickerType");
        if (str == null) {
            str = null;
        }
        if (r.b(str, "PickerType.file")) {
            return j.f23433a;
        }
        String str2 = (String) iVar.a("pickerType");
        if (str2 == null) {
            str2 = null;
        }
        if (r.b(str2, "PickerType.photo")) {
            return j.f23434b;
        }
        return null;
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        r.f(cVar, "binding");
        Log.d("PickOrSavePlugin", "onAttachedToActivity");
        b(cVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        Log.d("PickOrSavePlugin", "onAttachedToEngine - IN");
        if (this.f23431c != null) {
            Log.w("PickOrSavePlugin", "onAttachedToEngine - already attached");
        }
        this.f23431c = bVar;
        sc.b bVarB = bVar != null ? bVar.b() : null;
        r.c(bVarB);
        c(bVarB);
        Log.d("PickOrSavePlugin", "onAttachedToEngine - OUT");
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        Log.d("PickOrSavePlugin", "onDetachedFromActivity");
        d();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        Log.d("PickOrSavePlugin", "onDetachedFromActivityForConfigChanges");
        d();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        Log.d("PickOrSavePlugin", "onDetachedFromEngine");
        e();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // sc.j.c
    public void onMethodCall(sc.i iVar, j.d dVar) {
        r.f(iVar, "call");
        r.f(dVar, "result");
        Log.d("PickOrSavePlugin", "onMethodCall - IN , method=" + iVar.f20503a);
        if (this.f23430b == null && !a()) {
            dVar.error("init_failed", "Not attached", null);
            return;
        }
        String str = iVar.f20503a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1719005973:
                    if (str.equals("fileMetaData")) {
                        g gVar = this.f23430b;
                        r.c(gVar);
                        gVar.e(dVar, (String) iVar.a("filePath"));
                        return;
                    }
                    break;
                case -1566548947:
                    if (str.equals("uriPermissionStatus")) {
                        g gVar2 = this.f23430b;
                        r.c(gVar2);
                        gVar2.j(dVar, (String) iVar.a("uri"), (Boolean) iVar.a("releasePermission"));
                        return;
                    }
                    break;
                case -1502315403:
                    if (str.equals("urisWithPersistedPermission")) {
                        g gVar3 = this.f23430b;
                        r.c(gVar3);
                        gVar3.k(dVar);
                        return;
                    }
                    break;
                case -1460193578:
                    if (str.equals("pickFiles")) {
                        g gVar4 = this.f23430b;
                        r.c(gVar4);
                        List<String> listH = h(iVar, "allowedExtensions");
                        if (listH == null) {
                            listH = u.m();
                        }
                        List<String> listH2 = h(iVar, "mimeTypesFilter");
                        if (listH2 == null) {
                            listH2 = u.m();
                        }
                        Boolean bool = (Boolean) iVar.a("localOnly");
                        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
                        Boolean bool2 = (Boolean) iVar.a("getCachedFilePath");
                        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
                        j jVarI = i(iVar);
                        if (jVarI == null) {
                            jVarI = j.f23433a;
                        }
                        Boolean bool3 = (Boolean) iVar.a("enableMultipleSelection");
                        gVar4.h(dVar, listH, listH2, zBooleanValue, zBooleanValue2, jVarI, bool3 == null ? true : bool3.booleanValue());
                        return;
                    }
                    break;
                case -1233473735:
                    if (str.equals("directoryDocumentsPicker")) {
                        g gVar5 = this.f23430b;
                        r.c(gVar5);
                        String str2 = (String) iVar.a("documentId");
                        String str3 = (String) iVar.a("directoryUri");
                        Boolean bool4 = (Boolean) iVar.a("recurseDirectories");
                        List<String> listH3 = h(iVar, "allowedExtensions");
                        if (listH3 == null) {
                            listH3 = u.m();
                        }
                        List<String> listH4 = h(iVar, "mimeTypesFilter");
                        if (listH4 == null) {
                            listH4 = u.m();
                        }
                        gVar5.g(dVar, str2, str3, bool4, listH3, listH4);
                        return;
                    }
                    break;
                case 160722682:
                    if (str.equals("saveFiles")) {
                        g gVar6 = this.f23430b;
                        r.c(gVar6);
                        List<k> listG = g(iVar, "saveFiles");
                        List<String> listH5 = h(iVar, "mimeTypesFilter");
                        if (listH5 == null) {
                            listH5 = u.m();
                        }
                        Boolean bool5 = (Boolean) iVar.a("localOnly");
                        gVar6.i(dVar, listG, listH5, bool5 != null ? bool5.booleanValue() : false);
                        return;
                    }
                    break;
                case 161371427:
                    if (str.equals("cancelActions")) {
                        g gVar7 = this.f23430b;
                        r.c(gVar7);
                        gVar7.d(f(iVar, "cancelType"));
                        return;
                    }
                    break;
                case 1068596594:
                    if (str.equals("cacheFilePathFromPath")) {
                        g gVar8 = this.f23430b;
                        r.c(gVar8);
                        gVar8.c(dVar, (String) iVar.a("filePath"));
                        return;
                    }
                    break;
                case 1852134220:
                    if (str.equals("pickDirectory")) {
                        g gVar9 = this.f23430b;
                        r.c(gVar9);
                        gVar9.f(dVar, (String) iVar.a("initialDirectoryUri"));
                        return;
                    }
                    break;
            }
        }
        dVar.notImplemented();
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        r.f(cVar, "binding");
        Log.d("PickOrSavePlugin", "onReattachedToActivityForConfigChanges");
        b(cVar);
    }
}
